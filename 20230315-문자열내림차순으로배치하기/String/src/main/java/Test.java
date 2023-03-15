import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] string = s.split("");

        for (String value : string) {
            System.out.println(value);
        }
        Arrays.sort(string, Collections.reverseOrder());
        String joinString = String.join("", string);
        System.out.println("정답은? " + joinString);
    }
}
