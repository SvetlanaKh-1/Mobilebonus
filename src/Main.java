public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int income = 1001;
        int oneBonus = 100;

        int bonus = (income > 1000) ? (income / oneBonus) : 0;

        int totalBalance = balance + income + bonus;

        System.out.println("Итоговый баланс: " + totalBalance);
    }
}