public class Classroom {
    public static void main(String[] args) {

        Wilder bob = new Wilder("Bob", false);
        Wilder bill = new Wilder("Bill", true);
        Wilder alex = new Wilder("Alex", false);
        Wilder eliot = new Wilder("Eliot", true);

        System.out.println(bob.whoAmI());
        System.out.println(bill.whoAmI());
        System.out.println(alex.whoAmI());
        System.out.println(eliot.whoAmI());

    }
}
