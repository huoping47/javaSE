package date_class.demo;

import java.math.BigDecimal;

/*
BigDecimal 属于大数据，精度极高，不属于基本数据类型，属于java对象（引用数据类型）
这是SUN提供的一个类，专门用在财务软件当中
 */
public class BigDouble {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(10.6);
        BigDecimal bigDecimal1 = new BigDecimal(3);
        System.out.println(bigDecimal.divide(bigDecimal1));
        System.out.println(bigDecimal.add(bigDecimal1));
    }
}
