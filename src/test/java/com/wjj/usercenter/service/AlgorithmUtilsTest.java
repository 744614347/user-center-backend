package com.wjj.usercenter.service;

import com.wjj.usercenter.utils.AlgorithmUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 算反工具类测试
 */
public class AlgorithmUtilsTest {


    @Test
    void testCompareTags(){
        List<String> tagList1 = Arrays.asList("Java", "大一", "男");
        List<String> tagList2 =Arrays.asList("Java","大一 ","女");
        List<String> tagList3 = Arrays.asList("Python","大二","女");

        System.out.println(AlgorithmUtils.minDistance(tagList1, tagList2));
        System.out.println(AlgorithmUtils.minDistance(tagList1, tagList3));

    }

}
