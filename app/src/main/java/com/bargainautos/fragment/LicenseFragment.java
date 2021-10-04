package com.bargainautos.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bargainautos.FinishAct;
import com.bargainautos.R;
import com.bargainautos.databinding.FragmentLicenseBinding;



public class LicenseFragment extends Fragment {
    FragmentLicenseBinding binding;

    public LicenseFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_license, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        processNextActivity();
    }


    private void processNextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getActivity().startActivity(new Intent(getActivity(), FinishAct.class));
                getActivity().finish();
            }
        }, 7000);
    }
}

