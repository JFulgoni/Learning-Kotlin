import java.util.*

fun main() {
    println("Hello Word!")

    testNullability()

    testStrings()

    // for val, it simply means the reference is immutable, it does not mean that the object inside is immutable
    // example val of list, the contents of the list can be changed, but the val can't point to another list

    testArrays()

}

private fun testStrings() {
    var trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"

    println("I like to eat $trout and $snapper, but not $haddock")

    var fishname = "salmon"

    when(fishname.length) {
        0 -> println("Length should be greater than 0!")
        in 3..12 -> println("Good fish name!")
        else -> println("Ok fish name...")
    }

}

private fun testNullability() {
    var rainbowColor = "orange"
    rainbowColor = "blue"
    val blackColor = "black"
    var greenColor = null
    var blueColor: Int? = null
    var myList = listOf(null, null) //create a list with null objects
    var list: List<Int?> = listOf(null, null) //same thing with describing the type
    var list2: List<Int>? = null // create null list
    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)
}

private fun testArrays() {
    val mix = arrayOf("fish", 2)
    println(Arrays.toString(mix))

    val array = Array(5) {it * 2} // "it" is index
    println(array.asList())

    var fish = 12
    var plants = 5

    val swarm = listOf(fish, plants)
    for (element in swarm) println(element)

    for((index, element) in swarm.withIndex()) {
        println("Fish at $index is $element")
    }

    val numbers : MutableList<Int> = MutableList(5) {it + 11}
    val stringList = mutableListOf<String>()
    for(i in numbers) stringList.add(i.toString())
    println(stringList)

    for(i in 0..100 step 7) print("$i,")
}