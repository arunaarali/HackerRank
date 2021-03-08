import java.util.*;
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            String[] tokens = s.split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            for(String token:tokens){
                System.out.println(token);
            }
        }
        scan.close();
    }
}
