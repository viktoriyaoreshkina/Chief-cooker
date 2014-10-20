package simple;

import javax.swing.*;

/**
 * Created by Viktoriya_Oreshkina on 19-Oct-14.
 */
public class Hello
{
    public static void main(String[] args) {
        Cucumber cu = new Cucumber("sort1", 30);
        Carrots car = new Carrots("sort2", 150);
        Pumpkin pum = new Pumpkin("sort3", 500);
        Beet beet = new Beet("sort4", 140);

        //салат
        System.out.println("Salad composition: " + cu.getName() + " " + car.getName() + " " + pum.getName() + " " + beet.getName());

        //количество калорий в салате
        int sumCaloric;
        sumCaloric = cu.getCaloric() + car.getCaloric() + pum.getCaloric() + beet.getCaloric();
        System.out.println("Salad caloric: " + sumCaloric + " ККал");

        //сортировка овощей по количеству калория


        //



        System.out.println("Название овоща: " + cu.getName());
        System.out.println("Сорт:" + cu.getSortName());
        System.out.println("Содержание калорий в 100 гр.: " + cu.getCaloric() + " Ккал");


    }

  /*  public static void main(String[] args)
    {
        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
    }

    public static void main(String[] args) {
        Dog ourdog = new Dog();
        ourdog.eat();
        ourdog.play();
        String saydog = ourdog.speak("I'm a dog");
        System.out.println(saydog);
    }*/


}
