package Task_25;

public class Solution
{
    public static void main(String[] args) {
        Cat elvis = new Cat("Elvis", 4, 10, 4);
        Cat luk = new Cat("Luk", 1, 2, 2);
        Cat bimbo = new Cat("Bimbo", 8,5, 5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
