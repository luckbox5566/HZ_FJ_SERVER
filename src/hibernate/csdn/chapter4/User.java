package hibernate.csdn.chapter4;
import javax.persistence.*;
import java.util.Date;


@Entity//声明当前类为hibernate映射到数据库中的实体类
@Table(name = "t_article2",catalog = "catolog",schema = "schema",uniqueConstraints = {@UniqueConstraint(columnNames = {"title","content"})})
//通过 @Table 为实体Bean指定对应数据库表，目录和schema的名字
//@UniqueConstraints 可以定义表的唯一约束。在title,和content加上唯一约束
public class User {
        @Id//声明此列为主键,作为映射对象的标识符
        /**
         *  @GeneratedValue注解来定义生成策略
         *  GenerationType.TABLES 当前主键的值单独保存到一个数据库的表中
         *  GenerationType.SEQUENCE  利用底层数据库提供的序列生成标识符
         *  GenerationType.IDENTITY 采取数据库的自增策略
         *  GenerationType.AUTO 根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型
         */
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(insertable = true,length = 20,nullable = false,name = "user_name",unique = true,updatable = true)
        @Version //注解用于支持乐观锁版本控制。
        private String name;
        @Column(scale = 1,precision = 1)
        private Double salary;
        /**
         * @Basic 基本属性类型映射,注解于非Static 非transient的属性，
         * 这时候我们可以为其声明抓取策略等属性
         * fetch: 获取策略，当以session.get()方法获取数据库对象时：
         * fetchType.LAZY为懒加载，会在第一次使用该属性（如调用getAge()方法）时才获取。
         * FetchType.EAGER为即时加载。
         * optional:表示当前属性是否可选，默认为true，如果为false,则在持久化到数据库时，如果此属性为null，则会失败
         */
        @Basic(fetch = FetchType.EAGER,optional = true)
        private Integer age;
        @Transient//被标注此注解的属性不会被持久化到数据库
        private String temp;
        /**
         * @Lob 注解表示属性将被持久化为Blob或者Clob类型,
         * 具体取决于属性的类型, java.sql.Clob, Character[], char[] 和 java.lang.String这些类型的属性都被持久化为Clob类型,
         * 而java.sql.Blob, Byte[], byte[] 和 serializable类型则被持久化为Blob类型.
         */
        @Lob
        private String desc;
        /**
         * @Temporal  标注在日期等属性上，声明映射为数据库的特定诶其属性类型，默认为java.sql.Timestamp（TemporalType.TIMESTAMP）
         *  此外还有java.sql.date（TemporalType.DATE）、java.sql.Time（TemporalType.TIME）
         */
        @Temporal(TemporalType.TIME)
        private Date birthDate;
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
    }
