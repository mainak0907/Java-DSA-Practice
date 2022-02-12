import java.util.Scanner;
 class diff_sum_prod_lc {
     public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            int sum=0;
             int prod=1;
             System.out.println("Enter the num");
             int n=sc.nextInt();
             while(n!=0){
                 int r=n%10;
                 sum +=r;
                 prod=prod*r;
                 n=n/10;
             }
             int diff=prod-sum;
             System.out.println("The sum of digits is "+ sum);
             System.out.println("The product of digits is "+ prod);
             System.out.println("The difference is "+diff);
        }

        }
    }
