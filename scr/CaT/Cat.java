package CaT;

public class Cat {
    private String name;
    private boolean hungry = true;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if (hungry) {
            System.out.println(name + " is eating " + food);
            hungry = false;
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void play(String toy) {
        System.out.println(name + " is playing around with " + toy);
    }

    public void sleep(int hours) {
        System.out.println(name + " is going to sleep for " + hours + " hours");
        hungry = true;
    }

    public void isHungry() {
        if (hungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

}
