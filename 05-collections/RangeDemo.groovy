import java.time.LocalDate

Range r = 1..10
println r
println r.class.name
println r.from
println r.to

int zero = 0
int ten = 10
assert (zero..ten).contains(zero)
assert (zero..ten).contains(ten)
assert (zero..ten).contains(-1) == false
assert (zero..ten).contains(11) == false

assert (zero..<ten).contains(zero)
assert (zero..<ten).contains(ten) == false

LocalDate today = LocalDate.now()
LocalDate oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
println letters
