package Animal;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

    public String talk(){
        return "El animal " + super.getName() + "Dice: Guau";
    }

}
