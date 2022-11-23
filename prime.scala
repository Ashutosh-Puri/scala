//Write a program to calculate sum of prime numbers between 1 to 100
object prime 
{
    def main(args: Array[String]) = 
    {
        var psum=0
        for(i <- 2 to 100)
        {
            var sum=0
            for(j<-2 to i)
            {
                if(i%j==0)
                {
                    sum=sum+j
                }
            }
              
            if(sum==i)
            {
                psum = psum + i   
            }
        }
        println("sum of prime numbers are "+psum)
    }
}
