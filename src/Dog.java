public class Dog extends Animal{
    private final int limitRun = 500;
    private final int limitSwim = 10;

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance > limitRun) {
            System.out.println("Dog can't run more than " + limitRun + " meters");
        } else {
            System.out.println(name + " ran " + distance + " meters");
        }
    }

    public void swim(int distance) {
        if (distance > limitSwim) {
            System.out.println("Dog can't swim more than " + limitSwim + " meters");
        } else {
            System.out.println(name + " swam " + distance + " meters");
        }
    }
}
