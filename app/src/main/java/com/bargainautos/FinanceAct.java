package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityFinanceBinding;

public class FinanceAct extends AppCompatActivity {
    ActivityFinanceBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_finance);
        initViews();
    }

    private void initViews() {
        binding.rlNext.setOnClickListener(v -> {
            startActivity(new Intent(FinanceAct.this,PersonalDetailAct.class));
            finish();
        });
    }
}
