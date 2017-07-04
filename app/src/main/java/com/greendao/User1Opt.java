package com.greendao;

import com.greendao.data.models.User;
import com.greendao.data.models.User1;

import java.util.List;

/**
 * Package com.greendao.data.dao.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class User1Opt {

    public static void insertUser(User1 user) {
        App.getDaoInstant().getUser1Dao().insertOrReplace(user);
    }
}
