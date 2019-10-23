package 第五章_JAVA内置迭代器实现迭代和排序;

import java.util.Comparator;

/**
 * 学生类比较器
 */
public class StuComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStuAge() - o2.getStuAge();
    }
}
