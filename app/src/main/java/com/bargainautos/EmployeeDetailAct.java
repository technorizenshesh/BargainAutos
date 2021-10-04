package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityEmployeeBinding;

public class EmployeeDetailAct extends AppCompatActivity {
        ActivityEmployeeBinding binding;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this,R.layout.activity_employee);
            initViews();
        }

        private void initViews() {
            binding.rlNext.setOnClickListener(v -> {
                startActivity(new Intent(EmployeeDetailAct.this,IncomeExpenseAct.class));
                finish();
            });
        }
    }

