package hibernate.iteye.noe_to_noe;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
/*
@Embeddable 表示它能够被嵌入到其他对象里面的。
 */
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;

    @Column(name = "Zip_Code")
    private String zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
