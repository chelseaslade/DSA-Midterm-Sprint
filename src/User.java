public class User {
    protected int id;
    protected String name;
    protected static int serial = 1;

    //Constructors
    public User(String name)
    {
        this.id = serial++;
        this.name = name;
    }

    public String getName()
    {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
