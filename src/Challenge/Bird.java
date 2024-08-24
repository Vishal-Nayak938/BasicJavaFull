package Challenge;

public abstract class Bird implements Flyable{
    private final String breed;

    public Bird(String breed)
    {
        this.breed=breed;
    }

    String getBreed()
    {
        return breed;
    }


}
