import java.lang.StringBuilder;
public class day11 {
//  public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//         System.err.println(sb.append(" world"));
//         System.out.println(sb.insert(0, "hi "));
//         System.out.println(sb.replace(0, 2, "hey"));
//         System.out.println( sb.reverse());
//     }

public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("racecar");
  String str = sb.toString();
  String reverse = sb.reverse().toString();
  if(str.equals(reverse)){
    System.err.println("true");
  }  
  else{
    System.err.println("flase");
  }
}
    
}
   
