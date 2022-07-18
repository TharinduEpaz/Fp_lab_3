object ScalaLab1_Question2{
     def main(args: Array[String]) = {  

        var price = 24.95;
        var amount = 60;

        println(cost(price, amount));

    }
    def cost(price: Double,Amount: Int):Double = Amount match{
        case x if Amount>=50 => price*0.6*Amount + 3 + 0.75*(Amount-50);
        case _ => price*0.6*Amount + 3;
    }
}