Map mapb = [:]
println mapb
println mapb.getClass().name

String email = 'danvega@gmail.com'
String username = '@therealdanvega'
Map person = [first:'Dan', last:'Vega', email: email]
println person.getClass()
println person
println person.first

person.twitter = username
println person

String emailKey = 'EmailAddress'
Map twitter = [username: username, (emailKey): email]
println twitter.getClass()

println person.size()
println person.sort()

// looping through person
for (entry in person) {
    println entry
}

for (key in person.keySet()) {
    println "$key:${person[key]}"
}

// each | eachWithIndex

/*
    Maps

    Create a map of days of the week
        1: Sunday, 2:Monday, etc...
    Print out the map
    Print out the class name of the map
    Print the size of the map
    Is there a method that would easily print out all of the days (values)?
    Without closures you may have to look at the Java API for LinkedHashMap
*/

Map map = [1:'Sunday', 2:'Monday', 3:'Tuesday', 4:'Wednesday', 5:'Thursday', 6:'Friday', 7:'Saturday']

println map
println map.getClass().name
println map.size()
println map.values()
