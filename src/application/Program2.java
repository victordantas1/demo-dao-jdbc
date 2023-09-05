package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("=== TEST 1 insert ===");

        DepartmentDao dep = DaoFactory.createdepartmentDao();
        Department department = new Department();
        department.setName("Games");
        //dep.insert(department);

        System.out.println("=== TEST 2 update ===");
        dep.update(new Department(5, "Limpeza"));

        System.out.println("=== TEST 3 delete ===");
        dep.deleteById(14);

        System.out.println("=== TEST 4 findById ===");
        System.out.println(dep.findById(1));

        System.out.println("=== TEST 5 findAll ===");
        List<Department> list= dep.findAll();
        list.forEach(System.out::println);
    }
}
