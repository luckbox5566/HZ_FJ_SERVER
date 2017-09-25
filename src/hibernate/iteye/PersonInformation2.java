package hibernate.iteye;

import javax.persistence.*;
/*
@Table  指定数据库表名字
@Column 指定对应的数据库字段名
@GeneratedValue GenerationType.IDENTITY表示它的生成方式是自动增长
 */
@Entity
@Table(name="PersonInformation2")
public class PersonInformation2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
