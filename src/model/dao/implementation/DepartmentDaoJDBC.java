package model.dao.implementation;

import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findbyId(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}
