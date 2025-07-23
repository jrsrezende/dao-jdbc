package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Teste findById");
        Seller seller = sellerDao.findbyId(3);
        System.out.println(seller);

        System.out.println("\nTest findByDepartment");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        list.forEach(System.out::println);

        System.out.println("\nTest findAll");
        List<Seller> list2 = sellerDao.findAll();
        list2.forEach(System.out::println);

        System.out.println("\nTest insert");
        Seller newSeller = new Seller(4000.0, new Department(2, null), LocalDate.now(), "greg@gmail.com", "Greg", null);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
    }
}
