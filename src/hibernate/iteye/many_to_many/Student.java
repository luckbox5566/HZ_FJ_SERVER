package hibernate.iteye.many_to_many;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(name = "Student_Dept",joinColumns = @JoinColumn(name="Stut_ID"), inverseJoinColumns=@JoinColumn(name="DEPT_ID"))
    private Collection<Department>departments;

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

    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }
}
