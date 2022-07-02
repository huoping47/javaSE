package work.demo.day24;

import java.util.Arrays;

/*
军队类
 */
public class Army {
    Weapon[] w ;//存储武器的数组
    public Army(int i){
        this.w = new Weapon[i];//初始化数组的容量大小
    }
    int c = 0;
    //把参数wa所代表的武器加入到数组w中。
    public void addWeapon(Weapon wa){
        //如果数组下标为null，则添加武器
        for (int i = 0; i < w.length; i++) {
            if (w[i] == null) {
                w[i] = wa;
                return;
            }
        }
    }
    

    //让所有武器攻击的类
    public void attackAll(){
        for (int i = 0; i < w.length; i++) {
            if (w[i] != null) {
                Weapon s = w[i];//数组中存储的是一个对象地址，所以返回的也是一个对象
                s.attack();
            }
        }
    }

    public void moveAll(){
        for (int i = 0; i < w.length; i++) {
            if (w[i] != null) {
                Weapon s = w[i];//数组中存储的是一个对象地址，所以返回的也是一个对象
                s.Sticks();
            }
        }
    }
}
