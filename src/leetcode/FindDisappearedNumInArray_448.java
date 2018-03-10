package leetcode;
/*
* Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
/*
* 在一个数组里面找到没有出现的数，这个数组的数是从1到数组的长度
* 但是某些数是出现最多两次，这样导致肯定没有一些数出现，找到这些数
* */

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumInArray_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int a=0;
        int i=0;
        List<Integer> list=new ArrayList<Integer>();
        while (i<nums.length){
           if(nums[i]!=i+1&&nums[i]!=0){
               a=nums[i];
               if(nums[a-1]!=a){
                   nums[i]=nums[a-1];
                   nums[a-1]=a;
               }else {
                   nums[i]=0;
               }
           }else {
               i++;
           }
        }
        for ( i = 0; i <nums.length ; i++) {
            if(nums[i]!=i+1) list.add(i+1);
        }

        return list;
    }

    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
