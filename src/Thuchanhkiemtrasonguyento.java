import java.util.Scanner;
public class Thuchanhkiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra :");
        int number = scanner.nextInt();
        boolean kiemtra = false;
        if (number < 2) {
            System.out.println("đây không phải số nguyên tố");
        } else {
            int i = 2;
            while ( i < number ) {
                double a = number % i;
                if (a == 0) {

                }
            }
            if (count == 2) {
                kiemtra = true;
            }
            if (kiemtra) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " không phải số nguyên tố");
            }
        }
    }
}
