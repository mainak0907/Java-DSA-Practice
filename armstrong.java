import java.util.Scanner;
import java.lang.Math;
public class armstrong {
     public static void main(String[] args) { 
         try (Scanner input = new Scanner(System.in)) {
             while(true){
            System.out.println("Enter the number for checking");
             int n=input.nextInt();
             int sum =0;
             int digit=0;
             int temp=n;
             int n1=n; //Making a copy of the original number 
             while(temp!=0){
                 temp=temp/10;
                 digit++;}
             while(n1!=0){
                 int rem=n1%10;
                 sum += (Math.pow(rem,digit));
                 n1=n1/10;
                }
                if(sum==n){
                    System.out.println(" armstrong ");
                }
                else{
                    System.out.println(" not armstrong ");
                }
        }
    }
}
}
