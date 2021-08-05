package Task_26;

public class Solution
{
    public static void main(String[] args) {
        Cat dook = new Cat("Dook", 5, 6,7);
        Cat vasyan = new Cat("Vasyan", 7,8,4);
        Cat vupsen = new Cat("Vupsen", 3, 5, 5);

        System.out.println(dook.fight(vasyan));
        System.out.println(dook.fight(vupsen));
        System.out.println(vasyan.fight(vupsen));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}
