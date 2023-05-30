package Animal;

public class Rooster extends Animal{

    public Rooster() {
    }

    public Rooster(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

    public String talk(){
        return "El animal " + super.getName() + "Dice: Kikiriki";
    }

}
