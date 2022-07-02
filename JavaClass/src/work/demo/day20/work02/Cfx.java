package work.demo.day20.work02;

public class Cfx extends Graphics{
    private int c;
    private int k;

    public Cfx(int c, int k) {
        this.c = c;
        this.k = k;
    }
    public void sun() {
        String s1 = this.getStuff() ? "有填充" : "无填充";
        System.out.println("这个是'"+this.getColor()+";\t长为：'"+c+"',宽为：'"+this.k+"',"+s1+"的长方形");
    }
}
