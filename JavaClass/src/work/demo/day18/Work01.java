package work.demo.day18;
/*
某公司的雇员分为以下若干类：
	Employee：这是所有员工总的父类，
		属性：
			员工的姓名,员工的生日月份。
		方法：getSalary(intmonth)
			根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。

	SalariedEmployee：
		Employee 的子类，拿固定工资的员工。
		属性：月薪



	SalesEmployee：
		Employee 的子类，销售人员，工资由月销售额和提成率决定。
		属性：月销售额、提成率

	BasePlusSalesEmployee：
		SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
		属性：底薪。

	根据要求创建 SalariedEmployee 、 HourlyEmployees 、SaleEmployee 和 BasePlusSalesEmployee四个类的对象各一个，
	并计算某个月这四个对象的工资。

	注意：要求把每个类都做成完全封装，不允许非私有化属性。
 */
public class Work01 {
    public static void main(String[] args) {
        Employee sa = new SalariedEmployee();
        Employee ba = new BasePlusSalesEmployee();
        Employee ho = new HourlyEmployee();
        Employee sl = new SalesEmployee();
        sl.setName("王麻子");
        sl.setBirthday(9);
        ho.setName("王五");
        ho.setBirthday(8);
        ba.setName("李四");
        ba.setBirthday(7);
        sa.setName("张三");
        sa.setBirthday(6);
        sa.getSalary(6);
        ho.getSalary(6);
        sl.getSalary(6);
        ba.getSalary(6);

//        System.out.println(sa.getBirthday()+"月 "+sa.getName());
//        System.out.println(ba.getBirthday()+"月 "+sa.getName());
//        System.out.println(ho.getBirthday()+"月 "+ho.getName());
//        System.out.println(sl.getBirthday()+"月 "+sl.getName());
    }
}
