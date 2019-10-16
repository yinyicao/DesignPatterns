package 第二章_简单工厂模式_四合运算;

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
