public class Main1{
    public static void main(String[] args) {
        Animal animal = new Animal("Monkey");
        System.out.println(animal);
        Mammal mammal = new Mammal("Ant");
        System.out.println(mammal);
        Cat cat = new Cat("Boris");
        System.out.println(cat);
        cat.greets();
        Dog dog = new Dog("Aktos");
        Dog dog1 = new Dog("Sharik");
        System.out.println(dog);
        dog.greets();
        dog1.greets(dog);

    }
}
class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Animal[name=" + name + "]";
    }

}
class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    @Override
    public String toString(){
        return "Mamaml["+super.toString() + "]";
    }
}
class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}



