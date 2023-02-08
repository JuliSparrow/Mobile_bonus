public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 900;
        int amount = 100;
        int minAmount = 1000;
        int bonusCost = 100;
        int bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (amount > minAmount) {
            bonus = amount / bonusCost;
        } else {
            bonus = 0;
        }
        balance = balance + amount + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}
