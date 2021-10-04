package com.bargainautos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bargainautos.databinding.ActivityContactBinding;

public class ContactDetailAct extends AppCompatActivity {
        ActivityContactBinding binding;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this,R.layout.activity_contact);
            initViews();
        }

        private void initViews() {
            binding.rlNext.setOnClickListener(v -> {
                startActivity(new Intent(ContactDetailAct.this,ResidentalAct.class));
                finish();
            });
        }
}
