package group3.info.miyagi;

import java.util.Scanner;

public class BmiBmr {

    public void bmi() {
        Scanner scanner = new Scanner(System.in);

        //変数の宣言
        int gender = 0;     //性別
        double height = 0;  //身長
        double weight = 0;  //体重
        int age = 0;        //年齢
        double bmi = 0;     //bmi値
        double bmr = 0;     //bmr値


        System.out.println("■ＢＭＩ・ＢＭＲチェックを行います\n");
        System.out.println("・ＢＭＩとは体重と身長から算出される肥満度を表す体格指数です。");
        System.out.println("・ＢＭＲとは基礎代謝率のことを意味します。\n　これは24時間何もしなくても体が消費するエネルギーの量のことです。");
        System.out.println("------------------------------------------");

        //性別の入力
        System.out.println("性別を入力してください");
        System.out.print("男性なら「1」、女性なら「2」を入力して下さい。：");
        double sc = scanner.nextDouble();

        while (sc != 1.0 && sc != 2.0) {
            System.out.print("「１」か「２」を入力して下さい。：");
            sc = scanner.nextDouble();
        }
        gender = (int) sc;  // 入力された値をキャストしてgenderに代入

//        if (gender == 1){　//表示確認用
//            System.out.println("性別：男性");
//        }else {
//            System.out.println("性別：女性");
//        }

        //年齢の入力
        System.out.print("年齢を入力してください。例）：60(歳)");
        sc = scanner.nextDouble();
        age = (int) sc;  // 入力された値をキャストしてweightに代入
//        System.out.println("年齢：" + age + "歳");　//表示確認用

        //身長の入力
        System.out.print("身長を入力してください。例）：160(cm)");
        sc = scanner.nextDouble();
        height = sc;  // 入力された値をheightに代入
//        System.out.println("身長：" + height + "cm");　//表示確認用

        //体重の入力
        System.out.print("体重を入力してください。例）：60(kg)");
        sc = scanner.nextDouble();
        weight = sc;  // 入力された値をweightに代入
//        System.out.println("体重：" + weight + "kg");　//表示確認用

        //入力された内容の表示
        System.out.println("------------------------------------------");
        System.out.println("入力された内容は以下です。");
        if (gender == 1) {
            System.out.println("性別：男性");
        } else {
            System.out.println("性別：女性");
        }
        System.out.println("年齢：" + age + "歳");
        System.out.println("身長：" + height + "cm");
        System.out.println("体重：" + weight + "kg");
        System.out.println("------------------------------------------");

        //ＢＭＲの計算
        System.out.println("あなたのＢＭＩとＢＭＲの結果は以下となります。");
        System.out.println("\n");
        switch (gender) {
            case 1:
//                System.out.println("男性の処理");
                bmr = 13.397 * weight + 4.799 * height - 5.677 * age + 88.362;
                //小数点第3位まで表示する
                String menstr = String.format("%.3f", bmr);
                System.out.println("ＢＭＲ（基礎代謝量）は、" + menstr + "です。");
                break;
            case 2:
//                System.out.println("女性の処理");
                bmr = 9.247 * weight + 3.098 * height - 4.33 * age + 447.593;
                //小数点第3位まで表示する
                String womenstr = String.format("%.3f", bmr);
                System.out.println("ＢＭＲ（基礎代謝量）は、" + womenstr + "です。");
                break;
        }

        //ＢＭＩの計算
        bmi = weight / ((height / 100) * (height / 100));
        String bmistr = String.format("%.2f", bmi);
        System.out.println("ＢＭＩ（肥満度）は、" + bmistr + "です。");

        // String型をDouble型に変換
        double bmidouble = Double.parseDouble(bmistr);

        //ＢＭＩの肥満度判定
        //ＢＭＩが18.5未満の時
        if (bmidouble < 18.50) {
            System.out.println("肥満度判定基準は「低体重（やせ）」です。");
            System.out.println("あなたのＢＭＩは標準よりも小さく、痩せていると判定されました。");

            //ＢＭＩが18.5～25.0未満の時
        } else if (bmidouble >= 18.50 & bmidouble < 25.0) {
            System.out.println("肥満度判定基準は「普通体重」です。");
            System.out.println("あなたのＢＭＩは標準の範囲内と判定されました。\n今の体重をキープするように心がけてください。");

            //ＢＭＩが25.0～30.0未満の時
        } else if (bmidouble >= 25.0 & bmidouble < 30.0) {
            System.out.println("肥満度判定基準は「肥満（１度）」です。");
            System.out.println("あなたのＢＭＩは標準よりも高く、肥満気味であると判定されました。");

            //ＢＭＩが30.0～35.0未満の時
        } else if (bmidouble >= 30.0 & bmidouble < 35.0) {
            System.out.println("肥満度判定基準は「肥満（２度）」です。");
            System.out.println("あなたのＢＭＩは標準よりも高く、肥満気味であると判定されました。");

            //ＢＭＩが35.0～40.0未満の時
        } else if (bmidouble >= 35.0 & bmidouble < 40.0) {
            System.out.println("肥満度判定基準は「肥満（３度）」です。");
            System.out.println("あなたのＢＭＩは標準よりも高く、肥満気味であると判定されました。");

            //ＢＭＩが40.0以上の時
        } else if (bmidouble >= 40) {
            System.out.println("肥満度判定基準は「肥満（4度）」です。");
            System.out.println("あなたのＢＭＩは標準よりも高く、肥満気味であると判定されました。");

        }

        System.out.println("------------------------------------------");
        System.out.println("■ＢＭＩ・ＢＭＲチェックを終了します");
    }
}
