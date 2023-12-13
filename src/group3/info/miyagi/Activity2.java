package group3.info.miyagi;

import java.util.Scanner;

public class Activity2 extends BmiBmr2 {

    Scanner scanner = new Scanner(System.in);

    //double weight;
    double activity;

    public void act(){
//        System.out.println("体重を入力してください。");
//        this.weight = scanner.nextDouble();
//        while (0 > weight){
//            System.out.println("そんな人間は存在しましせん。");
//            weight = scanner.nextDouble();
//        }
//        while (500 <= weight){
//            System.out.println("そんな人間は存在しましせん。");
//            weight = scanner.nextDouble();
//        }
        System.out.print("今日は何分歩きましたか？　例）：60(分):");
        int minutes = scanner.nextInt();
        while (0 > minutes) {
            System.out.println("時間の流れは変えられません。");
            minutes = scanner.nextInt();
        }
        while (minutes > 1440){
            System.out.println("人間はそんなに活動できません。");
            minutes = scanner.nextInt();
        }
        int div = 60 / minutes;
        this.activity = weight * 2 / div;

        System.out.println("---------------------------------------------");
        System.out.println("歩行の消費カロリーは" + (int)activity + "です");
        System.out.println("---------------------------------------------");
    }



}
