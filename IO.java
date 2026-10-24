import java.io.*;
import java.util.*;

public class IO {
    public static void main(String[] args)throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        char ch;

        System.out.println("Enter five character");

        while(count<5){
            ch = (char)obj.read();
            System.out.println(ch);
            count++;
        }
    } 
    
}
