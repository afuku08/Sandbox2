package practice.animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void echoVoice() {
        System.out.println("にゃー");
    }
}
