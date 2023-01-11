package leetcode;

public class test7 {
    public static void main(String[] args) {
        /*
        需求：把整数上的每一位都添加到数组当中
         */
        int number = 12345;
        //定义一个变量临时记录number的值，就是为了第三步的时候再次使用
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while (number != 0){
            //每一次循环去掉右边的一个数
            number = number / 10;
            //去掉一位计数器自增一次
            count ++;
        }
        //定义数组
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            //把当前获取到的个位添加到数组当中
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
