public class sum0f_even {
    public static void main(String[] args){
        int N=10;
        int sum=0;
        for(int i=1; i<=N; i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of the even numbers from 1 to "+ N+" is "+ sum);
    }
}
