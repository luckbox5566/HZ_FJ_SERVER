package hibernate.iteye.noe_to_noe;

import javax.persistence.*;

/*
@Embedded 表示Address元素被嵌入到Employee表中间。
1.数据库可能有各种映射关系，下面演示的是1对1的映射关系。
2.下面展示的是把它们的所有属性放在一个表中。
 */
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
