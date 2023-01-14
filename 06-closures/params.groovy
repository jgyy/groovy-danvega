String dan = 'Dan'
String abc = 'abc'
String defstr = 'def'

// implicit parameter
Closure foo = { its ->
    println its
}

foo(dan)

Closure noparams = { ->
    println 'no params...'
}

noparams()

Closure sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello(dan, 'Vega')

// default values
Closure greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet(dan, 'Hello')
greet('Joe')

// var-arg
Closure concat = { String... args ->
    args.join('')
}

println concat(abc, defstr)
println concat(abc, defstr, '123', '456')

Closure someMethod(Closure c) {
    println '...'
    println c.maximumNumberOfParameters
    println c.parameterTypes
    return c
}

Closure someClosure = { int x, int y -> x + y }
someMethod(someClosure)
