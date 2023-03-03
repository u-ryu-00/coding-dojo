import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("3진법 뒤집기");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stringN = Integer.toString(n, 3);
        System.out.println("3진법: " + stringN);
        StringBuffer stringBuffer = new StringBuffer(stringN);
        String reverse = stringBuffer.reverse().toString();
        System.out.println("앞뒤반전3진법: " + reverse);
        String[] array = reverse.split("");

        int multi = 1;
        int result = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result += Integer.parseInt(array[i]) * multi;
            multi *= 3;
        }
        System.out.println(result);
    }
}
