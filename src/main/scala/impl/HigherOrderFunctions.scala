package impl

class HigherOrderFunctions(list: List[Int], words: List[String]) {

  println("val list = " + list)
  println("val words = " + words)

  /**
    * Mapping over lists: map, flatMap and foreach
    * */
  def mappingOverLists(): Unit = {
    println("\n**** Mapping Over List ****")
    //map returns the list that results from applying the function f to each list element in List().
    println("words map (_.length) : " + words.map(_.length)) //returns list containing length of each element of the list "words".
    println("words map (_.toList) : " + words.map(_.toList)) //returns list containing reverse of each element of the list
    println("list.map(_ + 1) : " + list.map(_ + 5)) //returns list by adding 5 to each element of the list.
    //flatMap applies the function to each list element and returns the concatenation of all function results.
    println("words flatMap (_.toList) : "+words.flatMap(_.toList))//converts each element into list which then flattens the list of lists.
    println("List.range(1, 5).flatMap(i => List.range(1, i).map(j => (i, j))) : "+ List.range(1, 5).flatMap (i => List.range(1, i).map(j => (i, j))))
    //flattens list of lists of tuples
  }

  /**
    * Filtering lists: filter, partition, find, takeWhile, dropWhile, and span
    */
  def listFiltering(): Unit ={
    println("\n**** Filtering of List ****")
    println("list filter (_ % 2 == 0) : "+list.filter (_ % 2 == 0))// returns list of all elements in list which are divisible by 2.
    println("words filter (_.length == 3) : "+words.filter(_.length == 3)) // returns list of elements whose length is greater than 3.
    println("partition: " + list.partition(f => f % 2 == 0)) // returns a pair of list in which first list contains elements that are divisible by 2
    // and second list contain elements that are not divisible by 2
    println("list find (_ % 2 == 0) : "+list.find(_ % 2 == 0)) //returns option value containing the first element that is divisible by 2.
    println("list find (_ <= 0) : "+list.find(_ <= 0)) //returns the option value containing first element that is less than or equal to 0.
    println("list takeWhile (_ %2==0) : "+list takeWhile (_ %2==0)) //the longest prefix of list such that every element in the prefix is divisible by 2.
    println("words dropWhile (_ startsWith \"t\") : "+ words.dropWhile(_ startsWith "t")) //removes the longest prefix from list such that every element in the prefix starts with t.
    println("span " + list.span(f => f % 2 == 0)) //returns a pair of two lists, first list contains longest prefix of list that are divisible by 2 and second list contains the list of elements that are not in first list.
  }

  /**
    * Predicates over lists: forall and exists
    */
  def predicatesOverLists(): Unit = {
    println("\n**** Predicates over List ****")
    println("list.forall(f=>f%2==0) : " + list.forall(f => f % 2 == 0)) //true if all elements in the list are divisible by 2
    println("list.exists(f=>f%2==0) : " + list.exists(f => f % 2 == 0)) //true if there exists atleast one element in the list that is divisible by 2
  }

  /**
    * Folding lists: /: and :\
    */
  def foldingLists(): Unit = {
    println("\n**** Folding of List ****")
    println("Fold Left using + operator (0/:list) (_+_) : " + (0 /: list) (_ + _)) //returns the integer value by applying + between successive elements of the list prefixed by 0.
    println("Fold Left using - operator (0/:list) (_-_) : " + (0 /: list) (_ - _))
    println("Fold Left by concatenating spaces (\"\" /: words) (_ + \" \" + _)" + ("" /: words) (_ + " " + _)) //concatenates all words in a list of strings with spaces between them and in front
    println("Fold Right using + operator (list:\\0)(_+_) : " + (list :\ 0) (_ + _))
    println("Fold Right using - operator (list:\\0)(_-_) : " + (list :\ 0) (_ - _))
    println("Fold Right by concatenating spaces (words :\\ \" \") (_ + \" \" + _)" + (words :\ " ") (_ + " " + _)) //concatenates all words in a list of strings with spaces between them and in the end
  }

  /**List Reversal using Fold
    * @param xs list that is to be reversed
    * @tparam T type of elements list contains
    * @return reversed list
    */
  def reverseLeft[T](xs: List[T]): List[T] ={
    println("\n**** Reversing of List using foldLeft****")
    (List[T]() /: xs) {(ys, y) => y :: ys}
  }

  /**
    * Sorting lists: sortWith
    */
  def sortingLists(): Unit = {
    println("\n**** Sorting of List ****")
    println("list.sortWith(_ < _)" + list.sortWith(_ < _)) //returns list that is sorted in increasing order.
    println("words.sortWith(_.length > _.length) " + words.sortWith(_.length > _.length)) //returns list that is sorted in decreasing order of their length.
  }

  /** Creating a range of numbers: List.range
  [Note:List.range is a utility method that creates a list of all integers in some range]
  the last statement generates the List of integer from 1 until 5 which maps the list and generates List of integers from
  1 until i (each element of the mapped list) which is then mapped to generate list of tuples (i, j) where
  i is the element of the outside list and j is changes from each element of List.range(1,i)
    */
  def listFromRange(): Unit = {
    println("\n**** Creating List from Range ****")
    println("List.range(1, 5) : " + List.range(1, 5)) //creates a list of all numbers starting at 1 and going up to 5 minus one.
    println("List.range(1, 9, 2) : " + List.range(1, 9, 2)) //yields list whose elements are 2 values apart, starting at 1 and going up to 9 minus one.
  }

  /**
    * Creating uniform lists: List.fill
    */
  def fillingList(): Unit = {
    println("\n**** Filling List from Range ****")
    println("List.fill(5)('a') : " + List.fill(5)('a')) //creates a list consisting of 5 copies of the 'a'.
    println("List.fill(2, 3)('b') : " + List.fill(2, 3)('b')) //creates multi-dimensional lists that is list of 2 lists that contains 3 copies of 'b'.
  }

  /**
    * Tabulating a function: List.tabulate
    */
  def tabulation(): Unit = {
    println("\n**** Tabulating a Function in List ****")
    println("List.tabulate(5)(n => n * n) : " + List.tabulate(5)(n => n * n)) //returns a list whose elements are computed by applying n*n function where n resembles list element.
    println("List.tabulate(5,5)(_ * _) : " + List.tabulate(5, 5)(_ * _)) //returns a list whose elements are computed by applying _*_ function.
  }

}
