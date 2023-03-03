public class Animal {
    protected int legs = 8;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){

    }
    public void eat(){

    }
}
interface Pet{
    String getName();
    void setName(String name);
    void play();
}
class Cat extends Animal implements Pet {
    String name;

    protected Cat(int legs) {
        super(legs);
    }
    public void Cat(String name) {
        this.name = name;
    }
    public void walk(){
    String adf = "Cat walking";
    }
@Override
    public void setName(String name) {
     this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override

    public void play() {
        String caty = "Cat playing";
    }
    @Override

    public void eat() {
        String caty = "Cat eating";
    }
}
class Fish implements Pet{
    String name;
    public Fish(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play(){
        String fish = "Fish playing";
    }
    public void walk() throws Exception{
        String hh = "Fish can't walk";
    }
    public void eat(){
        String oo = "Fish eating";
    }
}
class Spider extends Animal{
    public Spider(int legs) {
        super(legs);

    }
    public void eat(){}
}
