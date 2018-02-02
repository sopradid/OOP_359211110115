package ooplab8;
// Cat is a Pet
// Cat is sub-class
// Cat is super-class
public class Cat  extends Pet{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow !!!");
    }
}//class

