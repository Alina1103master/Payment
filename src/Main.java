import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int starting = 100;
        int bonus = 1;
        int payment = 3500;
        if (payment >= 1000) bonus = payment/100;
        int balance = payment + starting + bonus;
        System.out.println(bonus);







    }
}
