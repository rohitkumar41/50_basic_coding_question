import java.util.Scanner;
public class LargestOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("a is the largest one");
            }else{
                System.out.println("b is the largest one");
            }
        }else if(c>b){
            if(b>a){
                System.out.println("c is the largest one");
            }else{
                System.out.println("b is the largest one");
            }
        }else{
            System.out.println("All are equal");
        }
    }
}
