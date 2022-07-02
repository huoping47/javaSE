package library.demo;

import java.io.IOException;

/**
 * @author 霍平
 * @date 2022/6/8 18:46
 * @mouse 六月
 */

public class Test01 {
    public static void main(String[] args) {
        try {
            Welcome we = new Welcome();
        } catch (SysInExcption e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
