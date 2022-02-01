public class Tester {
    public static void main(String...args)
    {
        Zoo z = new Zoo();
        z.playAnimalSound(new Cat());
        z.playAnimalSound(new Dog());
        z.playAnimalSound(new Lion());

    }
}
