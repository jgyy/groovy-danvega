import java.time.LocalDate
import org.apache.commons.lang3.text.WordUtils

// create a new instance of a developer
Developer d = new Developer()
d.first = 'Dan'
d.last = 'Vega'

// assign some languages
d.languages << 'Groovy'
d.languages << 'Java'

// call some methods
d.work()

LocalDate e = LocalDate.now()
Customer c1 = new Customer(first:'Tom', last:'Jones', age:21, since:e, favItems:['Books', 'Games'])
println c1

@Grapes(
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.4')
)

String name = "Daniel Anthony Vega"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)
