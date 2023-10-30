public class VarLenght {
    public  void m(int ... n)
    {
        int nn =0;
        for (int i : n) {
            nn+= i;
        }
        System.out.println(nn);
    }

    public static void main(String[] args) {
        VarLenght varLenght = new VarLenght();
        varLenght.m(20,30,50,0);  
        varLenght.m(20,30,50,0);       
        // varLenght.m(30);
    }
}
