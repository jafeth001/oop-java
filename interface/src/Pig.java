public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("pig sound: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("pig sleep: Zzzz");
    }
}
