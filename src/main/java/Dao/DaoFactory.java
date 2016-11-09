package Dao;

import entity.Product;

public abstract class DaoFactory {

    public static DaoFactory createFactory(){
return new JdbcDaoFactory();
    }
    public abstract UserDao getUserDao();
    public abstract ProductDao getProductDao();


}
