package countNums;

public class CountNum {
    public static void main(String[] args) {
        int n= 45536;
        int rem;
        int count=0;
        while(n>0){
          rem=n%10;
          if(rem==5){
            count++;
          }
          n=n/10;
        }
        System.out.println(count);
    }
}
