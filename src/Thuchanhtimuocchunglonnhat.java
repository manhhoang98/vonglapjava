import  java.util.Scanner;
public class Thuchanhtimuocchunglonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
        }
        else {
            while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            }
            System.out.println("ước chung lớn nhất à : " + a);
        }

    }
}
