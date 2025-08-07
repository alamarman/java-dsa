package reverse;

public class ReverseNum {
    public static void main(String[] args) {
        int num=23765;
        int ans=0;
        int rem;
        while (num>0) {
            rem=num%10;
            num/=10;

            ans=ans*10+rem;
        }

        System.out.println(ans);
        
    }
}
