public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int income = 1001;
        int bonus = (income > 1000) ? (income / 100) : 0;
        int totalBalance = balance + income + bonus;

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый баланс: " + totalBalance);
    }
}