import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Input a: ");
        a = scanner.nextInt();
        System.out.println("Input b: ");
        b = scanner.nextInt();
        System.out.println(GreatestCommonFactor.check(a,b));
    }
    public static String check(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            return "There is no common factor";
        }
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return "The greatest common factor is " + a;
    }
}
