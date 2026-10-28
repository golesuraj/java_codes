package java_codes;

import java.io.*;

public class area { 
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the radius of circle :");
        double r = Double.parseDouble(br.readLine());
        double area = 3.14 * r * r;

        System.out.println("area of circle is " + area);
    }

    
}
