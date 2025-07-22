package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(3000.0, obj, LocalDate.now(), "bob@gmail.com", "Bob", 21);
        System.out.println(seller);
    }
}
