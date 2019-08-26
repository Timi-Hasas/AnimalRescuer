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

    public void Play(Animal _animal, Activity _activity)
    {
        System.out.println(personName+" played "+ _activity.activityName + " with " + _animal.animalName);
    }
}
