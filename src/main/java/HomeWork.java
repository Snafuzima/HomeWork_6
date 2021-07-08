import jdk.jshell.Snippet;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class HomeWork {

     public static void main(String[] args) {

         Animal[] animals = {
                    new Cat("Барсик"),
                    new Dog("Карат"),
                    new Cat("Мурзик"),
                    new Dog("Рекс")
         };

         for (int i = 0; i < animals.length; i++) {
             animals[i].getInfo();

             if(animals[i] instanceof Cat){
                 System.out.printf("%s хотел(а) поплавать, но коты боятся воды :(\n",animals[i].getName());
                 System.out.println();
             } else {
                 System.out.printf("%s отправляется в плавание!\n",animals[i].getName());
                 animals[i].swim(getDistance());
                 System.out.println();
             }
             System.out.printf("%s хочет побегать!\n",animals[i].getName());
             animals[i].run(getDistance());

             System.out.println();
         }

         getAllNum();



     }

     public static int getDistance() {
         Scanner sc= new Scanner(System.in);
         System.out.print("Введите дистанцию --->");
         int distance=sc.nextInt();
         return distance;
     }

    public static void getAllNum() {
        System.out.println("Всего животных: "+Animal.getNum());
        System.out.println("Всего котов: "+Cat.getNum());
        System.out.println("Всего собак: "+Dog.getNum());
    }


}
