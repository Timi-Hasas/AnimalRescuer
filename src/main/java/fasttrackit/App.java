package fasttrackit;


public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Rufus",2,8,7,8,"Fish","Playing catch");
        Adopter adopter = new Adopter("Bob",1000);
        Food food = new Food ("Fish",33.33f, 5,true);
        Activity activity = new Activity("Playing catch");
        Vet vet = new Vet("Dr.Donald","Cats");
        Game game = new Game(adopter, animal, vet);


    }
}