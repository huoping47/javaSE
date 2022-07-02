package work.demo.day20.work02;

public class Yx extends Graphics{
    private double pj;

    public Yx(double pj) {
        this.pj = pj;
    }

    public void sun() {
        String s1 = this.getStuff() ? "有填充" : "无填充";
        String s2 = this.getColor();
        System.out.println("这个是"+this.getColor()+";\t直径为'"+this.pj*2+"',"+s1+"的圆形");
    }
}
