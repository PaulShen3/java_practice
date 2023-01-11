package leetcode;

import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        /*
        需求：定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
        前四位是大写字母或小写字母
        最后一位是数字
         */
        //分析：
        //A~Z a~z
        //方法：
        //如果要在一堆没有什么规律的数据中随机抽取
        //可以先把数据放到数组中，然后再随机抽取一个索引

        //1.大写字母和小写字母放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            }else {
                //添加大写字母
                // A --- 65
                chs[i] = (char) (65+ i - 26); //26的时候才出现大写字母，所以要减26
            }
        }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]+" ");
//        }
        //定义一个字符串类型的变量用来记录最终的结果
        String result = "";
        //2.随机抽取4次
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
//            System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
//        System.out.println(result);
        //3.随机抽取一个数字0~9
        int number = r.nextInt(10);
        result += number;
        System.out.println(result);

    }
}
