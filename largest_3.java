public class largest_3 {
    public static void main(String[] args){
        int a=2;
        int b=4;
        int c=3;
        if(a>b && a>c){
            System.out.println("the largest among "+ a+" "+ b+" "+ c+ " is "+ a);
        }
        else if(b>c){
            System.out.println("the largest among "+ a+" "+ b+" "+ c+ " is "+ b);
        }
        else{
            System.out.println("the largest among "+ a+" "+ b+" "+ c+ " is "+ c);
        }
    }
}
