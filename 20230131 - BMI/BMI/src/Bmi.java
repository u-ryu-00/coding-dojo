import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        Double height = scanner.nextDouble();
        Double weight = scanner.nextDouble();
        Double bmi = weight / (height*height);

        System.out.println("BMI 측정기");
        System.out.println("신장(m): " + height);
        System.out.println("체중(kg): " + weight);

        if(bmi <= 18.5){
            System.out.println("비만도 결과: 저체중");
        }

        if(bmi > 18.5 && bmi <= 23){
            System.out.println("비만도 결과: 정상");
        }

        if(bmi > 23 && bmi <= 25){
           System.out.println("비만도 결과: 과체중");
        }

        if(bmi > 25){
            System.out.println("비만도 결과: 비만");
        }

        System.out.println("BMI: " + bmi);

    }
}
