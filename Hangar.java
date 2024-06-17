public class Hangar {
    public static void main(String[] args) {
        Car Clio = new Car("Clio", 10000);
        Boat Titanic = new Boat("Titanic", 100000);
        System.err.println(Clio.doStuff());
        System.err.println(Titanic.doStuff());
    }
}
