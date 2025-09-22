public class smallest_4 {
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        if(a<b && a<c && a<d){
            System.out.println(a+ " is smallest from "+ b+" "+c+" "+d);
        }
        else if(b<c && b<d){
            System.out.println(b+ " is smallest from "+ a+" "+c+" "+d);
        }
        else if(c<d){
            System.out.println(c + " is smallest from "+ a+" "+b+" "+d);
        }
        else System.out.println(d + " is smallest from "+ a+" "+b+" "+c);
    }
}
