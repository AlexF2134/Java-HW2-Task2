##Задание 2. "Получи рубль за каждые 100!" 

Условие : Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей

      public class Main { 
        public static void main(String[] args) {

        int accountInitialRubles = 100;

        int accountIncreaseRubles = 100;

        int bonusRubles = (accountIncreaseRubles / 100);


        if (accountIncreaseRubles >= 1000) {
            System.out.println(accountInitialRubles + accountIncreaseRubles + bonusRubles);
        } else {
            System.out.println(accountInitialRubles + accountIncreaseRubles);
        }
      }
    }

Условие : Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей

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