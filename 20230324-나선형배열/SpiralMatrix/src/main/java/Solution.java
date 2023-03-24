import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 한 변 길이 : ");
        int arraySize = scanner.nextInt();

        System.out.println("나선형 배열 : ");

        int[][] array = new int[arraySize][arraySize];

        int row = 0; // 행
        int column = -1; // 열
        int repeat = arraySize; // 반복횟수
        int increase = 1; // 증감
        int number = 0; // 값

        while (true) {
            // 행 고정 열 변화
            for (int i = 0; i < repeat; i += 1) {
                column += increase;
                array[row][column] = number;
                number += 1;
            }
            repeat -= 1;
            if (repeat == 0) {
                break;
            }

            // 열 고정 행 변화
            for (int j = 0; j < repeat; j += 1) {
                row += increase;
                array[row][column] = number;
                number += 1;
            }
            increase *= -1;
        }

        for (int i = 0; i < arraySize; i += 1) {
            for (int j = 0; j < arraySize; j += 1) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}
