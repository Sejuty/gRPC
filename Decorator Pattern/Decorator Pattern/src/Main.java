public class Main {
    public static void main(String[] args) {
        System.out.println(new Discount(new Chocolate(new Sugar(new Cuppucino()))).cost());
        System.out.println(new Chocolate(new Sugar(new Milk(new Cuppucino()))).cost());
    }
}
