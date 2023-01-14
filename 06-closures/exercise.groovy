String cleveland = 'Cleveland'
String dan = 'Dan'
String hello = 'Hello'
String nyc = 'New York City'

/*
Closure Basics
-------------------
- Locate the class java.lang.Closure and spend a few minutes looking through documentation.
- Create a Method that accepts a closure as an argument
- Create a closure that performs some action
- Call the method and pass the closure to it.
- Create a list and use the each to iterate over each item in the list and print it out
    Hint - You can use the implicit it or use your own variable
- Create a map of data and iterate over it using the each method.
    This method can take a closure that accepts 1 or 2 arguments.
    Use 2 arguments and print out the key and value on each line.
- Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture.
*/

Closure mymethod(Closure c) {
    return c()
}

Closure foo = {
    println 'foo...'
}

mymethod(foo)

List names = ['Dan Vega', 'Joe Vega', 'Andy Vega', 'Katie Vega']
names.each { name ->
    println name
}

Map teams = [baseball:'Cleveland Indians', basketball:'Cleveland Cavs', football:'Cleveland Browns']
teams.each { k, v ->
    println "$k = $v"
}

Closure greet = { String greeting, String name ->
    println "$greeting, $name"
}

greet(hello, dan)
Closure sayHello = greet.curry(hello)
sayHello('Joe')

/*
Explore the GDK
----------------------
- Search for the find and findAll methods.
    What is the difference between the two?
    Write some code to show how they both work.
- Search for the any and every methods.
    What is the difference between the two?
    Write some code to show how they both work.
- Search for the method groupBy that accepts a closure
    What does this method do?
    Write an example of how to use this method.
*/

List people = [
    [name:'Jane', city: nyc],
    [name:'John', city: cleveland],
    [name:'Mary', city: nyc],
    [name: dan, city: cleveland],
    [name:'Tom', city: nyc],
    [name:'Frank', city: nyc],
    [name:'Jason', city: cleveland]
]

println people.find { person -> person.city == cleveland }
println people.findAll { person -> person.city == cleveland }

println people.any { person -> person.city == cleveland }
println people.every { person -> person.city == cleveland }
println people.every { person -> person.name.size() >= 3 }

Map peopleByCity = people.groupBy { person -> person.city }
println peopleByCity
List newyorkers = peopleByCity[nyc]
println newyorkers
List clevelanders = peopleByCity.Cleveland

clevelanders.each { its ->
    println its.name
}
