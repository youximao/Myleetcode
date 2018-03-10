package jniandndk;

public class MyJniU {

    public static native void show();

    public static void main(String[] args) {
        show();
    }
    static {
        //System.load("");
        System.load("E:\\java\\work\\Myleetcode\\src\\jniandndk_MyJniU.dll");
    }
}
