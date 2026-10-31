import java.util.*;
public class strings_and_stringbuilders {
    public static void main(String[] args) {
        //String Variable Declaration...
        String ch = "Saurav";
        String ch2 = "Saurav";
        
        //String Functions...
        System.out.println(ch.length());
        System.out.println(ch.concat(" World"));
        System.out.println(ch.substring(1,4));
        System.out.println(ch.substring(4));
        System.out.println(ch.equals(ch2));
        System.out.println(ch.contains("orl"));
        System.out.println(ch.indexOf("W"));
        
        //StringBuilder Variable Declaration...
        StringBuilder sb = new StringBuilder("Hello");

        //StringBuilder Functions...
        System.out.println(sb.append("Saurav Singh"));
        System.out.println(sb.insert(2, "W"));
        System.out.println(sb.delete(2, 4));
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        sb.setCharAt(5, 'W');
        System.out.println(sb);
    }
}   
