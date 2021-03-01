import java.util.Scanner;

public class Operators {

    public static void solution(double meal_cost,int tip_percent, int tax_percent){
        double tip = (meal_cost*tip_percent)/100;
        double tax = (meal_cost*tax_percent)/100;
        int total_cost = (int)Math.round(meal_cost+tip+tax);
        System.out.println(total_cost);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();

        solution(meal_cost,tip_percent,tax_percent);
    }
}
