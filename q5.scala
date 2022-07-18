object ScalaLab1_Question2{
     def main(args: Array[String]) = {  

       var easy = 4;
       var tempo = 3;
       
       println(runtime(easy,tempo)) 
    }
    def runtime(easy:Double,tempo:Double):Double = easy*8 + tempo*7; 
}