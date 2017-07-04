package com.greendao;

import com.greendao.App;
import com.greendao.data.models.User;

import java.util.List;

/**
 * Package com.greendao.data.dao.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class UserOpt {

    public static void insertUser(User user) {
        App.getDaoInstant().getUserDao().insertOrReplace(user);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteUser(long id) {
        App.getDaoInstant().getUserDao().deleteByKey(id);
    }

    public static void deleteAllUser() {
        App.getDaoInstant().getUserDao().deleteAll();
    }

    /**
     * 更新数据
     *
     * @param user
     */
    public static void updateUser(User user) {
        App.getDaoInstant().getUserDao().update(user);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
//    public static List<User> queryUser() {
//        return App.getDaoInstant().getUserDao().queryBuilder()
//                .where(User.Properties.Type.eq(User.TYPE_LOVE)).list();
//    }

    /**
     * 查询全部数据
     */
    public static List<User> queryAll() {
        return App.getDaoInstant().getUserDao().loadAll();
    }
}
