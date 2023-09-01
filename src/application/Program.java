package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = new Seller(21,"Victor Dantas", "vict@gmail.com", new Date(), 3000.0, obj);


        System.out.println(seller);
    }



}
