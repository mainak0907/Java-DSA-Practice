import java.util.Scanner;
 class Palindrome_string {
     public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            String reverse="";
             System.out.println("Enter the string to be checked");
             String original= sc.nextLine();
             int length=original.length();
             for (int i = length-1 ; i>=0;i--){
                 reverse=reverse+original.charAt(i);
             }
             if(original.equals(reverse)){
                 System.out.println("Palindrome");
             }
             else{
                System.out.println(" NOt Palindrome");
             }
        }

     }
    
}
