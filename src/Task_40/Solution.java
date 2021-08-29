package Task_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grfName = reader.readLine();
        Cat catGrf = new Cat(grfName);

        String grmName = reader.readLine();
        Cat catGrm = new Cat(grmName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrf);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrm, catGrf);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather, catGrm, catGrf);

        String doughterName = reader.readLine();
        Cat catDoughter = new Cat(doughterName, catMother, catFather, catGrm, catGrf);




        System.out.println(catGrf);
        System.out.println(catGrm);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDoughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }


        Cat(String fatherName, Cat catGrf) {
            this.name = fatherName;
            this.father = catGrf;
        }

        Cat(String motherName, Cat catGrm, Cat catGrf) {
            this.name = motherName;
            this.mother = catGrm;
        }

        public Cat(String sonName, Cat catMother, Cat catFather, Cat catGrm, Cat catGrf) {
            this.name = sonName;
            this.mother = catMother;
            this.father = catFather;
        }


        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, " + "no father ";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
