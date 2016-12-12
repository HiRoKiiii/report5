package jp.ac.uryukyu.ie.e165718;

public class Main {
    public static void main(String[] args) {
        String str = null;
        double value = Double.parseDouble(str);
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが起きた");
            e.printStackTrace();
        }
    }
}