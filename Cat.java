package Animal;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

        public String talk(){
        return "El animal " + super.getName() + "Dice: Miauugo";
        }
}
