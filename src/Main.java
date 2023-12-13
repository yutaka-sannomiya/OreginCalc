import group3.info.miyagi.*;

import java.util.Scanner;
        import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mode;      //モード選択用変数

        System.out.println("***オリジナル電卓***");


        while (true){

            System.out.println("利用したい機能を選択してください。(数字で選択)");
            System.out.println("1:電卓、2:BMI＆BMR、3:消費カロリー、4：摂取カロリー、5:総合機能,0：終了");

            mode = scanner.next();
            int select = TransStoI(mode);

            switch (select){
                case 1:
                    System.out.println("電卓を起動します。");
                    Sub sub = new Sub();
                    sub.calcu();

                    break;
                case 2:
                    System.out.println("BMI&BMRを起動します。");
                    BmiBmr bmiBmr = new BmiBmr();
                    bmiBmr.bmi();
                    break;
                case 3:
                    System.out.println("消費カロリーを起動します。");
                    Supo supo = new Supo();
                    supo.act();
                    supo.su();
                    break;
                case 4:
                    System.out.println("摂取カロリーを起動します。");
                    Sesshucl sesshucl = new Sesshucl();
                    sesshucl.food();
                    break;
                case 5:
                    System.out.println("減量機能を起動します。");
                    BmiBmr2 bmiBmr2 = new BmiBmr2();
                    Supo2 supo2 = new Supo2();
                    Sesshucl2 sesshucl2 = new Sesshucl2();
                    Conp conp = new Conp();
                    conp.bmi();
                    conp.act();
                    conp.su();
                    conp.food();
                    conp.aaa();
                case 0:
                    System.out.println("終了します。");
                    break;
                default:
                    System.out.println("!!!!!!1、2、3、4、0の数字を入力してください。!!!!!!");
                    break;
            }
            if(select == 0){
                break;
            }


        }


    }

    public static int TransStoI(String mode){
        int trans_mode = 0;

        if(checkString(mode)) {
            trans_mode = Integer.valueOf(mode);
        }else{
            trans_mode = 99;
        }
        return trans_mode;

    }

    // 引数で受け取った文字列が数値かどうか正規表現でチェックするメソッド
    public static boolean checkString(String text) {

        boolean res = true;

        Pattern pattern = Pattern.compile("^[0-9]+$|-[0-9]+$");
        res = pattern.matcher(text).matches();

        return res;
    }

}