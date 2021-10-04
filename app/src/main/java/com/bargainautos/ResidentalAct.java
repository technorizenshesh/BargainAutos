package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityPersonalBinding;
import com.bargainautos.databinding.ActivityResidentalBinding;

public class ResidentalAct extends AppCompatActivity {
    ActivityResidentalBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_residental);
        initViews();
    }

    private void initViews() {
        binding.rlNext.setOnClickListener(v -> {
            startActivity(new Intent(ResidentalAct.this,EmployeeDetailAct.class));
            finish();
        });
    }
}
