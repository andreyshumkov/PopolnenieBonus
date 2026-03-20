public static void main(String[] args) {
    int balance = 130;       // существующий баланс
    int deposit = 900;      // сумма депозита (число, не boolean)

    int percent;
    if (deposit > 1000) {
        percent = deposit / 100;
    } else {
        percent = 0;
    }

    int itogbalance = balance + deposit + percent ;// бонус в деп
    int bonus = 0;
    if (deposit > 1000)
        bonus=deposit  / 100 ;

    System.out.println("Балансик: " + itogbalance);
    System.out.println("Бонусные рубли " + bonus );
}
// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.