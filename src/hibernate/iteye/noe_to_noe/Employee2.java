package hibernate.iteye.noe_to_noe;

import javax.persistence.*;
/*
@OneToOne   表示他们是一对一关系，casade表示他们的级联访问属性；保证可以自动保存
@JoinColumn 指定了Employee表里引用到Address时关联的名字是什么。
1.Address的定义要增加一个id
2.下面是通过外键关联的方式来实现
 */
@Entity
@Table(name = "Employee")
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
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
