package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityFinishBinding;

public class FinishAct extends AppCompatActivity {
    ActivityFinishBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_finish);
        processNextActivity();
    }


    private void processNextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();
            }
        }, 7000);
    }

}
