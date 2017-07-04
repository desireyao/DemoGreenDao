package com.greendao;

import android.app.Application;


import com.greendao.data.models.DaoMaster;
import com.greendao.data.models.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Package com.greendao.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class App extends Application {

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        MySQLiteOpenHelper helper = new MySQLiteOpenHelper(this, "test.db",null);
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
