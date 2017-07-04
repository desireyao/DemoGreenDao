package com.greendao.data.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Package com.greendao.data.models.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
@Entity
public class User1 {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "TIME")
    @Index(unique = true)
    private Long time;

    private String name;

    @Generated(hash = 322455947)
    public User1(Long id, Long time, String name) {
        this.id = id;
        this.time = time;
        this.name = name;
    }

    @Generated(hash = 1224450628)
    public User1() {
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
