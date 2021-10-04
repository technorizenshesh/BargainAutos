package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityBankBinding;
import com.bargainautos.databinding.ActivityHowsBinding;

public class HowsAct extends AppCompatActivity {
    ActivityHowsBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_hows);
        initViews();
    }

    private void initViews() {
        binding.rlNext.setOnClickListener(v -> {
            startActivity(new Intent(HowsAct.this, SubmitAct.class));
            finish();
        });
    }

}
