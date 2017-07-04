package com.greendao.data.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Package com.greendao.data.models.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */

@Entity
public class User {

    @Id(autoincrement = true)
    private Long id;

    @Unique private String name;

    @Property
    private String country;

    private String address;

    private Integer age4;
    private Integer age5;

    @Generated(hash = 1948697694)
    public User(Long id, String name, String country, String address, Integer age4,
            Integer age5) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.age4 = age4;
        this.age5 = age5;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge4() {
        return this.age4;
    }

    public void setAge4(Integer age4) {
        this.age4 = age4;
    }

    public Integer getAge5() {
        return this.age5;
    }

    public void setAge5(Integer age5) {
        this.age5 = age5;
    }
}
