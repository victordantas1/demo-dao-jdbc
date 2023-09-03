package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST1 findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST2 findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST3 findAll ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST4 seller insert ===");
        Seller newSeller = new Seller(null, "Emmily", "emm@gmail.com", new Date(),3000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new ID = " + newSeller.getId());

        System.out.println("\n=== TEST5 seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Robert Jonson");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST5 seller delete ===");
        sellerDao.deleteById(8);
    }
}
