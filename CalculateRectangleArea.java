import java.util.Scanner;

public class CalculateRectangleArea {

    public static int rectangleArea(int width, int length) {
        return  width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();

        int area = rectangleArea(width, length);
        System.out.println(area);
    }
}
