int zero = 0
int four = 4
int five = 5
int six = 6
int seven = 7
int eight = 8
int nine = 9

List nums = [1, 2, 3, six, seven, nine, four, five, 3, six, eight, nine]
println nums
println nums.class.name

// add | remove | get | clear

nums.push(99)
nums[zero] = 78
nums + seven
nums << 66

nums.pop()
nums.removeAt(zero)

println 'println nums.getAt(0..3)'
println nums[((0..3))]
nums = []

// flatten
nums << [3, four, five]
nums << [1, 2]
println nums
println nums.flatten()

// findAll
println nums.findAll { i -> i == four }
println nums.flatten().findAll { i -> i < five }

// getAt(Range)
nums = nums.flatten()
println nums[((0..4))]

// reverse list
println nums.reverse()

// unique
println nums.unique()

// Java Collections List(LinkedList) (Set,SortedSet)
Set evens = [10, 2, eight, four, 24, 14] as Set
println evens
println evens.class.name

/*
 List Exercise
 ---------------------------------
    Create a list days (Sun - Sat)
    Print out the list
    Print the size of the list
    Remove Saturday from the list
    Add Saturday back by appending it to the list
    Print out the Wednesday using its index

*/

String saturday = 'Saturday'
List days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', saturday]

println days
println days.size()
days.pop()
println days
days << saturday
println days
println days[3]
