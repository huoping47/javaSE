package work.demo.day16.work03;

public class MyTime {
    private int hour;
    private int minute;
    private  int second;

    public MyTime(int hour, int minute, int second) {
        if (hour<0||hour>24){
            System.out.println("请输入正确的时间");
        }else{
            this.hour = hour;
            if (minute <0 || minute>60) {
                System.out.println("请输入正确的时间");
            }else{
                this.minute = minute;
                if (second <0 ||second>60) {
                    System.out.println("请输入正确的时间");
                }else{
                    this.second = second;
                }
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void diaplay(){
        System.out.println("现在是"+this.hour+"点"+this.minute+"分"+this.second+"秒");
    }
    public void  addSecond(int sec){
        if ((this.second+sec)>=60){
            this.second = (this.second-60);
            this.minute++;
        }else{
            this.second+=sec;
        }
    }
    public void addMinute(int min){
        if ((this.minute+min)>=60){
            this.minute = (this.minute-60);
            this.hour++;
        }else{
            this.minute+=min;
        }
    }
    public void addHour(int hou){
        if ((this.hour+hou)>=24){
            this.hour = (this.hour-24);
        }else{
            this.hour+=hou;
        }
    }
    public void subSecond(int sec){
        if ((this.second-sec)<0){
            this.second = (60-sec+this.second);
            this.minute--;
        }else{
            this.second-=sec;
        }
    }
    public void subMinute(int min){
        if ((this.minute-min)<0){
            this.minute = (60-min+this.minute);
            this.hour--;
        }else{
            this.minute-=min;
        }
    }
    public void subHour(int hou){
        if ((this.hour-hou)<0){
            this.hour = 24+(this.hour-hou);
        }else{
            this.hour-=hou;
        }
    }

//    subHour(int hou)
}
