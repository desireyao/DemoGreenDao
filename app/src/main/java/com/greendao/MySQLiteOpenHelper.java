package com.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.greendao.data.models.DaoMaster;
import com.greendao.data.models.UserDao;


/**
 * Package com.greendao.
 * Created by yaoh on 2017/07/04.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    private static final String TAG = "MySQLiteOpenHelper";

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.e(TAG, "onUpgrade--->" + "oldVersion = " + oldVersion + ",newVersion=" + newVersion);
//        MigrationHelper.migrate(db, UserDao.class);
        MigrationHelper.migrate(db,UserDao.class);
    }
}
