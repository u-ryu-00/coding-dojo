import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String answer = "";
        if(num % 2 == 1 || num % 2 == -1){
            answer = "Odd";
        }
        if(num % 2 == 0){
            answer = "Even";
        }

        System.out.println(answer);
    }
}
