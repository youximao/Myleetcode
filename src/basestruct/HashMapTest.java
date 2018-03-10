package basestruct;

import java.util.*;

public class HashMapTest {
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            //System.out.println(tableSizeFor(a));
            System.out.println(a & 4);
        }
        HashMap<String, String> map = new HashMap<String, String>();


        map.forEach((key, value) -> {
        });

        for (Map.Entry<String, String> jia : map.entrySet()) {
        }
        for (String value : map.keySet()) {
        }

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        HashSet<String> hashSet = new HashSet<String>();

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        ArrayList<String> arrayList=new ArrayList<String>();

        LinkedList<String> list=new LinkedList<String>();
    }
}
