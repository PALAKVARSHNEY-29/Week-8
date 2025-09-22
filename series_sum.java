import java.util.Scanner;

public class series_sum {
    public static void main(String[] args){
        System.out.println("enter number to calculate it's linear series sum:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("the sum of the series made is: "+ sum);
    }
}
