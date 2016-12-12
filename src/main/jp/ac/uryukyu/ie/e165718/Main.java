package jp.ac.uryukyu.ie.e165718;

public class Main {
    public static void main(String[] args) {
        String str = "3．14";
        double value = Double.parseDouble(str);
        try {
            str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが起きた");
            e.printStackTrace();
        }
    }
}