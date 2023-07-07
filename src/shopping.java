public class shopping {
    public static void main(String[] args) {
        int money = 100;
        int breadPrise = 60;
        int moneyAfterShopping = money-breadPrise;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -=moneyAfterShopping >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);

    }
}
