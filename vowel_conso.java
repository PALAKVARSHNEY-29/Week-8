public class vowel_conso {
    public static void main(String[] args){
        char upper = 'B';
        char ch = Character.toLowerCase(upper);
        if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            System.out.println("the character '"+ upper +"' is vowel");
        }
        else{
            System.out.println("The character '" +upper+"' is consonent");
        }
    }
}
