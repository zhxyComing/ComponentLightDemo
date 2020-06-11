package com.dixon.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dixon.baseall.BaseConstant;
import com.dixon.basereader.BaseReader;
import com.dixon.simple.router.api.SimpleRouter;
import com.dixon.simple.router.core.SRouter;

@SimpleRouter(value = "reader_page", interceptor = "")
public class ReaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        Log.e("Component", BaseConstant.TEST);
        Log.e("Component", BaseReader.TEST);
    }

    public void toMe(View view) {
        SRouter.build(this, "me_page").execute();
    }
}