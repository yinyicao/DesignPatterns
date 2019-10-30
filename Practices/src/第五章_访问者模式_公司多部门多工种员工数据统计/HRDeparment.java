package 第五章_访问者模式_公司多部门多工种员工数据统计;

/**
 * @program: Design Patterns
 * @description: 人力资源部门
 * @author: yyc
 * @create: 2019-10-30 12:50
 **/
public class HRDeparment extends Department{

    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工 "+employee.getName()+" 实际工作时间为："+workTime+"小时。");
        if (workTime > 40){
            System.out.println("正式员工 "+employee.getName()+" 加班时间为："+(workTime-40)+"小时。");
        }else if (workTime < 40){
            System.out.println("正式员工 "+employee.getName()+" 请假时间为："+(40-workTime)+"小时。");
        }
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时员工 "+employee.getName()+" 实际工作时间为："+workTime+"小时。");
    }
}
