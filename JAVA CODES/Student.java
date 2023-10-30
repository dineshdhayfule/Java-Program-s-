public class Student {
    
    String name;
    int id;
    
    void get()
    {
        name="dinesh dhayfule";
        id=75;
    }

    void display()
    {
        System.out.println("name: "+name+"\nid: "+id);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.get();
        st.display();
        
    }
}
