public class ex23{
    public static void main(String[] args){
        Chicken chicken1 = new Chicken("CA", 1, 2);
        Chicken chicken2 = new Chicken("CB", 2, 2);
        Rabbit rabbit1 = new Rabbit("RA", 3, 4);
        Rabbit rabbit2 = new Rabbit("RA", 4, 4);
        Dog dog = new Dog("DA", 5, 4);

        chicken1.AnimalInfo();
        chicken2.AnimalInfo();
        rabbit1.AnimalInfo();
        rabbit2.AnimalInfo();
        dog.AnimalInfo();

        int total = 0, avg = 0;
        total += chicken1.getFoots();
        total += chicken2.getFoots();
        total += rabbit1.getFoots();
        total += rabbit2.getFoots();
        total += dog.getFoots();
        avg = total / 5;
        System.out.println("Total foots: " + total + ", avg age: " + avg);
    }
}

class Animal{
    private String name = "";
    private int age = 0;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void AnimalInfo(){
        System.out.printf("Animal: %s, Age: %d\n", getName(), getAge());
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Chicken extends Animal{
    private int foots = 0;
    public Chicken(String name, int age, int foots){
        super(name, age);
        this.foots = foots;
    }
    @Override
    public void AnimalInfo(){
        System.out.printf("Chicken: %s, Age: %d, foots: %d\n", getName(), getAge(), getFoots());
    }
    public int getFoots(){
        return this.foots;
    }
}

class Rabbit extends Animal{
    private int foots = 0;
    public Rabbit(String name, int age, int foots){
        super(name, age);
        this.foots = foots;
    }
    @Override
    public void AnimalInfo(){
        System.out.printf("Rabbit: %s, Age: %d, foots: %d\n", getName(), getAge(), getFoots());
    }
    public int getFoots(){
        return this.foots;
    }
}

class Dog extends Animal{
    private int foots = 0;
    public Dog(String name, int age, int foots){
        super(name, age);
        this.foots = foots;
    }
    @Override
    public void AnimalInfo(){
        System.out.printf("Dog: %s, Age: %d, foots: %d\n", getName(), getAge(), getFoots());
    }
    public int getFoots(){
        return this.foots;
    }
}