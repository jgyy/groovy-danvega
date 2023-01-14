int four = 4
int eight = 8
int ten = 10
int thirtyFive = 35

// each & eachWithIndex
List favNums = [2, 21, 44, thirtyFive, eight, four]

for (num in favNums) {
    println num
}

favNums.each { ita -> println ita }

for (int i = 0; i < favNums.size(); i++) {
    println "$i:${favNums[i]}"
}

favNums.eachWithIndex { num, idx ->
    println "$idx:$num"
}

// findAll
List days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
List weekend = days.findAll { ita -> ita.startsWith('S') }

println days
println weekend

// collect
List nums = [1, 2, 2, 7, 2, eight, 2, four, 6]

List numsTimesTen = []
nums.each { num ->
    numsTimesTen << num * ten
}

List newTimesTen = nums.collect { num -> num * ten }

println nums
println numsTimesTen
println newTimesTen

// map functions
Map person = [first:'Dan', last:'Vega', email:'danvega@gmail.com']

person.each { entry ->
    println entry
}

person.each { k, v ->
    println "$k:$v"
}

// map | filter | reduce
class Person {

    String name
    int age

}

List<Person> people = [
    new Person(name:'Joe', age:45),
    new Person(name:'Mary', age: thirtyFive),
    new Person(name:'Andrew', age:25)
]

assert people
    .findAll { ita -> ita.age < 40 }
    .collect { ita -> ita.name.toUpperCase() }
    .sort()
    .join(', ') == 'ANDREW, MARY'
