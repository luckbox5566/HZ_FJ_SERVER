package hibernate.iteye.noe_to_noe;

import javax.persistence.*;
/*
@JoinTable 描述了关联表的名字；包含了两个字段address_id和employee_id
1. 单独映射表
 */
@Entity
@Table(name = "Employee")
public class Employee3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="employee_address",joinColumns=@JoinColumn(name="address_id"),inverseJoinColumns=@JoinColumn(name="employee_id"))
    private Address2 address2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
