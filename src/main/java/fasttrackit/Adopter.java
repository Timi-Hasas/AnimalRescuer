package fasttrackit;

public class Adopter extends Person{
    float adopterMoney;


    public Adopter(String name, int age, float money)
    {
        adopterMoney = money;
        personName = name;
        personAge = age;
    }

    public void Feed(Animal animal_, Food food_)
    {
        System.out.println(personName+" gave some "+ food_.foodName + " to " + animal_.animalName);
    }
}
