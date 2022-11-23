object factorial
{
    def factorial(n: Int): Int = {
          
        var f = 1
        for(i <- 1 to n)
        {
            f = f * i;
        }         
        return f
    }
  
    def main(args: Array[String]) =
    {   
        
        println("Enter Number :")
        var n = scala.io.StdIn.readInt()
        println("Factorial :" + factorial(n))
    }
  
}