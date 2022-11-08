public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car ("Clio", 12345) ;
        Boat titanic = new Boat ("Titanic", 1245) ;
        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
