/**
* Person.groovy
*/
@CompileDynamic
class Person {

    String first
    String last

    Person(String first, String last) {
        this.first = first
        this.last = last
    }

    String toString() {
        return "Person: $first $last"
    }

}
