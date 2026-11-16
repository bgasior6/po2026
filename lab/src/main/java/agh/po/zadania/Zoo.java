package agh.po.zadania;
import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;
public class Zoo {
    Animal[] animals = new Animal[100];

    public int suma_nog(){
        int suma = 0;
        for (int i = 0; i < 100; i++){
            suma = suma + animals[i].legs;
        }
        return suma;
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            int r1 = r.nextInt(3);
            if (r1 == 0){
                zoo.animals[i] = new Dog("pies" + i);
            }
            else if (r1 == 1){
                zoo.animals[i] = new Parrot("papuga" + i);
            }
            else{
                zoo.animals[i] = new Snake("wąż" + i);
            }
        }
        System.out.println(zoo.animals[15].getDescription());
        System.out.println(zoo.suma_nog());
    }
}


