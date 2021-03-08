import java.util.Scanner;

public class ArraysEx {
    //    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What's the array size?");
//        int N = scan.nextInt();
//        int arr[] = new int[N];
//
//        for(int i=0;i<N;i++){
//            arr[i] = scan.nextInt();
//        }
//
//        scan.close();
//
//        for(int i=N-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
