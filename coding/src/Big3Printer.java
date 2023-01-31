import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘의 할 일 세 가지를 입력하세요.");
        String task1 = scanner.next();
        String task2 = scanner.next();
        String task3 = scanner.next();
        System.out.println("할 일1: " + task1 + System.lineSeparator());
        System.out.println("할 일2: " + task2 + System.lineSeparator());
        System.out.println("할 일3: " + task3 + System.lineSeparator());
        System.out.println("오늘의 할 일 Big3는");
        System.out.println("1. " + task1);
        System.out.println("2. " + task2);
        System.out.println("3. " + task3);
    }
}


