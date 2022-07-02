package work.demo.day14.work1;
/*
第一题：设计日期类，每个日期对象都可以描述年月日信息。
 */
public class Work01 {
    public static void main(String[] args) {
        DateClass dc = new DateClass(2022,5,12);
        System.out.println("今年是"+dc.year+"年"+dc.mouse+"月"+dc.day);

        DateClass dcc = new DateClass(2021,5,18);
        System.out.println("今年是"+dcc.year+"年"+dcc.mouse+"月"+dcc.day);
    }
}
