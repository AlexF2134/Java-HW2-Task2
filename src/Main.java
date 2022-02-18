public class Main {
    public static void main(String[] args) {

        int accountInitialRubles = 100;

        int accountIncreaseRubles = 1100;

        int bonusRubles = (accountIncreaseRubles / 100);


        if (accountIncreaseRubles >= 1000) {
            System.out.println(accountInitialRubles + accountIncreaseRubles + bonusRubles);
        } else {
            System.out.println(accountInitialRubles + accountIncreaseRubles);
        }
    }
}
