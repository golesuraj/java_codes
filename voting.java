package java_codes;
import java.io.*;

public class voting {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your age:");
    int age = Integer.parseInt(br.readLine());
if(age >= 18){
    System.out.println("you are eligible to vote");
}else{
    System.out.println("you are not eligible for vote");
}

}
    
    
}
