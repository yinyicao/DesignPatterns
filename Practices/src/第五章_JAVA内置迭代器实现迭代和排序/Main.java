package 第五章_JAVA内置迭代器实现迭代和排序;

public class Main {
    public static void main(String[] args) {
        Class cls = new Class();
        Student stu1 ,stu2,stu3,stu4,stu5;
        stu1 = new Student("张三",20, (byte) 1);
        stu2 = new Student("李四",24, (byte) 1);
        stu3 = new Student("王五",33, (byte) 0);
        stu4 = new Student("赵二",18, (byte) 1);
        stu5 = new Student("钱六",19, (byte) 0);
        cls.addStudent(stu1);
        cls.addStudent(stu2);
        cls.addStudent(stu3);
        cls.addStudent(stu4);
        cls.addStudent(stu5);
        cls.printStudents();
    }
}
