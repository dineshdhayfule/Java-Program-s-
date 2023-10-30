package st;
import java.util.Scanner;

import Student.Data;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Id");
        int id = scanner.nextInt();
        Data dt = new Data();
        dt.get(id,  name);
        dt.display();
    }
}
