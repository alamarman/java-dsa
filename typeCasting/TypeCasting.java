package typeCasting;


public class TypeCasting {
 public static void main(String[] args) {
  
   int num =(int)(67.56f);//excplicit type casting (float to int)
   System.out.println(num);

   // automatic type promotion 
//    int a=257;
//    byte b= (byte)(a); //257 %256
//    System.out.println(b);
byte a=40;
byte b=50;
byte c=100;
int d=(a*b)/c;

System.out.println(d);
   

 }   
}
