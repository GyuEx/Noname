package com.example.myapplication;

import android.content.Context;
import android.renderscript.ScriptGroup;

import androidx.databinding.ViewDataBinding;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.FragmentBlankBinding;

public class Vars {

    public static Context mContext = null;

    public static ActivityMainBinding mainBinding;
    public static CounterViewModel viewModel;
    public static MemoViewModel memoViewModel;

    public static FragmentBlankBinding fragmentBlankBinding;
    public static BlankFragmentViewModel blankFragmentViewModel;

}
