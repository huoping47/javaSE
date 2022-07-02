package work.demo.day16.work04;

public class Number {
    int a ;
    int b ;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addition(){
        int c = this.a+this.b;
        System.out.println(c);
        return c;
}
    public int subtration(){
        int c = this.a-this.b;
        System.out.println(c);
        return c;
    }
    public int multiplication(){
        int c =this.a*this.b;
        System.out.println(c);
        return c;
    }
    public int division(){
        int c  = this.a/this.b;
        System.out.println(c);
        return c;
    }

}
