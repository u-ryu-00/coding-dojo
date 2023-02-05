import java.util.Scanner;
import java.text.DecimalFormat;


public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");
        int a = scanner.nextInt();
        System.out.println("적금 기간을 입력해주세요(년):");
        int y = scanner.nextInt();
        System.out.println("연이자율을 입력해주세요(%)");
        double y_rate = scanner.nextDouble(); // 연이자율

        int m = y * 12;
        int sum = a * m;
        System.out.println("원금합계: " + decimalFormat.format(sum) + "원");

        double r = (y_rate * 0.01) / 12; // 월이자
        double interest = Math.round((a * (1 + r) * (Math.pow(1 + r, m) - 1) / r - sum) * 0.846);
        System.out.println("세후이자: " + decimalFormat.format(interest) + "원");
        System.out.println("세후 총 수령액: " + decimalFormat.format(sum + interest) + "원");
    }
}

