object secondmax
{   
   def main(args: Array[String]): Unit = 
   {     
       var arr = Array(10789, 2035, 1899, 1456);
       
       println("Orginal Array:")
       
       for ( x <- arr) 
        {
         print(s"${x}, ")        
        }      
     
        scala.util.Sorting.quickSort(arr)
             
        var index = arr.length-1;
     
        while(arr(index)==arr(arr.length-1))
        {
            index=index-1
        }     
        
        println("\n Second largest value of the said array: " + arr(index));      
    }
 }