package edu.knoldus

class Searching {

  def binarySearchCaller(array: Array[Int], elem: Int): Boolean = {
    return binarySearch(array, 0, array.length - 1,elem)
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    var flag :Boolean=false
    for(x<-array)
    {
      if(x==elem)
      {
        flag=true
      }
    }

    flag
  }
  def binarySearch(array: Array[Int], start: Int, end: Int, elementToBeSearched: Int): Boolean =
  {
    if(end >= start)
      {
        val mid: Int = start + (end - start)/2

        if(array(mid) == elementToBeSearched)
          {
            return true
          }

        if(array(mid) > elementToBeSearched)
          {
           return binarySearch(array, start, mid - 1,elementToBeSearched)
          }
        else {
         return binarySearch (array, mid + 1, end, elementToBeSearched)
        }

      }
     false
  }

}
