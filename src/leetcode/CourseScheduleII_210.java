package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class CourseScheduleII_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int size=numCourses;
        int []schedu=new int[size];

        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>(size);
        while (true){
            for (int i = 0; i <prerequisites.length ; i++) {
                int first=prerequisites[i][0];
                int second=prerequisites[i][1];
                //if()
            }
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        }
    }
}
