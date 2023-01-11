package leetcode;

public class huiwenshu {
    public static void main(String[] args) {
        //核心思路：把数字倒过来跟原来的数字比较

        //1.定义数字
        int x = 1234321;
        int num = 0;
        int temp = x;  //定一个临时变量记录原来的值
        //2.利用循环开始从右往左获取每一位数字
        while (x!=0){
            int ge = x % 10;
            //修改x记录的值
            x = x / 10;
            //把当前获取的数拼到最右边
            num = num*10 + ge;
        }
        System.out.println(num);
        //比较
        System.out.println(num == temp);


        //2.获取个位
//        int ge = x % 10;
//        int shi = x / 10 % 10;
//        int result = ge * 10 +shi;
//        System.out.println(result);
    }
}
