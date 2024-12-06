//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 100;  // баланс счёта
        int added = 1_100;   // пополнение
        int bonus = added / 100; // бонус
        int finalBalance = balance + added; // баланс + пополнение
        System.out.println (added <= 1000?
                ("Итоговый баланс: " + finalBalance + " рублей."):
                ("Итоговый баланс: " + (finalBalance + bonus) + " рублей."));

        if (added >= 1000) { // пополнение больше/равно 1000
            System.out.println("Итого бонусов: " + bonus);
        } else if (added < 1000) { // пополение менее 1000
            System.out.println("Итого бонусов: " + 0);
        }

    }

}