package com.dixon.me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dixon.simple.router.api.SimpleRouter;
import com.dixon.simple.router.core.SRouter;

// 新建Activity，系统会自动在runAlone生成代码，一定要手动同步到自己的AndroidManifest上
@SimpleRouter(value = "me_page", interceptor = "")
public class MeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
    }

    public void toLogin(View view) {
        SRouter.build(this, "login_page").execute();
    }
}