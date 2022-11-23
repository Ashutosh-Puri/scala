object average
{
    def main(args:Array[String])={
        println("Enter 1'st Number :")
        var n1 = scala.io.StdIn.readInt()

        println("Enter 2'nd Number :")
        var n2 = scala.io.StdIn.readInt()
            
        var sum = 0
        var avg = 0.0
        for(i<- n1 to n2)
        {
        sum += i
        } 

        avg = sum / (n2 - n1 + 1)

        println(" Sum :"+sum)
        println(" Average :"+avg)
    }
}