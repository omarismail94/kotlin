// MODULE: dependency
// MODULE_KIND: LibraryBinary
// FILE: Foo.kt
class Foo {
    private fun bar() { }
}

// MODULE: main(dependency)
// FILE: main.kt
fun foo() {
    p<caret>rintln()
}

// callable: /Foo.bar
