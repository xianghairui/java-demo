package com.xiang.demo.java.util;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/11/22 14:20
 * <p>Description:
 */
public class StringUtilsTest {

    @Test
    public void test() {
        String text = "14424995558421\n" +
                "14420718222248\n" +
                "14421916169083\n" +
                "14424341214266\n" +
                "14424155433721\n" +
                "14421761945066\n" +
                "14422437507651\n" +
                "14425070183881\n" +
                "14423331975116\n" +
                "14420569717701\n" +
                "14423978706561\n" +
                "14423066378113\n" +
                "14424963665265\n" +
                "14424644269104\n" +
                "14425028456227\n" +
                "14425066196620\n" +
                "14424725892403\n" +
                "14424284727317\n" +
                "14422407118088\n" +
                "14423321722216\n" +
                "14423665651059\n" +
                "14422854125440\n" +
                "14424169699526\n" +
                "14421474501231\n" +
                "14420784363113\n" +
                "14423831425146\n" +
                "14422481015160\n" +
                "14420998863366\n" +
                "14423758847457\n" +
                "14425005963956\n" +
                "14424665816359\n" +
                "14424701665798\n" +
                "14421920544911\n" +
                "14424987382964\n" +
                "14424163560833\n" +
                "14424731469404\n" +
                "14424592574637\n" +
                "14425067650403\n" +
                "14424442537254\n" +
                "14423777332933\n" +
                "14423688941103\n" +
                "14424942103748\n" +
                "14423650053427\n" +
                "14424463477186\n" +
                "14424510705881\n" +
                "14424691968806\n" +
                "14425009833185\n" +
                "14423856351745\n" +
                "14425001945652\n" +
                "14424493436270\n" +
                "14425043353709\n" +
                "14422262275903\n" +
                "14422284079648\n" +
                "14424447616759\n" +
                "14424939915069\n" +
                "14424731878784\n" +
                "14423346123406\n" +
                "14424415589874\n" +
                "14422186787148\n" +
                "14423176459575\n" +
                "14423788519472\n" +
                "14425065605964\n";

        String[] strs = text.split("\n");
        List<String> list = Lists.newArrayList();
        for (String s : strs) {
            list.add(s.trim());
        }
        StringBuffer sbf = new StringBuffer();
        for(String s : list) {
            sbf.append(s);
            sbf.append(",");
        }
        sbf.deleteCharAt(sbf.length()-1);
        System.out.println("size:" + list.size());
        System.out.println(sbf.toString());
    }

}
