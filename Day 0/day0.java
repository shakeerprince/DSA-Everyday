

1) Print "Hello, World!"
2) Sum of Two Numbers
3) Factorial of a Number
4) Check if a Number is Prime
5) Reverse a String

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}


class SumOfNum{
    public static void main(String[] args){
        int num1  = 5;
        int num2 = 5;
     int   result  = num1 + num2;
        System.out.print(result);
    }
}


class factorial{
  public static int fact(int n){
            if(n == 0){
                return 1;
            }else{
              return n * fact(n - 1);
            }
        }
        
    public static void main(String[] args){
 System.out.println(fact(5));
}
}


Check if a Number is Prime

public class prime{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        
        for(int i = 2; i< Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(17));
    }
}

public class primeCheck{
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        
        for(int i = 2 ; i<Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
            
        }
        
        return true;
        }
    
    
  public static void main(String[] args){
    System.out.println(isPrime(2));
  }
}


5) Reverse a String
using stringBuilder method
public class RevStr{
    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
         
         System.out.println(reverseString("shaker"));
    }
}


using iteration
class revString{
    public static void main(String[] args){
String str = "hello";
String reversed = "";
for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
}
System.out.println("Reversed string: " + reversed);

}
}














































































