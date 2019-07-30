package com.yuwanww.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ThreadDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 56, 7);
       integers.forEach(new Consumer<Integer>() {
           @Override
           public void accept(Integer integer) {
               System.out.println(integer);
           }
       });
       //外部迭代
       //内部迭代
       integers.forEach(e-> System.out.println(e));

       //method reference
        //调用方法的对象::method
       integers.forEach(System.out::println);
       System.out.println("----------------------------");
       integers.stream().map(integer -> integer+1).forEach(System.out::println);
        //缺省
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.sort(strings,(o1,o2)->o2.compareTo(o1));
        System.out.println(strings.toString());
    }
}
