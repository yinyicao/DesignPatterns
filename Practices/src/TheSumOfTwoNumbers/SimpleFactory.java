package TheSumOfTwoNumbers;

class SimpleFactory {
     static Calculate calculate(String type){
         Calculate calculate = null;
         switch (type){
             case "+":
                 calculate =  new ComputeSum();
                 break;
             case "-":
                 calculate = new ComputeSubtraction();
                 break;
         }
         return calculate;
     }
}
