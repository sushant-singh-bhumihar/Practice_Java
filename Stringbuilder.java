import java.util.*;
public class Stringbuilder{
    public static void main(String args[]){
    //we use stringbuilder when we have to change or modify previous string bcz it save time and memry 
    //without creating any new string
StringBuilder sb = new StringBuilder("sushant kumar"); 
System.out.println(sb);
//to print Character
System.out.println(sb.charAt(2)) ;  //show char at 2nd Indexxxxxx

 //set any char at previoss char
 sb.setCharAt(2,'k'); 
 System.out.println(sb);
 //s replaces by kumar
 //to insert any char ,add any char at any Indexxxxxx
 sb.insert(2,'s');
 System.out.println(sb);
  //to delete
  //string_name.delete(start_index,stop_index_)
  sb.delete(0,6);
  System.out.println(sb);
  //append that is adding in ClassNotFoundException
  sb.append("e");     //for string  :str=str+"e"
  sb.append("ll");    //str=str+"ll"
  sb.append("o");  //str=str+"o"
System.out.println(sb);
//for length same as string
System.out.println(sb.length());
//to reverse string
for(int i=0;i<sb.length()/2;i++ ){
    int front = i;
    int back = sb.length()-1-i;
    char frontChar=sb.charAt(front);
    char backChar=sb.charAt(back);
    sb.setCharAt(front,backChar);
    sb.setCharAt(back,frontChar);
}
System.out.println(sb);
        
    }
}