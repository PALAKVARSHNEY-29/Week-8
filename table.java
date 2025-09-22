import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("the table of "+ n +" is:");
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+ i+ " = "+(n*i));
        }
    }
}