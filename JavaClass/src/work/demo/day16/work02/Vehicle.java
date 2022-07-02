package work.demo.day16.work02;
/*
交通工具类
 */
public class Vehicle {
    int speed = 30;
    double size;

    public void move(){
        System.out.println("车子正在移动,速度"+this.speed);
    }

    public int setSpeed(int speed){
        return this.speed=speed;
    }

    public void upSpeed(int speed){
        this.speed+=speed;
        System.out.println("车子正在加速,速度"+this.speed);
    }
    public void downSpeed(int speed){
        this.speed-=speed;
        System.out.println("车子正在减速,速度"+this.speed);
    }
}
