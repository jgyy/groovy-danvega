import java.time.LocalDate
import groovy.transform.Immutable

/**
* class Customer
*/
@Immutable
class Customer {

    String first, last
    int age
    LocalDate since
    Collection favItems

}
