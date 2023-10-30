package Student;

public class Data {
    int id;
    String name;

    public void get(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

   public void display()
    {
        System.out.println("Name is: "+name+"\nId is: "+id);
    }
}
