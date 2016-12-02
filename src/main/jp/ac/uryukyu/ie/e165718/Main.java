package jp.ac.uryukyu.ie.e165718;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("NullPointeExceptionが発生した。");
        }finally{
            System.out.println("スタックトレース");
        }
    }
}
