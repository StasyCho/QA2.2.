public class Main {
    public static void main(String[] args) {
        int account = 500;// начальный счёт
        int refill = 455; // сумма пополнения
        int minimal = 100; //минимальная сумма пополнения для зачисления 1 бонусного рубля

        int bonus; // бонусные рубли
        if (refill >= minimal) {
            bonus = refill / minimal;
        } else {
            bonus = 0;
        } // Условным оператором проверяем, превысила ли сумма пополнения порог
        //для двух разных сценариев рассчитываем сумму бонуса

        int finalAccount = account + refill + bonus; // переменная итогового счёта

        System.out.println(finalAccount); // выводим итоговый счёт на экран

    }
}