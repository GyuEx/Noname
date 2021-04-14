package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_blank,container,false);

        Vars.fragmentBlankBinding = DataBindingUtil.bind(view);
        Vars.blankFragmentViewModel = ViewModelProviders.of(requireActivity()).get(BlankFragmentViewModel.class);
        Vars.fragmentBlankBinding.setLifecycleOwner(requireActivity());
        Vars.fragmentBlankBinding.setViewModel(Vars.blankFragmentViewModel);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.e("BlankFragment","On Fragment Create");

//        Vars.binding = DataBindingUtil.bind(view);
//        Vars.blankFragmentViewModel = ViewModelProviders.of(requireActivity()).get(BlankFragmentViewModel.class);
//        Vars.binding.setLifecycleOwner(requireActivity());
//        Vars.binding.setViewModel(Vars.blankFragmentViewModel);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("BlankFragment","On Fragment Destory");
    }
}