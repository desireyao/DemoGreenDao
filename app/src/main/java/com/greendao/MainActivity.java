package com.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.greendao.data.models.User;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private Button btn_insert;
    private Button btn_delete;
    private Button btn_query;

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_insert = (Button) findViewById(R.id.btn_insert);
        btn_insert.setOnClickListener(this);

        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(this);

        btn_query = (Button) findViewById(R.id.btn_query);
        btn_query.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_insert:
                insert();
                break;
            case R.id.btn_delete:
                deleteAll();
                break;
            case R.id.btn_update:
                break;
            case R.id.btn_query:
                for (int i = 0; i < 1000; i++) {
                    query();
                }
                break;
            default:
                break;
        }
    }

    private void insert() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    User user = new User();
                    user.setName("test_name_" + count++);
                    user.setCountry("china");
                    Log.e(TAG, "准备插入数据 =" + count);
                    UserOpt.insertUser(user);
                }
            }
        }).start();
    }

    private void deleteAll() {
        UserOpt.deleteAllUser();
    }

    private void update() {

    }

    private void query() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<User> list = UserOpt.queryAll();
                Log.e(TAG, "list--->" + list.size());
            }
        }).start();
    }
}
