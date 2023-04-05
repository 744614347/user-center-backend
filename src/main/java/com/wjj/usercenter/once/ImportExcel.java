package com.wjj.usercenter.once;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * 导入Excel数据
 */
public class ImportExcel {
    /**
     * 读取数据
     */
    public static void main(String[] args) {
        // 写法1：JDK8+
        // since: 3.0.0-beta1
        String fileName = "D:\\aa\\user-center-backend\\src\\main\\resources\\testExcel.xlsx";
//        readByListerner(fileName);
        synchronousRead(fileName);

    }

    /**
     * 监听器
     * @param fileName
     */
    private static void readByListener(String fileName) {

        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        // 这里每次会读取100条数据 然后返回过来 直接调用使用数据就行
        EasyExcel.read(fileName, FakerUserInfo.class, new TableListener()).sheet().doRead();

    }

    /**
     * 同步读
     * @param fileName
     */
    public static void synchronousRead(String fileName) {

        List<FakerUserInfo> totalDataList =
                EasyExcel.read(fileName).head(FakerUserInfo.class).sheet().doReadSync();
        for (FakerUserInfo fakerUserInfo : totalDataList) {
            System.out.println(fakerUserInfo);

        }

    }


}
