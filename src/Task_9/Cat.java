package Task_9;

public class Cat
{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
        Cat luffy = new Cat("Луффи", 3);

        luffy.sayMeow();
        luffy.jump();
    }
}