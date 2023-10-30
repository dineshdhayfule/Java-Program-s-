 class Innercall {
void add(int n,int n1)
{
System.out.println("add:"+(n+n1));
System.out.println("Innercall");
}
    
}

 class Innercall_1 extends Innercall {

void add(int n,int n1)
{
System.out.println("add:"+(n+n1));
System.out.println("Innercall_1");
}

}

public class call {

     public static void main(String[] args) {
        Innercall_1 c = new Innercall_1();
        c.add(20, 3000);
    }
}