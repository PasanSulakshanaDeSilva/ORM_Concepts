package lk.ijse.pasi.hibernate.entity;

import lk.ijse.pasi.hibernate.embeded.CustMobile;
import lk.ijse.pasi.hibernate.embeded.CustName;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cust_name", length = 150)
    private CustName name;
    @Column(name = "age",columnDefinition = "SMALLINT")
    private int age;

    @ElementCollection
    @CollectionTable(
            name = "cust_phone",
            joinColumns = @JoinColumn (name = "cust_id")
    )
    private List<CustMobile> phoneNos;
    @Transient
    private String cardNo;

    public Customer() {
    }

    public Customer(int id, CustName name, int age, String cardNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cardNo = cardNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustName getName() {
        return name;
    }

    public void setName(CustName name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
