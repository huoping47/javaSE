package org.example;

import org.example.service.Show;
import org.example.service.impl.action;
import org.example.service.impl.superStarZhou;
import org.junit.Test;

public class TestShow {
//    @Test
//    public void test() {
//        Show show = new action(new superStarZhou());
//        show.showTime();
//    }

    @Test
    public void test() {
        action a = new action(new superStarZhou());
        Show show = (Show) a.getShow();
        show.showTime();
    }
}
