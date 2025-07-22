package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.implementation.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(3000.0, obj, LocalDate.now(), "bob@gmail.com", "Bob", 21);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
