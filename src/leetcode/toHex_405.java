package leetcode;

import java.util.Scanner;
/*
就是转化为16进制， 考虑负数，为fffffff向下减，但是要考虑到边界问题
accepted
 */
public class toHex_405 {
    public String toHex(int num) {
        if(num==0)return "0";
        StringBuilder s = new StringBuilder();
        if(num>0) {

            while (num > 0) {
                int i = num % 16;
                num /= 16;

                if (i <= 9) s.insert(0, i);
                else {
                    i -= 10;
                    char x = (char) ('a' + i);
                    s.insert(0, x);
                }
            }
        }else {
            s=new StringBuilder("ffffffff");
            int x=-1 -num;
            int index=7;
            while(x>0){
                int i = x % 16;
                x /= 16;

                if (i > 5){


                    s.replace(index,index+1,(15-i)+"");}
                else {
                    i = 5-i;
                    char x1 = (char) ('a' + i);
                    s.replace(index,index+1, x1+"");
                }
                index--;
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        toHex_405 toHex1=new toHex_405();
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int num=in.nextInt();
            System.out.println(toHex1.toHex(num));
        }
    }


}
