package com.bargainautos;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.bargainautos.databinding.ActivityTabsBinding;
import com.bargainautos.fragment.DocumentFragment;
import com.bargainautos.fragment.LicenseFragment;
import com.bargainautos.fragment.MonthFragment;

public class TabAct extends AppCompatActivity {
    ActivityTabsBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tabs);
        initViews();
    }

    private void initViews() {
        selectedTab(1);

        binding.rlDocument.setOnClickListener(v -> selectedTab(1));

        binding.rl3Months.setOnClickListener(v -> selectedTab(2));

        binding.rlLicense.setOnClickListener(v -> selectedTab(3));
    }


    public void selectedTab(int i){
        if(i==1){
            binding.rlDocument.setBackgroundColor(getColor(R.color.color_blue));
            binding.rl3Months.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.rlLicense.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.tv1.setTextColor(getColor(R.color.white));
            binding.tv2.setTextColor(getColor(R.color.color_blue));
            binding.tv3.setTextColor(getColor(R.color.color_blue));
            FragTrans(new DocumentFragment());
        }

        else if(i==2){
            binding.rlDocument.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.rl3Months.setBackgroundColor(getColor(R.color.color_blue));
            binding.rlLicense.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.tv1.setTextColor(getColor(R.color.color_blue));
            binding.tv2.setTextColor(getColor(R.color.white));
            binding.tv3.setTextColor(getColor(R.color.color_blue));
            FragTrans(new MonthFragment());
        }

        else if(i==3){
            binding.rlDocument.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.rl3Months.setBackgroundColor(getColor(R.color.color_light_gray));
            binding.rlLicense.setBackgroundColor(getColor(R.color.color_blue));
            binding.tv1.setTextColor(getColor(R.color.color_blue));
            binding.tv2.setTextColor(getColor(R.color.color_blue));
            binding.tv3.setTextColor(getColor(R.color.white));
            FragTrans(new LicenseFragment());
        }


    }

    public void FragTrans(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        transaction.replace(R.id.box, fragment);
        transaction.addToBackStack("fragment");
        transaction.commit();
    }



}
