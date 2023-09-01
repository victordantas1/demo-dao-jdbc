package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    public static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private Date BithDate;
    private Double BaseSalary;

    private Department department;

    public Seller(){
    }

    public Seller(Integer id, String name, String email, Date bithDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        BithDate = bithDate;
        BaseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return BithDate;
    }

    public void setBithDate(Date bithDate) {
        BithDate = bithDate;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;
        return Objects.equals(getId(), seller.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", BithDate=" + BithDate +
                ", BaseSalary=" + BaseSalary +
                ", department=" + department +
                '}';
    }
}
