package com.ruoyi.common.utils.game;

public class ProcessDataUtils {
    /**
     *
     * @param startIndex 从第几位开始截取
     * @param endIndex 截取到第几位(参数为索引下标的后一位)
     * @param step 自增多少
     * @param source 源字符串
     * @return
     */
    public static String strIncrement(int startIndex, int endIndex, int step, String source){
        String prefix = source.substring(0, startIndex);
        String suffix = source.substring(endIndex, source.length());
        String toIncre = source.substring(startIndex, endIndex);
        boolean isNumeric = toIncre.matches("\\d+");
        if(isNumeric){
            int incred = Integer.parseInt(toIncre) + step;
            String targetIncred = String.valueOf(incred);
            while(targetIncred.length() < endIndex-startIndex){
                targetIncred = "0"+targetIncred;
            }
            return prefix + targetIncred + suffix;
        }else{
            return source;
        }
    }

    /**
     * 自增用户名
     * @param userName
     * @return
     */
    public static String userNameIncrement(String userName){
        return strIncrement(1, userName.length(), 1, userName);
    }
}
