/*
String concat(String... args) {
    args.join('')
}
*/

Closure concat = { String... args ->
    args.join('')
}

String abc = 'abc'
String defstr = 'def'

assert concat(abc, defstr) == 'abcdef'
assert concat(abc, defstr, '123', '456') == 'abcdef123456'
