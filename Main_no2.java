public class Main_no2 {
    public static void main(String[] args) {
        Website website = new Website();
        Account a = website.addAccount("Si Madun","ABCD");
        Account b = website.addAccount("Si Madun", "ABCD");
        System.out.println(a);
        System.out.println(b);
        website.login("Si Madun","G<I>");
        website.login("Si Madun","ABCD");
    }
}