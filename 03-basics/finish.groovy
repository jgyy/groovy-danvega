// if
Boolean t = true
Boolean f = false
if (t) {
    println 'value is true'
}

// false | null | empty strings | empty collections
if (!f) {
    println 'value is false'
}

String name = 'Dan'
if (name) {
    println 'name has a value'
}

String last = ''
if (last) {
    println 'last has a value'
}

// if/else
Integer x = 5
Integer ten = 10
if (x  == ten) {
    println 'x is 10'
} else {
    println 'x is NOT 10'
}

// classic while
Integer i = 1
while (i <= ten) {
    println i
    i++
}

// for in list
List<Integer> list = [1, 2, 3, 4]
for (num in list) {
    println num
}

// closure
list.each { println int }

// switch
Integer myNumber = 1

switch (myNumber) {
    case 1:
        println 'number is 1'
        break
    default:
        println 'we hit the default case'
}
