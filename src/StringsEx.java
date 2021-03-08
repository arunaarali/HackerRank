import java.util.Scanner;

public class StringsEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            String even="", odd="";
            for (int j = 0; j < s.length(); j++) {
                if (j%2 == 0){
                    even += s.charAt(j);
                }

                else {
                    odd += s.charAt(j);
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}
