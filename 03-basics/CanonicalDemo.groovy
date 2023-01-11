import java.time.LocalDate
import groovy.transform.Canonical

@Canonical
class Customer {

    String first, last
    int age
    LocalDate since
    Collection favItems = ['Food']
    Object object

}

LocalDate d = LocalDate.now()
Object anyObject = new Object()
Customer c1 = new Customer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'], object: anyObject)
Customer c2 = new Customer('Toma', 'Jonesa', 22, d, ['Book', 'Game'], anyObject)
assert c1 == c2
