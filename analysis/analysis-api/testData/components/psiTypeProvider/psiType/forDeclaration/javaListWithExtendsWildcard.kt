// FILE: usage.kt
fun usa<caret>ge(j: JavaDeclaration) = j.foo()

// FILE: JavaDeclaration.java

public interface JavaDeclaration {
    List<? extends String> foo();
}
