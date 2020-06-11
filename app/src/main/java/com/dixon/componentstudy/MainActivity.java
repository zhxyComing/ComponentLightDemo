package com.dixon.componentstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dixon.baseall.BaseConstant;
import com.dixon.simple.router.api.SimpleRouter;
import com.dixon.simple.router.core.SRouter;

@SimpleRouter(value = "main_page", interceptor = "")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Component", BaseConstant.TEST);
//        Log.e("Component", BaseReader.TEST); //Reader模块的base 无法直接调用 编译器报错
    }

    public void toReader(View view) {
        SRouter.build(this, "reader_page").execute();
    }

    public void toMe(View view) {
        SRouter.build(this, "me_page").execute();
    }
}