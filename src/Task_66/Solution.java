package Task_66;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human children1 = new Human("Bob", true, 6);
        Human children2 = new Human("NeBob", false, 3);
        Human children3 = new Human("NavernoeBob", true, 6);

        Human father = new Human("Zac", true, 27, children1, children2, children3);
        Human mother = new Human("Melon", false, 25, children1, children2, children3);

        Human gf1 = new Human("BigZac", true, 47, father);
        Human gm1 = new Human("SmallZac", false, 47, father);

        Human gf2 = new Human("BigMelon", true, 50, mother);
        Human gm2 = new Human("SmallMelon", false, 54, mother);

        System.out.println();

    }

    public static class Human {
        public String name;
        public Boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this);
        }

        public Human(String name, boolean sex, int age, Human ... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
            System.out.println(this);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
