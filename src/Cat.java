public class Cat extends Animal {
    private final int limitRun = 200;
    private String name;

    public Cat(String name) {
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
            System.out.println("Cat can't run more than " + limitRun + " meters");
        } else {
            System.out.println(name + " ran " + distance + " meters");
        }
    }

    public void swim(int distance) {
        System.out.println("Cat can't swim");
    }
}
