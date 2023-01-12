// Working with Strings in Groovy

String c = 'c'
println c.class

String str = 'this is a string'
println str.class

String str2 = 'this is another string'
println str2.class

// string interpolation

String name = 'Dan'
String msg = 'Hello ' + name + '...'
println msg

String msg2 = "Hello ${name}"
println msg2

String msg4 = "We can evaulate expressions here: ${1 + 1}"
println msg4

// multiline strings

String aLargeMsg = """
A
Msg
goes
here and
keeps going ${1 + 1}
"""

println aLargeMsg

// dollar slashy

String folder = $/C:\groovy\dan\foo\bar/$
println folder
