package java_codes;
import java.io.*;
public class str_length {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str = br.readLine();

        System.out.println("length of string is " + str.length());


    }

    
}
