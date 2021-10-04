package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityBankBinding;
import com.bargainautos.databinding.ActivityRelativeBinding;

public class BankDetailsAct extends AppCompatActivity {

    ActivityBankBinding binding;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this, R.layout.activity_bank);
            initViews();
        }

        private void initViews() {
            binding.rlNext.setOnClickListener(v -> {
                startActivity(new Intent(BankDetailsAct.this, HowsAct.class));
                finish();
            });
        }

    }
