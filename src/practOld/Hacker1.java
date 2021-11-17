package practOld;

import java.io.IOException;

public class Hacker1 {

    public static char readInt(){
        char c='\u0000';
       int input =0;
       try{
           input =System.in.read();
           if(input !=-1){
               c=(char)input;
           }
       } catch (IOException e) {
           System.out.println("An Exception occured while reading");
       }
       return c;
    }
    public static void main(String[] args) {

        char c= Hacker1.readInt();
        System.out.println(c);
    }
}
