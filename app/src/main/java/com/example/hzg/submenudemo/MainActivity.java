package com.example.hzg.submenudemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);

//        SubMenu file=menu.addSubMenu("文件");
//        SubMenu edit=menu.addSubMenu("编辑");
//        file.setHeaderTitle("文件操作");
//        file.setHeaderIcon(R.mipmap.ic_launcher);
//        file.add(1, 1, 1, "新建");
//        file.add(1, 2, 1, "打开");
//        file.add(1, 3, 1, "保存");
//        file.add(1, 4, 1, "取消");
//        edit.setHeaderTitle("编辑操作");
//        edit.setHeaderIcon(R.mipmap.ic_launcher);
//        edit.add(2, 1, 1, "复制");
//        edit.add(2, 2, 1, "粘贴");
//        edit.add(2, 3, 1, "剪切");
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

//        if (item.getGroupId()==1) {
//            switch (id) {
//                case 1:
//                    Toast.makeText(this, "点击了新建", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(this, "点击了打开", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(this, "点击了保存", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(this, "点击了取消", Toast.LENGTH_SHORT).show();
//                    break;
//            }
//        }else if (item.getGroupId() == 2) {
//            switch (id) {
//                case 1:
//                    Toast.makeText(this, "点击了复制", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(this, "点击了粘贴", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(this, "点击了剪切", Toast.LENGTH_SHORT).show();
//                    break;
//            }
//        }
        switch (id) {
            case R.id.new_file:
                Toast.makeText(this, "点击了新建",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open_file:
                Toast.makeText(this, "点击了打开",Toast.LENGTH_SHORT).show();
                break;
            case R.id.save_file:
                Toast.makeText(this, "点击了保存",Toast.LENGTH_SHORT).show();
                break;
            case R.id.c_edit:
                Toast.makeText(this, "点击了复制",Toast.LENGTH_SHORT).show();
                break;
            case R.id.v_edit:
                Toast.makeText(this, "点击了粘贴",Toast.LENGTH_SHORT).show();
                break;
            case R.id.x_edit:
                Toast.makeText(this, "点击了剪切",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
