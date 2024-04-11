public class Main {
    public static void main(String[] args) {

        Cat catVaska = new Cat("Vaska");
        catVaska.run(150);
        catVaska.swim(5);

        Cat catMurzik = new Cat("Murzik");
        catMurzik.run(250);
        catMurzik.swim(5);

        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(200);
        catBarsik.swim(5);

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(400);
        dogBobik.swim(10);

        Dog dogSharik = new Dog("Sharik");
        dogSharik.run(600);
        dogSharik.swim(10);

        Dog dogTuzik = new Dog("Tuzik");
        dogTuzik.run(500);
        dogTuzik.swim(15);

        Dog dogPolkan = new Dog("Polkan");
        dogPolkan.run(350);
        dogPolkan.swim(5);

        System.out.println("Cats count: " + Cat.getCount());
        System.out.println("Dogs count: " + Dog.getCount());
        int animalsCount = Cat.getCount() + Dog.getCount();
        System.out.println("Animals count: " + animalsCount);
    }
}