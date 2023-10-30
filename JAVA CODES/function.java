import java.util.*;
class function 
{
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        function f = new function();
        System.out.println("1ST CALLING");
        f.fun();        
        System.out.println("2ND CALLING BUT DIFF PARA ");
        System.out.println("enter value for printing till");
        int num =sc.nextInt() ;
        f.fun(num);
        sc.close();
    }

    void fun()
    {
        System.out.println("hi fun is here");
    } 
    void fun(int n)
    {
        for(int i =0;i<n;i++)
        {
            System.out.println(i);
        }
    }

}