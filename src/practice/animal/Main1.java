package practice.animal;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("ぽち", 2));
        animals.add(new Cat("たま", 3));

        for(Animal a : animals){
            a.echoVoice();
        }
    }
}
