public class Main {
    public static void main(String[] args) {

        int getAmountMoneyAccount = 10;
        int amountadding = 1001;
        int bonus;
        if (amountadding > 1000) {
            bonus = amountadding / 100;
        } else {
            bonus = 0;
        }


        int balance = amountadding + bonus + getAmountMoneyAccount;
        System.out.println("Баланс: " + balance);
        System.out.println("Бонус: " + bonus);
    }
}

