object perfect 
{
    def main(args: Array[String]) = 
    {
        for(j<- 1 to 5)
        {
            var n1=scala.util.Random
            var n=n1.nextInt(1000)
            var sum=0
            for(i<-1 to n-1)
            {
                if(n%i==0)
                {
                    sum=sum+i
                }
            }
            
            if(sum==n)
            {
                println("%d is perfect no.".format(n))
            }
            else
            {
                println("%d is not perfect no.".format(n))
            }
        }
    }
}
