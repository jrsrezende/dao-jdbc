package model.dao;

import model.dao.implementation.SellerDaoJDBC;

public class DaoFactory {
    public static  SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
