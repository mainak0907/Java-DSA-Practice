import java.util.Scanner;
public class currency{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            while (true){
            System.out.println("Enter R for Rupee or D for dollars");
            char ch=input.next().trim().charAt(0);
            if(ch=='R'){
                Float Dollars=input.nextFloat();
                Float res= Dollars*75;
                System.out.println("Currency in Rupees  "+res);
            }
            else if (ch=='D'){
               Float rupess =input.nextFloat();
               Float res= rupess/75;
               System.out.println("Currency in Dollars  "+res);
            }
            else{
                System.out.println("Invalid Input");
            }
   }
        }
}
}