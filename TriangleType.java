import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int c = scanner.nextInt();

        if (isValidTriangle(a, b, c)) {
            System.out.println("Triangle Type: " + getTriangleType(a, b, c));
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static String getTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral Triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }
}
