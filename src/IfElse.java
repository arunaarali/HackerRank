import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if((N%2 != 0) || (6>=N && N<=20))
        System.out.println("weird");

        else if((N%2 == 0) || (N>=2 && N<5))
            System.out.println("Not weird");

        else
            System.out.println("weird");

    }
}
