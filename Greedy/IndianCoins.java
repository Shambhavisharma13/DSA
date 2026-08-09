
import java.util.*;
public class IndianCoins {
    public static void main(String args[]){
        int coins[]={1,2,5,10,20,50,100,500,2000};


        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();
         for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
         }
         System.out.println("total (min) coins used ="+ countOfCoins);
         for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
         }
         System.out.println();


    }
}
