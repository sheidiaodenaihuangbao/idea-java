//使用switch把小写类型的char型转化为大写。只转换a,b,c,d,e。其他的输出other。
//提示：String word = scan.next(); char c = word.charAt(0);switch(c){}

import java.util.Scanner;

public class WordChar{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     String word =scan.next();
     char c = word.charAt(0);
     switch(c){
         case 'a':
             System.out.println("A");
             break;
         case 'b':
             System.out.println("B");
             break;
         case 'c':
             System.out.println("C");
             break;
         default:
             System.out.print("other");
             break;
     }
    }
}