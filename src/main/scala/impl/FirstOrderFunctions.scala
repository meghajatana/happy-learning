package impl

class FirstOrderFunctions(list: List[Int]) {

  /**
    * Concatenating two lists
  */
  def concatenation(): Unit = {

    println("\n**** List Concatenation ****")
    println("List.concat(list, List(6,7,8) : "+List.concat(list, List(6,7,8)))
    println("List.concat(List(1,2),List(3,4) : "+ List.concat(List(1,2), List(3,4)))
    val listConcatenation = List(1, 2):::List(3, 4, 5)
    println("List(1, 2) ::: List(3, 4, 5) : "+ listConcatenation )
  }


  /**
    * computes length of the list
    * */
  def listLength(): Unit ={
    println("\n**** List Length ****")
  println("list.length : "+list.length)
  }

  /**
    * head and tail operations on list which throws an exception when applied to an empty list
    * */
  def headAndTailOperations(): Unit = {
    println("\n**** Head and Tail Operations ****")
    println("list.head : " + list.head) //returns the first element of a list
    println("list.tail : " + list.tail) //returns the rest of the list except the first element
  }

  /**
    * init and last operations on list which throws an exception when applied to an empty list
    * */
  def initAndLastOperation(): Unit = {
    println("\n**** Init and Last Operation on List ****")
    println("list.init : " + list.init) //returns a list consisting of all elements except the last one
    println("list.last : " + list.last) //returns the last element of a (non-empty) list
  }

  /**
    * reversing the elements of a list
    * */
  def listReversal(): Unit = {
    println("\n**** Reversing the List ****")
    println("list.reverse : " + list.reverse) //
    val comparisonResult = list.reverse.reverse equals list
    println("list.reverse.reverse equals list :" + comparisonResult)
  }

  /**
    * take, drop and splitAt operations on the list
    * */
  def takeDropAndSplitListElements(): Unit = {
    println("\n**** Take, Drop and SplitAt Operation on list ****")
    println("list.take(2)) : " + list.take(2)) //returns the first 2 elements of the list.
    println("list.take(10)) : " + list.take(10)) //returns the all the elements of the list as list.length is smaller than 10.
    println("list drop 2 : " + list drop 2) //returns all elements of the list, except for the first 2 elements.
    println("list drop 10 : " + list drop 10) //returns empty list as list.length is smaller than 10..
    println("list.splitAt(2) : " + list.splitAt(2)) //, returns a pair of two lists, splitting the list at index 2.
  }

  /**
    * Element selection: apply and indices
    * */
  def listElementSelection(): Unit = {
    println("\n**** Element Selection in List ****")
    println("list apply 2 : " + list apply 2) //randomly selects and returns element at index 2 though least common operation for lists
    println("Another way of writing apply\tlist(2) : " + list(2))
    println("list.indices : " + list.indices) //returns a list consisting of all valid indices of a given List.
  }

  /**
    * flatten method takes a list of lists and flattens it out to a single list
    * */
  def listFlattening(): Unit = {
    println("\n**** Flattening of List ****")
    val fruits = List("apple", "orange", "strawberry")
    val vegetables = List("cauliflower", "ladyfinger", "pumpkin")
    val eatables = List(fruits, vegetables)
    println(s"fruits = $fruits\nvegetables = $vegetables\neatables = $eatables")
    println(s"eatables.flatten : ${eatables.flatten}")
  }

/**
  * Zipping lists: zip and unzip
  * */
  def zippingAndUnzipping(): Unit = {
    println("\n**** Zipping and Unzipping of List ****")
    //The zip operation takes two lists and forms a list of pairs where unmatched elements are dropped if lists are of different length.
    val alphabets = List('a', 'b', 'c')
    val alphaWithNumbers = alphabets zip list // alphabets zipped with numbered list where any unmatched elements are dropped
    println("alphabets zip list : " + alphaWithNumbers)
    println("The zip operation takes two lists and forms a list of pairs: ")
    println("list.indices zip list : " + list.indices zip list) //returns vector where list indices paired with list elements.
    println("list.zipWithIndex : " + list.zipWithIndex) //returns list where list indexes are paired with list elements.
    println("" + alphaWithNumbers.unzip) //converts back list of tuples to a tuple of lists
  }

  /**
    * Displaying lists: toString and mkString
    * */
  def stringRepresentation(): Unit = {
    println("\n**** String Representation of List ****")
    println("list.toString : " + list.toString) //returns the canonical string representation of a list
    /** list.mkString(pre, sep, post) involves four operands:
      * 'list' the List to be displayed,
      * 'pre' a prefix string  to be displayed in front of all elements,
      * 'sep' a separator string to be displayed between successive elements, and
      * 'post' a postfix string to be displayed at the end. */
    println("list mkString (\"[\", \",\", \"]\") : " + list.mkString("[", ",", "]")) //displays list elements in a formatted string.
    println("list mkString (\"[\", \"-\", \"]\") : " + list.mkString("[", "-", "]")) //displays list elements in a formatted string.
    val stringBuilder = new StringBuilder
    println("val buf = new StringBuilder")
    println("list addString (buf, \"(\", \";\", \")\") : " + list addString(stringBuilder, "(", ";", ")")) //append the constructed string to a StringBuilder object, rather than returning them as a result.
  }

  /**
    * Converting lists: iterator, toArray, copyToArray
    * */
  def conversionOfList(): Unit = {
    println("\n**** Conversion of List ****")
    println("list.toArray : " + list.toArray) //converts list to Array
    val arr = list.toArray
    println("val arr = list.toArray\n" + arr)
    list copyToArray(arr, 2) //copies all elements of the list to the array arr, beginning with position 2.
    println("list copyToArray (arr, start) : " + arr)
    val it = list.iterator //converts list into an iterator
    println("val it = list.iterator")
    println("it.next : " + it.next) //accessing list elements via an iterator
  }
}
