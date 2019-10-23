package 第五章_JAVA内置迭代器实现迭代和排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Class {
    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
    }

    public  void printStudents(){
        //1.第一种方式，让Student类实现Comparable接口，并覆写compareTo方法
//        Collections.sort(students);
        //2.第二种方式，新建比较器，实现Comparator接口
//        Comparator comp = new StuComparator();
//        Collections.sort(students,comp);
        //3.第三种方式，使用Lambda表达式
//        Collections.sort(students,(s1,s2) -> s2.getStuAge() - s1.getStuAge());
        students.sort((s1,s2) ->s2.getStuAge() - s1.getStuAge());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println("姓名："+stu.getStuName()+"，年龄："+stu.getStuAge());
        }
    }
}
