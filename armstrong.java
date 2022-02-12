import java.util.Scanner;
public class armstrong {
     public static void main(String[] args) { 
         try (Scanner input = new Scanner(System.in)) {
             while(true){
            System.out.println("Enter the number for checking");
             int n=input.nextInt();
             int sum =0;
             int n1=n; //Making a copy of the original number 
             while(n1!=0){
                 int rem=n1%10;
                 sum += rem*rem*rem;
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
