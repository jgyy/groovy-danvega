import java.security.SecureRandom

Closure c = { }

println c.class.name

Closure sayHello = { name ->
    println "Hello, $name"
}

sayHello('Dan')

int four = 4
int ten = 10
List nums = [1, four, 7, four, 30, 2]
nums.each { num ->
    println num
}

// closures are objects & last param

Closure timesEleven(int numa, Closure closure) {
    return closure(numa * 11)
}

Closure itc = { ita -> println ita }
timesEleven(ten, itc)
timesEleven(2) { ita ->
    println ita
}

ten.times { ita ->
    println ita
}

SecureRandom rand = new SecureRandom()

3.times {
    println rand.nextInt()
}
