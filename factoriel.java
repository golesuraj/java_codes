package java_codes;

public class factoriel {
   static int fact(int n){
    if(n == 0)
        return 1;
        return n * fact(n-1);
    
    
   } 

public static void main(String[] args){
    int n = 5;
    System.out.println("factoriel of first " + n+ "number = " + fact(n));
}
}


