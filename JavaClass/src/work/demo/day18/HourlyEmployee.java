package work.demo.day18;
//HourlyEmployee：
//		Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
//		属性：每小时的工资、每月工作的小时数
public class HourlyEmployee extends Employee{
    private int hourTime =15;
    private int mouseHour = 200;
    private int sum;

    @Override
    public void getSalary(int month) {
        if (month ==this.getBirthday()){
            this.sum +=100;
        }
        if (this.mouseHour>160){
            int c = this.mouseHour-160;
            this.sum += (this.hourTime*this.mouseHour)+(this.hourTime*c);
        }else{
            this.sum += (this.hourTime*this.mouseHour);
        }

        System.out.println(this.getName()+"这个月的工资"+this.sum);
    }

    public int getHourTime() {
        return hourTime;
    }

    public void setHourTime(int hourTime) {
        this.hourTime = hourTime;
    }

    public int getMouseHour() {
        return mouseHour;
    }

    public void setMouseHour(int mouseHour) {
        this.mouseHour = mouseHour;
    }
}
