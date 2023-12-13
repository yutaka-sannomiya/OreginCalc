package group3.info.miyagi;

import java.util.Arrays;
import java.util.Scanner;

public class Sesshucl {
    public void food() {
        Scanner scanner = new Scanner(System.in);

        int SesshuclTotal = 0; //摂取総カロリーの変数宣言
        String[] meal = {"朝", "昼", "夜"}; //朝昼夜の食事の配列作成

        String[] food = {"0：ごはん140g", "1：パン1枚", "2：ラーメン", "3：カレーライス"}; //foodの種類を入れる配列作成
        int[] cl = {235, 177, 443, 954}; //摂取カロリーも入れる配列作成

        System.out.println("\t");
        System.out.println("◆◆摂取カロリーを計算します。◆◆");
        System.out.println("\t");


        for (int counter = 0; counter < 3; counter++) {    //食事回数カウントする変数宣言
            System.out.println(meal[counter] + "ご飯食べましたか？");
            System.out.print("食べたなら「1」、食べてないなら「2」を入力して下さい。：");

            {int ate = scanner.nextInt();
                while (ate != 1 && ate != 2)   //ate1と2以外が入力された場合
                {System.out.print("「1」か「2」を入力して下さい。：");
                    ate = scanner.nextInt();
                }
                if (ate == 1) {  //ate1が入力された場合
                    System.out.println("1：食べた");
                    System.out.println("\t");
                    System.out.println("何を食べましたか？以下から選んで数字を入力してください。");
                    System.out.print(Arrays.toString(food) + "：");  //food配列の要素の表示


                }if (ate ==2){
                System.out.println("-----------------------------------------------------------");
                System.out.println("\t");
                continue;}  //ate2が入力された場合

                {int foodType = scanner.nextInt();
                    while (foodType >= 4) {  //foodType4以上が入力された場合
                        System.out.print("「0」～「3」を入力してください。：");
                        foodType = scanner.nextInt();

                    }
                    if(foodType <4){ //foodType4未満が入力された場合
                        System.out.println(food[foodType] + " " + cl[foodType] + "kcal"); //foodTypeとカロリー表示
                        SesshuclTotal = SesshuclTotal + cl[foodType]; //摂取総カロリーの変数にカロリーを代入
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("\t");

                    } }

            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("総摂取カロリーは" + SesshuclTotal + "kcalです。"); //総摂取カロリーを表示
        System.out.println("-----------------------------------------------");
    }
}
