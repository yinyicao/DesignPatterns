package 第五章_访问者模式_公司多部门多工种员工数据统计;

/**
 * @program: Design Patterns
 * @description: 正式员工
 * @author: yyc
 * @create: 2019-10-30 11:31
 **/
public class FulltimeEmployee implements Employee {

    private String name;
    private double weeklyWage;
    private int workTime;

    public FulltimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}
