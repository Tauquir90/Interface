public class Zoo {
    public void playAnimalSound(Animal animal)
    {
        if(animal instanceof  Cat)
        {
            Cat cat = (Cat)animal;
            cat.moaning();
        }

        if(animal instanceof  Dog)
        {
            Dog dog = (Dog)animal;
            dog.barking();
        }
        if(animal instanceof  Lion)
        {
            Lion lion = (Lion)animal;
            lion.Roar();
        }
    }
}
