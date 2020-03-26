package com.xkcoding.https;

import org.assertj.core.util.Lists;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
class SpringBootDemoHttpsApplicationTests {


    public static void main(String[] args) {

        ArrayList<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        int h = list.hashCode();

        System.out.println(h);

        int i = indexFor(h, list.size());

        System.out.println(list.get(i));

    }

    public static int indexFor(int h, int length){
        return h & (length - 1);
    }

}
