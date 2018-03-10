package leetcode;

import java.util.HashSet;

/*
* 判断是否是正方形
* 给四个点的坐标*/
public class Square_593 {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        // 四个点分成两组
        // 取每组的两个点组成两条线，判断这两条线是对角线还是平行线
        double k1=(double)(p1[1]-p2[1])/(p1[0]-p2[0]);
        double k2=(double)(p3[1]-p4[1])/(p3[0]-p4[0]);
        System.out.println(k1+" |"+k2);
        System.out.println(k1*k2);
        if(k1*k2==-1) {
            // 看 p1 与p3 p4 的两条线是否垂直
            double k3=(double)(p1[1]-p3[1])/(p1[0]-p3[0]);
            double k4=(double)(p1[1]-p4[1])/(p1[0]-p4[0]);
            if(k3*k4==-1)return true;
        }else {
            // 看是否平行
            if(k1==k2){
                return validSquare(p1,p4,p2,p3);
            }
        }
        return false;
    }
    // 看博客有人有另外的一种思路，计算四个点到其他点的距离，一共有6个距离，但是正方形中6个距离只有两个，一个a和a的根号二倍。
    public static boolean validSquare1(int[] p1, int[] p2, int[] p3, int[] p4) {
        double k1=(double)Math.pow((p1[1]-p2[1]),2)+Math.pow((p1[0]-p2[0]),2);
        double k2=(double)Math.pow((p1[1]-p3[1]),2)+Math.pow((p1[0]-p3[0]),2);
        double k3=(double)Math.pow((p1[1]-p4[1]),2)+Math.pow((p1[0]-p4[0]),2);

        double k4=(double)Math.pow((p2[1]-p3[1]),2)+Math.pow((p2[0]-p3[0]),2);
        double k5=(double)Math.pow((p2[1]-p4[1]),2)+Math.pow((p2[0]-p4[0]),2);

        double k6=(double)Math.pow((p3[1]-p4[1]),2)+Math.pow((p3[0]-p4[0]),2);

        HashSet<Double> set=new HashSet<Double>();
        set.add(k1);
        set.add(k2);
        set.add(k3);
        set.add(k4);set.add(k5);set.add(k6);
        //double 型的0
        if(set.contains((double)0))return false;

        if(set.size()==2)return true;


        return false;
    }

    public static void main(String[] args) {
        int []p1={0,0};
        int []p2={1,1};
        int []p3={0,0};
        int []p4={0,0};

        System.out.println(validSquare1(p1,p2,p3,p4));
    }

}
