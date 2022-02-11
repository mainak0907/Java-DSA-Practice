import java.util.Scanner;
public class intro_java
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int a= input.nextInt();
            if (a%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");
            }
        }

    }
}
