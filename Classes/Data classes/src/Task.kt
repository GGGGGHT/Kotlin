data class Person(var name: String = "1" ,var age: Int = 1){
//    val customerKey = name.toUpperCase()
//    init {
//        println("First initializer block that prints ${customerKey}")
//    }
//
//    val secondProperty = "Second property: ${name.length}".also(::println)
//
//    init {
//        println("Second initializer block that prints ${name.length}")
//    }
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}

fun main() {
//    comparePeople()
    val person = Person()
    person.age = 19
    person.name = "20"
    println(person)
}