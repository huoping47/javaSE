package work.demo.day15.work02;

import java.util.Scanner;

//账户id，余额balance，年利率annualInterestRate；
public class Account {
    private long id = 430581;
    private double balance = 5000;
    double annualInterestRate=0.003;

    public Account() {
            Scanner s = new Scanner(System.in);
            System.out.println("请问您是想取款还是存款呢？1、取款   2、存款");
            int choose = s.nextInt();
            if (choose == 1){
                this.withdraw();
            }else if (choose ==2){
                this.deposit();
            }else{
                System.out.println("请输入正确的数字");
            }
    }

    public void withdraw(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的ID");
        long id1 = s.nextInt();
        if (this.id == id1){
            System.out.println("请输入您要取得金额");
            int balances1 = s.nextInt();
            this.balance -=balances1;
            System.out.println(this.id+",您取了"+balances1+"元,您还剩"+this.balance+"元");
        }else{
            System.out.println("您输入的ID不正确");
        }
    }

    public void deposit(){
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入您的ID");
        long id1 = ss.nextInt();
        if (this.id == id1){
            System.out.println("请输入您要存取的金额");
            int balanced1 = ss.nextInt();
            this.balance +=balanced1;
            System.out.println(this.id+",您存取了"+balanced1+"元,您还剩"+this.balance+"元");
        }else{
            System.out.println("您输入的ID不正确");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
