package com.greendao;

import com.greendao.data.models.User;
import com.greendao.data.models.UserDao;

import org.greenrobot.greendao.async.AsyncOperation;
import org.greenrobot.greendao.async.AsyncOperationListener;
import org.greenrobot.greendao.async.AsyncSession;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

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

    public static void insertUsers(List<User> users) {
        App.getDaoInstant().getUserDao().insertInTx(users);
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
    public static List<User> queryUser() {
//        return App.getDaoInstant().getUserDao().queryBuilder()
//                .where(User.Properties.Type.eq(User.TYPE_LOVE)).list();
        UserDao userDao = App.getDaoInstant().getUserDao();

        Query<User> query = userDao
                .queryBuilder()
                .where(UserDao.Properties.Id.ge(4))
                .build();
        List<User> users = query.list();

//        QueryBuilder<User> queryBuilder = userDao.queryBuilder();
//        queryBuilder.join(User.class, UserDao.Properties.Id)
//                .where(UserDao.Properties.Name.eq("name_10"));
//        List<User> users = queryBuilder.list();

        return users;
    }

    /**
     * 查询全部数据
     */
    public static List<User> queryAll() {
        return App.getDaoInstant().getUserDao().loadAll();
    }

    public static void asncOpt() {
        AsyncSession async = App.getDaoInstant().startAsyncSession();

        //不关心操作结果时，可不设置lisnter
        async.setListenerMainThread(new AsyncOperationListener() {
            @Override
            public void onAsyncOperationCompleted(AsyncOperation arg0) {


            }
        });

//        async.queryList(builder.build());
    }
}
