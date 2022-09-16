def list = [7, 98, 12, 5, 100, 3, 20]
def clonedList = list.clone()
println(clonedList)

//println(assertTrue(list == clonedList))

println(list[2])
println(list.get(2))

println(list[-2])
//println(list.get(-2)) Does not work!

list.add("Oranges")
println(list)

list.set(7, "Apples")
println(list)

list.remove(7)
println(list)

// list.sort(list)
// println(list)
