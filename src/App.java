public class App {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", "Beagle", 9);
        Dog spike = new Dog("Spike", "Beagle", 10);
        Cat garfield = new Cat("Garfield", "Orange, Black-Striped", 14);
        Cat tom = new Cat("Tom", "Grayish-Blue", 30);

        System.out.println(snoopy.getName() + " is a " + snoopy.getBreed() + " aged " + snoopy.getAge());
        System.out.println(garfield.getName() + " is a " + garfield.getColor() + " cat aged " + garfield.getAge());

    }

}
