package src.array;

import java.util.Scanner;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 最长公共前缀
 * @DATE: 2021/3/8 14:40
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，则返回""
 * 示例1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 */
public class LongestCommonPrefix {

    //将字符串数组中的每个字符串拿出来调用longestCommonPrefix函数求解公共前缀
    public String result(String[] str){
        if (str.length == 0 || str == null){//判断比较的字符串是否存在且不为空
            return "";
        }
        String prefix = str[0];//定义公共前缀字符串
        for (int i = 1;i<str.length;i++){
            prefix = longestCommonPrefix(prefix,str[i]);
            if (prefix.length() == 0)
                break;
        }
        return prefix;

    }

    //最长公共前缀
    public String longestCommonPrefix(String str1,String str2){
        //比较两个字符串的长度，采用短的节约时间
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length()-1
        while (index < length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        //substring(int beginIndex, int endIndex)的作用就是截取父字符串的某一部分,
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = {"flower","flow","flight"};
        String result = longestCommonPrefix.result(str);
        System.out.println(result);
    }
}
