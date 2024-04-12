public class Dog extends Animal{
    private final int limitRun = 500;
    private final int limitSwim = 10;

    private static int count = 0;

    private String name;

    public Dog(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance > limitRun) {
            System.out.println("Dog can't run more than " + limitRun + " meters");
        } else {
            System.out.println(getName()+ " ran " + distance + " meters");
        }
    }

    public void swim(int distance) {
        if (distance > limitSwim) {
            System.out.println("Dog can't swim more than " + limitSwim + " meters");
        } else {
            System.out.println(getName() + " swam " + distance + " meters");
        }
    }

    public static int getCount() {
        return count;
    }
}
