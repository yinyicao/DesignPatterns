package 第三章_简单工厂模式_女娲造人;

public class Nvwa {
    public  static  Person createPerson(String str){
        Person p = null;
        switch (str){
            case "M": p = new Man();break;
            case "W": p = new Woman();break;
            case  "R": p= new Robot();break;
        }
        return p;
    }
}
