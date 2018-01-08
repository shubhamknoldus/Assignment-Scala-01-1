package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {

    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for (i <- 0 until array.length) {
      var minElement = i
      for (j <- i + 1 until array.length) {
        if (array(j) <= array(minElement))
          {
            minElement = j

          }
        val swapper = array(i)
        array(i) = array(j)
        array(j) = swapper
      }

    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for (i <- (0 until array.length)) {
      for (j <- (0 until array.length)) {
        if (array(i) < array(j)) {
          val swapper = array(i)
          array(i) = array(j)
          array(j) = swapper
        }
      }
    }
    array
  }

}
