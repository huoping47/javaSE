package work.demo.day15.work03;
/*
写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
 */
public class Work3 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name="Smith.Jane";
        Account account = new Account();
        customer.account = account;
        account.customer = customer;
        int a = 100;
        int b = 960;
        int c = 2000;
        customer.account.setMoney(customer.account.getMoney()+a);
        System.out.println("成功存入"+a);
        if (customer.account.getMoney()<=0) {
            System.out.println("余额不足，取钱失败");
        }else if(customer.account.getMoney()>=0){
            customer.account.setMoney(customer.account.getMoney()-b);
            System.out.println("成功取出"+b+"您还剩余"+customer.account.getMoney());
            if (customer.account.getMoney()-c >=0) {
                customer.account.setMoney(customer.account.getMoney()-c);
                System.out.println("成功取出"+c);
            }else{
                System.out.println(c+"元取款失败,余额不足"+"您还剩余"+customer.account.getMoney());
            }
        }
    }
}
