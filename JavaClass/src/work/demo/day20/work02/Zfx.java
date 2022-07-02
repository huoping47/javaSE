package work.demo.day20.work02;

public class Zfx extends Graphics {
    private int c;
    private int k;

    public Zfx(int c, int k) {
        this.c = c;
        this.k = k;
    }

    @Override
    public void sun() {
        String s1 = this.getStuff() ? "有填充" : "无填充";
        System.out.println("这个是'"+this.getColor()+";\t长为：'"+c+"',宽为：'"+this.k+"',"+s1+"的正方形");
    }
}
