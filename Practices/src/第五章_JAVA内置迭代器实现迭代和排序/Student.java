package 第五章_JAVA内置迭代器实现迭代和排序;

public class Student  /*implements Comparable<Student>*/{
    private String stuName;
    private int stuAge;
    private byte stuGender;

    public Student(String stuName, int stuAge, byte stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public byte getStuGender() {
        return stuGender;
    }

    public void setStuGender(byte stuGender) {
        this.stuGender = stuGender;
    }

//    @Override
//    public int compareTo(Student o) {
//        return o.getStuAge() -this.getStuAge() ;
//    }
}
