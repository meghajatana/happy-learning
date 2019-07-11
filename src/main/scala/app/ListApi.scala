package app

import impl.{FirstOrderFunctions, HigherOrderFunctions}

object ListApi extends App {


  val list = List(5, 2, 4, 1, 3)
  val words = List("the", "quick", "brown", "fox")
  print("Let us work with lists\n1) Enter 1 to learn First Order Functions in list\n2) Enter 2 to learn Higher Order Functions in list\nEnter your choice: ")

  val userChoice = scala.io.StdIn.readInt() match {
    case 1 => val firstOrderFunctions = new FirstOrderFunctions(list)
      firstOrderFunctions.concatenation()
      firstOrderFunctions.listLength()
      firstOrderFunctions.headAndTailOperations()
      firstOrderFunctions.initAndLastOperation()
      firstOrderFunctions.listReversal()
      firstOrderFunctions.takeDropAndSplitListElements()
      firstOrderFunctions.listElementSelection()
      firstOrderFunctions.listFlattening()
      firstOrderFunctions.zippingAndUnzipping()
      firstOrderFunctions.stringRepresentation()
      firstOrderFunctions.conversionOfList()

    case 2 => val higherOrderFunctions = new HigherOrderFunctions(list, words)
      higherOrderFunctions.mappingOverLists()
      higherOrderFunctions.listFiltering()
      higherOrderFunctions.predicatesOverLists()
      higherOrderFunctions.foldingLists()
      println("List reversal using fold" + higherOrderFunctions.reverseLeft(list))
      println("List reversal using fold" + higherOrderFunctions.reverseLeft(words))
      higherOrderFunctions.sortingLists()
      higherOrderFunctions.listFromRange()
      higherOrderFunctions.fillingList()
      higherOrderFunctions.tabulation()

    case _ => println("***** Invalid Option *****")
  }

}
