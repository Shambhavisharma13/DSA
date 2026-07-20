
import java.util.*;
public class ArrayL {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<String> list1=new ArrayList<>();
        // ArrayList<Boolean> list2=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(5);
        // System.out.println(list.size());
        // //print the arraylist
         
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");

        // }
        // list.add(1,9);//o(n)
        // System.out.println(list);
        // //get operation
        // list.get(2);
        // //delete
        // list.remove(2);
        // System.out.println(list);
        // //set
        // list.set(2,7);
        // System.out.println(list);
        // //conatains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        //Reverse print
      
        // int idx1=1,idx2=3;
        // System.out.println(list);
        // swap(list,idx1,idx2);
        // System.out.println(list);
    //     System.out.println(list);
    //     Collections.sort(list);//ascending
    //     System.out.println(list);
    //     //descending
    //     Collections.sort(list,Collections.reverseOrder());
    //    System.out.println(list);
         //comparator-fnx logic
ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
ArrayList<Integer>list3=new ArrayList<>();
list3.add(1);list3.add(2);
mainList.add(list3);

ArrayList<Integer>list2=new ArrayList<>();
list2.add(3);list2.add(4);
mainList.add(list2);
for(int i=0;i<mainList.size();i++){
    ArrayList<Integer>currList=mainList.get(i);
    for(int j=0;j<currList.size();j++){
        System.out.print(currList.get(j)+" ");
    }
    System.out.println(mainList);
}
    }
    
}
