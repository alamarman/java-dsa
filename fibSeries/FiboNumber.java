package fibSeries;

import java.util.Scanner;

public class FiboNumber {
    public static void main(String[] args) {
         int a=0;
         int b=1;
         int temp;
         Scanner in= new Scanner(System.in);
         System.out.println("Enter  term to find its fib");
 int n= in.nextInt();
 try{
if(n>=0){
 if(n==0 || n==1){
  System.out.println("fib number:"+n);
 }else{
    for(int i=2;i<=n;i++){
        temp=b;
        b=a+b;
        a=temp;
    }
    System.out.println("fib number:"+b);
 }
}else{
    System.out.println("pls Enter a poitive integer");
}
 }catch(Exception e){

    System.out.println("Input must be an integer"+ e.getMessage());

 }finally{

     in.close(); 
 }
      

    }
}
