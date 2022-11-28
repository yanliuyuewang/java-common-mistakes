package org.geekbang.time.commonmistakes.java8.stringdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * AUTHER: wangyue
 * TIME  : 2022/11/28 : 20:05
 */
@Slf4j
public class StringSplit {

    public static void main(String[] args) {
//
//        String str = "a,b,c,,";
//        String[] ary = str.split(",");
//        // 预期大于 3，结果是 3
//        log.info(String.valueOf(ary.length));
//
//        String[] str1 = new String[] { "you", "wu" };
//        List list = Arrays.asList(str1);
////        list.add("ddd");
//        System.out.println(list);
//

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
//            if (删除元素的条件) {
                iterator.remove();
//            }
        }

        System.out.println(list2);

    }
}
