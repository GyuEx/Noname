package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    public BlankFragment(){
        //Log.e("Fragment", );
        Vars.mainBinding = DataBindingUtil.setContentView((Activity) Vars.mContext,R.layout.fragment_blank);
        Vars.viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        Vars.mainBinding.setLifecycleOwner(this);
        Vars.mainBinding.setViewModel(Vars.viewModel);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}