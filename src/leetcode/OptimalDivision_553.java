package leetcode;

import java.util.Scanner;

/**
 * 数学真的很奇妙
 * 这个题是为了求用括号和除号把这个数组的数字不改变位置的情况下构建一个表达式
 * 使这个表达式的结果最大
 * a/b/c/d  只要是 表示为 a*c*d/b 即最大， 那就 输出a/(b/c/d)即可
 */

public class OptimalDivision_553 {

    public String optimalDivision(int[] nums) {
        if (nums.length==1)return nums[0]+"";
        else if (nums.length==2)return nums[0]+"/"+nums[1];
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(nums[0]+"/");
        for (int i = 1; i <nums.length ; i++) {
            if(i==1)stringBuilder.append("(");

            stringBuilder.append(nums[i]);
            if (i==nums.length-1)stringBuilder.append(")");
            else stringBuilder.append("/");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        OptimalDivision_553 optimalDivision_553=new OptimalDivision_553();
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            int n=in.nextInt();
            int []nums={1000,100};
            System.out.println(optimalDivision_553.optimalDivision(nums));
        }
    }
}
