import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: " );
        int num=sc.nextInt();
        if(num==21){
            System.out.println("You are eligible for casting the vote");
        }else{
            System.out.println("you are not eligible for casting the vote");
        }
    }
}
