import java.util.Scanner;
public class FibonacciSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which you want fibonacci series");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i<=n;i++){
            System.out.print(a+ " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
