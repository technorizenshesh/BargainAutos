package com.bargainautos.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bargainautos.R;
import com.bargainautos.databinding.FragmentMonthBinding;


public class MonthFragment extends Fragment {
    FragmentMonthBinding binding;

    public MonthFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_month, container, false);
        return binding.getRoot();
    }


}

