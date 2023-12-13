package group3.info.miyagi;

import group3.info.miyagi.Activity;

import java.util.Scanner;

public class Supo extends Activity {
    Scanner scanner = new Scanner(System.in);

    int time;
    int minutes;
    double calorie;
    public void su(){
        System.out.println("今日は運動しましたか？");
        System.out.println("-------------------------");
        System.out.println("1:ウォーキング");
        System.out.println("2:ジョギング");
        System.out.println("3:ランニング");
        System.out.println("4:筋トレ");
        System.out.println("5:YouTubeエクササイズ");
        System.out.println("6:自分で入力する");
        System.out.println("7:運動をしていない");
        System.out.println("-------------------------");

        int num = scanner.nextInt();
        while (num >= 8){
            System.out.println("もう一度入力してください。");
            num = scanner.nextInt();
        }

        switch (num) {
            case 1:
                double walking = 4.0 * weight;
                System.out.print("その運動を何分やりましたか？　例）：60(分):");
                time = scanner.nextInt();
                minutes = 60 / time;
                calorie = walking / minutes;
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + (int) (calorie) + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + calorie) + "です");
                System.out.println("-----------------------------------------------------");
                break;

            case 2:
                double jogging = 6.0 * weight;
                System.out.print("その運動を何分やりましたか？　例）：60(分):");
                time = scanner.nextInt();
                minutes = 60 / time;
                calorie = jogging / minutes;
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + (int) (calorie) + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + calorie) + "です");
                System.out.println("-----------------------------------------------------");
                break;

            case 3:
                double running = 8.0 * weight;
                System.out.print("その運動を何分やりましたか？　例）：60(分):");
                time = scanner.nextInt();
                minutes = 60 / time;
                calorie = running / minutes;
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + (int) (calorie) + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + calorie) + "です");
                System.out.println("-----------------------------------------------------");
                break;

            case 4:
                double training = 5.0 * weight;
                System.out.print("その運動を何分やりましたか？　例）：60(分):");
                time = scanner.nextInt();
                minutes = 60 / time;
                calorie = training / minutes;
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + (int) (calorie) + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + calorie) + "です");
                System.out.println("-----------------------------------------------------");
                break;

            case 5:
                double exercise = 6.5 * weight;
                System.out.print("その運動を何分やりましたか？　例）：60(分):");
                time = scanner.nextInt();
                minutes = 60 / time;
                calorie = exercise / minutes;
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + (int) (calorie) + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + calorie) + "です");
                System.out.println("-----------------------------------------------------");
                break;

            case 6:
                System.out.print("消費カロリーを入力してください？　例）：200(kcal):");
                int my = scanner.nextInt();
                while (0 > my){
                    System.out.println("真面目に入力しましょう。");
                    my = scanner.nextInt();
                }
                while (3000 < my){
                    System.out.println("まず不可能です。");
                    my = scanner.nextInt();
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("あなたの運動消費カロリーは" + my + "です");
                System.out.println("今日の消費カロリーは" + (int) (activity + my) + "です");
                System.out.println("-----------------------------------------------------");
                break;
            case 7:
                System.out.println("-----------------------------------------------------");
                System.out.println("今日の消費カロリーは" + (int) (activity) + "です");
                System.out.println("-----------------------------------------------------");
                break;
            default:
        }

    }

}
