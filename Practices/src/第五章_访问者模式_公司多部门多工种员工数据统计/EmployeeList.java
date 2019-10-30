package 第五章_访问者模式_公司多部门多工种员工数据统计;

import java.util.ArrayList;

/**
 * @program: Design Patterns
 * @description: 充当对象结构，用于存储员工列表
 * @author: yyc
 * @create: 2019-10-30 12:59
 **/
public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();
    public void addEmployee(Employee employee){
        list.add(employee);
    }

    public void accept(Department handler){
        list.forEach((e) ->e.accept(handler));
    }
}
