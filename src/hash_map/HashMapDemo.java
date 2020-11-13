
package hash_map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //put, get method
        HashMap<Integer , String> customer=new HashMap<Integer , String>();
        customer.put(101, "Pinky");
        customer.put(102, "Rupa");
        customer.put(103, "Soni");
        customer.put(104, "Sunny");
        customer.put(105, "Rupayan");
        System.out.println(customer.get(101));
    }
    
}
