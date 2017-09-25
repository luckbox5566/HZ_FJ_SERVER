package hibernate.iteye.many_to_one;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "Dept_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
}
