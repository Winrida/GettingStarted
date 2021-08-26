package Task_38;

public class Dog
{
    String name;

    public static void main(String[] args) {
        // Создадим объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Кузя";

        // Теперь создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        // и поместим в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Теперь получаем к ним доступ с помощью ссылок из массива
        myDogs[0].name = "Сильвия";
        myDogs[1].name = "Барт";

        System.out.println("Имя последней собаки - " + myDogs[2].name);

        //Вызовем для каждого метод bark()
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }
}
