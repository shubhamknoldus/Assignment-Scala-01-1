package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {

    for(x <- 1 until array.length)
      {
        var key = array(x)
        var j = x-1

        while(j >= 0 && array(j) >= key)
        {
          array(j + 1) = array(j)
          j=j-1
        }
        array(j + 1) = key
      }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {

    for (i <- 0 until array.length-1 ) {
      var minElement = i
      for (j <- i + 1 until array.length) {
        if (array(j) <= array(minElement))
          {
            minElement = j

          }
        val swapper = array(i)
        array(i) = array(minElement)
        array(minElement) = swapper

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
