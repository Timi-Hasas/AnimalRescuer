package fasttrackit;


public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Rufus",2,8,7,8,"Fish","Playing catch");
        Adopter adopter = new Adopter("Bob",28, 1000);
        Food food = new Food ("Fish",33.33f, 5,true);
        Activity activity = new Activity("Catch");
        Vet vet = new Vet("Dr.Donald",42, "Ducks");
        Game game = new Game(adopter, animal, vet);

        adopter.Feed(animal, food);
        adopter.Play(animal, activity);

    }
}