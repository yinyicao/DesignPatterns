package 第五章_访问者模式_公司多部门多工种员工数据统计;

/**
 * @program: Design Patterns
 * @description: 抽象元素角色
 * @author: yyc
 * @create: 2019-10-30 11:25
 **/
public interface Employee {
     void accept(Department handler);
}
