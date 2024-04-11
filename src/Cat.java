public class Cat extends Animal {
    private final int limitRun = 200;

    private String name;

    private static int count = 0;

    public Cat(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance > limitRun) {
            System.out.println("Cat can't run more than " + limitRun + " meters");
        } else {
            System.out.println(getName() + " ran " + distance + " meters");
        }
    }

    public void swim(int distance) {
        System.out.println("Cat can't swim");
    }

    public static int getCount() {
        return count;
    }
}
