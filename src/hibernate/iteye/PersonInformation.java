package hibernate.iteye;

import javax.persistence.Entity;
import javax.persistence.Id;
/*
@Entity 表示可以序列化映射的对象；我们希望这个对象被映射到数据库中的某个表，则必须加上这个annotation
@Id     表示对应的表的主键；如果不指定主键的话则运行的时候会报错
1. 虽然定义的字段都是小写格式的，但是映射到数据库包里包括表名和表里字段名都是大写格式的。
2. 我们定义id为主键后，这个字段就有了primary key not null的限制。
3. 博客网址http://shmilyaw-hotmail-com.iteye.com/blog/1969190
 */
@Entity
public class PersonInformation {

    @Id
    private int id;
    private String name;
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
