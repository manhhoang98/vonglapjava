import java.util.Scanner;
public class Thuchanhkiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra :");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("đây không phải số nguyên tố");
        } else {
            int i = 2;
            boolean kiemtra = false;
            while ( i < number ) {
                if (number % i == 0) {
                    kiemtra = true;
                    break;
                }
                i++;
            }
            if (kiemtra) {
                System.out.println(number + " không là số nguyên tố");
            } else {
                System.out.println(number + " là số nguyên tố");
            }
        }
    }
}
