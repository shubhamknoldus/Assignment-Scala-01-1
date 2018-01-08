package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    true
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


}
