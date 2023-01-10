/**
* Person.groovy
*/
class Person {

    String first
    String last

    Person(String first, String last) {
        this.first = first
        this.last = last
    }

    @Override
    String toString() {
        return "Person: $first $last"
    }

}
