
import java.util.Scanner;
public class divisionby_2 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        while(n>=10){
            n=n/2;
            System.out.println(n);
        }
    }
}
