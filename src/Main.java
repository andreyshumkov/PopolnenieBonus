public static void main(String[] args) {
    int balance = 130;       // существующий баланс
    int deposit = 900;      // сумма депозита (число, не boolean)

    int percent;
    if (deposit > 1000) {
        percent = deposit / 100;
    } else {
        percent = 0;
    }

    int itogbalance = balance + deposit + percent;// бонус в депозит
    int bonus = 0;
    if (deposit > 1000)
        bonus = deposit / 100;

    System.out.println("Балансик: " + itogbalance);
    System.out.println("Бонусные рубли " + bonus);
}
