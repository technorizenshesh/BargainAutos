package com.bargainautos;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityHowsBinding;
import com.bargainautos.databinding.ActivitySubmitBinding;

public class SubmitAct extends AppCompatActivity {
    ActivitySubmitBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_submit);
        initViews();
    }

    private void initViews() {
        binding.rlSubmit.setOnClickListener(v -> {
            startActivity(new Intent(SubmitAct.this, TabAct.class));
            finish();
        });
    }

}
