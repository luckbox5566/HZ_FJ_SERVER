package hibernate.iteye.one_to_many;

import javax.persistence.*;
import java.util.List;
/*
1. 我们可以讲一对多或者多对一的关系用一个中间关系表来保存。
2. 如果我们设定了两个对象之间的一对多属性关系，它会默认生成一个中间表，并且表名以两个表的名字加一个下划线拼接起来
 */
@Entity
@Table(name="Department")
public class Department {
    @Id
    @Column(name = "Dept_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="Dept_Id")
    private List<Employee> employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
