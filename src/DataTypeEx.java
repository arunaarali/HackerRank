import java.util.Scanner;

public class DataTypeEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        //declaring int, double and string variables
        int i1;
        double d1;
        String s1;

        //reading values of above variables from scanner input
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();

        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+s1);


    }
}
