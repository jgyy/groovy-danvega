// Arithmetic operators

Integer zero = 0
Integer two = 2
Integer three = 3
Integer four = 4
Integer five = 5
Integer ten = 10
assert ten + 1 == 11
assert ten - 1 == 9
assert ten * 2 == 20
assert ten / five == 2
assert ten % 3 == 1
assert ten ** 2 == 100

// The binary arithmetic operators we have seen above are also available in an assignment form:
// += -= *= /= %= **=

Integer a = ten
a += five // a = a + 5
assert a == 15

// Relational operators

assert 1 + 2 == 3
assert three != four

assert two * -1 < 3
assert two <= 2
assert three <= four

assert five > 1
assert five >= -2

// Logical Operators
Boolean t = true
Boolean f = false
assert !f
assert t && t
assert t || f

// Conditional Operators

// Ternary Operator
String s = ''
if (s != null && s.length() > zero) {
    result = 'Found'
} else {
    result = 'Not found'
}

String sa = ''
result = (sa != null && sa.length() > zero) ? 'Found' : 'Not Found'

// Object Operators

// Safe Navigation Operator

// Java
Person p = new Person()
if (p.address != null) {
    String address = p.address
    address.first = '1234 Main'
}

// So Much More
println 'http://groovy-lang.org/operators.html'

Person p1 = new Person(first:'Joe', last:'Vega')
Person p2 = new Person(first:'Dan', last:'Vegab')

List<Person> people = [p1, p2]
println people

List<Person> sorted = people.sort(false /* do not mutate original collection */ )
println sorted
