public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int added = 1100;
        int bonus = 0;

        if (added > 1000) {
            bonus = added / 100;
        } else {
            bonus = 0;
        }
       
        int finalBalance = initialBalance + added + bonus;

        System.out.println("Итог: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
