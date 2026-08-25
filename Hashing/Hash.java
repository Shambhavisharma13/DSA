
import java.util.*;
public class Hash {
    public static void main(String args[]){
        //create
         HashMap<String,Integer> hm=new HashMap<>();

         //insert-O(1)
         hm.put("India",100);
         hm.put("China",150);
         hm.put("US",50);

         System.out.println(hm);

         //Get5-O(1)
        int population= hm.get("India");
       System.out.println("Population of Indian: " + population);

       //containskey-O(1)
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("Indonesia"));

       //remove-O(1)
       System.out.println(hm.remove("China"));
  System.out.println(hm);

  //size
  System.out.println(hm.size());

  //I Empty
        System.out.println(hm.isEmpty());
    }
        
}
