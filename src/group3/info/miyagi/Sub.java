package group3.info.miyagi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Sub {
    Scanner scanner = new Scanner(System.in);

    public void calcu() {

        String[] calc = {"0:足し算", "1:引き算", "2:掛け算", "3:割り算"};
        System.out.println("\n");
        System.out.println("◆◆四則演算を行います。◆◆");
        System.out.println("\n");
        System.out.println("何を行いますか？下記から選び数字を入力してください");

        System.out.print(Arrays.toString(calc) +" :");
        int num = scanner.nextInt();
        System.out.println("------------------------------------------------------------");
        while (num >= 4){
            System.out.println("もう一度、0～3の数字で入力して下さい。");
            num =scanner.nextInt();
        }
        if (num == 0) {
            System.out.println(calc[num] + "を行います。");
            System.out.print("数値を入力してください。：");
            double num1 = scanner.nextDouble();
            System.out.print("次の数値を入力してください。：");
            double num2 = scanner.nextDouble();
            BigDecimal numB1 = new BigDecimal(String.valueOf(num1));
            BigDecimal numB2 = new BigDecimal(String.valueOf(num2));
            BigDecimal numB3 = (numB1.add(numB2));
            System.out.println(num1 + " + " + num2 + " の結果は　『 " + numB3 + " 』　です。");
        }if (num == 1) {
            System.out.println(calc[num] + "を行います。");
            System.out.print("数値を入力してください。：");
            double num1 = scanner.nextDouble();
            System.out.print("次の数値を入力してください。：");
            double num2 = scanner.nextDouble();
            BigDecimal numB1 = new BigDecimal(String.valueOf(num1));
            BigDecimal numB2 = new BigDecimal(String.valueOf(num2));
            BigDecimal numB3 = (numB1.subtract(numB2));
            System.out.println(num1 + " - " + num2 + " の結果は　『 " + numB3 + " 』　です。");
        }else if (num == 2){
            System.out.println(calc[num] + "を行います。");
            System.out.print("数値を入力してください。：");
            double num1 = scanner.nextDouble();
            System.out.print("次の数値を入力してください。：");
            double num2 = scanner.nextDouble();
            BigDecimal numB1 = new BigDecimal(String.valueOf(num1));
            BigDecimal numB2 = new BigDecimal(String.valueOf(num2));
            BigDecimal numB3 = (numB1.multiply(numB2));
            System.out.println(num1 + " × " + num2 + " の結果は　『 " + numB3 + " 』　です。");
        }else if (num == 3){
            System.out.println(calc[num] + "を行います。");
            System.out.print("数値を入力してください。：");
            double num1 = scanner.nextDouble();
            System.out.print("次の数値を入力してください。：");
            double num2 = scanner.nextDouble();
            if(num1 == 0 || num2 ==0){
                System.out.println(num1 + " ÷ " + num2 + " の結果は　『0』です。");
                return;
            }
            System.out.println("\n");
            BigDecimal numB1 = new BigDecimal(String.valueOf(num1));
            BigDecimal numB2 = new BigDecimal(String.valueOf(num2));
            BigDecimal numB3 = (numB1.divide(numB2,4,RoundingMode.HALF_UP));
            System.out.println(num1 + "÷" + num2 + "の結果は　『 " + numB3 + " 』　です。");
        }
    }

}
