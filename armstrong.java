package java_codes;

public class armstrong {
    public static void main(String[] args){
        int n = 153;
        int sum = 0;
        while(n > 0){
        int digit = n%10;
      
        n = n/10;
        sum = sum + digit*digit*digit;
        }
        if(sum == 153){
            System.out.println("The number is an Armstrong number.");
        }else{
            System.out.println("The number is not an Armstrong number.");
        }
        System.out.println(sum);

    
    }
    
}
