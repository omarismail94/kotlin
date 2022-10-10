class C<T>(val value: T?)

fun <T> assignable(x: () -> T) {}

fun <V> foo(t: C<out Any>, v: C<out V>) {
    assignable<V?> { v.value }
    if (t == v) {
        // `value: CapturedType(out V)?` <: `value: CapturedType(out Any)?` - same instantiation
        assignable<V?> { <!ARGUMENT_TYPE_MISMATCH!>v.value<!> }
        assignable<V?> { t.value }
    }
}
