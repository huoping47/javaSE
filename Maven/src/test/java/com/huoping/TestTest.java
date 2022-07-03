package com.huoping;

import org.junit.Test;

public class TestTest {

    @Test
    public void sums(){
        TestMaven t = new TestMaven();
        int sum = t.sum(10, 20);
        System.out.println(sum);
    }
}
