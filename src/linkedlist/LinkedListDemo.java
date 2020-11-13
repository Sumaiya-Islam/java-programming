
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> countryNames=new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Maldip");
        countryNames.add("China");
        countryNames.add(5, "Arjentina");
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        
       // countryNames.remove("Japan");
       //countryNames.remove(7);
     // countryNames.removeFirst();
     // countryNames.removeLast();
        
       // System.out.println(countryNames);
       for(String country : countryNames){
           System.out.println(country);
       
       
       
       }
       System.out.println("1st elements :"+countryNames.getFirst()); 
        System.out.println("last elements :"+countryNames.getLast()); 
        System.out.println("Size of LinkedList :"+countryNames.size());
        countryNames.clear();
        System.out.println(countryNames);
        
        
    }
    
}
