package 第五章_访问者模式_公司多部门多工种员工数据统计;

/**
 * @program: Design Patterns
 * @description: 测试类
 * @author: yyc
 * @create: 2019-10-30 13:04
 **/
public class Client {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee fte1,fte2,fte3,pte1,pte2;
        fte1 = new FulltimeEmployee("张无忌",3200.00,45);
        fte2 = new FulltimeEmployee("杨过",2000.00,40);
        fte3 = new FulltimeEmployee("段誉",2400.00,38);
        pte1 = new ParttimeEmployee("洪七公",80.00,20);
        pte2 = new ParttimeEmployee("郭靖",60.00,18);
        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);

        Department fa,hr;
        fa = new FADepartment();
        hr = new HRDeparment();
        System.out.println("财务部门处理数据：");
        list.accept(fa);

        System.out.println("-----------------------------------");
        System.out.println("人力资源部门处理数据：");
        list.accept(hr);

    }
}
