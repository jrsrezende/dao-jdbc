package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste findById");
        Department department = departmentDao.findbyId(3);
        System.out.println(department);

        System.out.println("\nTest findAll");
        List<Department> list2 = departmentDao.findAll();
        list2.forEach(System.out::println);

        System.out.println("\nTest insert");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\nTest update");
        department = departmentDao.findbyId(1);
        department.setName("Audio");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("\nTest delete");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
