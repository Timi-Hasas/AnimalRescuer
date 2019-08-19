package fasttrackit;

public class Game {
    Adopter adopter;
    Animal animal;
    Vet veteranian;

    public Game(Adopter person, Animal pet, Vet vet)
    {
        adopter = person;
        animal = pet;
        veteranian = vet;
    }
}
