import java.util.Scanner;
public class intro_java2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String name= input.nextLine();
            System.out.println("Hello "+name+" Welcome");
        }
 }
    
}
