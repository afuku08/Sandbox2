package practice.animal;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void echoVoice() {
        System.out.println("わんわん");
    }
}
