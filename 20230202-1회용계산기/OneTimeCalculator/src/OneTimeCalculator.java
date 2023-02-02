import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("급할 때 사용하는 일회용 계산기");
        System.out.println("숫자를 입력해 주세요:");
        double num1 = scanner.nextDouble();
        System.out.println("연산자를 선택해주세요:");
        System.out.println("1. + (더하기)");
        System.out.println("2. - (빼기)");
        System.out.println("3. * (곱하기)");
        System.out.println("4. / (나누기)");
        int op = scanner.nextInt();
        System.out.println("숫자를 입력해 주세요:");
        double num2 = scanner.nextDouble();

        if(op == 1){
            System.out.println("계산 결과: " + (num1 + num2));
        }
        if(op == 2){
            System.out.println("계산 결과: " + (num1 - num2));
        }
        if(op == 3){
            System.out.println("계산 결과: " + (num1 * num2));
        }
        if(op == 4){
            System.out.println("계산 결과: " + (num1 / num2));
        }

    }
}
