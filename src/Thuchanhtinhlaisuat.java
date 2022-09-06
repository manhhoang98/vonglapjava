import java.util.Scanner;
public class Thuchanhtinhlaisuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số tiền gửi : ");
        double money = 1.0;
        money = scanner.nextDouble();

        System.out.print("nhập số tháng gửi :" );
        double month = 1;
        month = scanner.nextDouble();

        System.out.print("nhập lãi suất tháng");
        double laisuat = 1.0;
        laisuat = scanner.nextDouble();

        double tongtien = 0;
        for(int i = 0; i < month; i++){
            tongtien += money * laisuat/100 * month;
        }
        System.out.println("số tiền nhận được sau : "+month + " tháng là "+ tongtien + "VND");
    }
}
