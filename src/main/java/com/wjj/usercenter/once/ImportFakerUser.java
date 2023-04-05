package com.wjj.usercenter.once;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 导入星球用户到数据库
 */
public class ImportFakerUser {

    public static void main(String[] args) {
        String fileName = "D:\\aa\\user-center\\src\\main\\resources\\testExcel.xlsx";
        List<FakerUserInfo> userInfoList = EasyExcel.read(fileName).head(FakerUserInfo.class).sheet().doReadSync();
        System.out.println("总数 = " + userInfoList.size());
        Map<String, List<FakerUserInfo>> listMap =
                userInfoList.stream().
                        filter(userInfo -> StringUtils.isNotEmpty(userInfo.getUsername())).
                        collect(Collectors.groupingBy(FakerUserInfo::getUsername));

        for (Map.Entry<String, List<FakerUserInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size() > 1){
                System.out.println("username = " + stringListEntry.getKey());
            }
        }
        
        System.out.println("不重复的昵称数 = " + listMap.keySet().size());

    }
}
