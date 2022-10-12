fun  printSome(collection: List<Int>) {
    collection.forEach{el -> println("$el")}
}

fun main(args: Array<String>) {

    val collection: ArrayList<Int> = arrayListOf()

    for(el in 1..10)
        collection.add(el)

    printSome(collection)

  
}


