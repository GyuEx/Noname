package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.app.FragmentTransaction;
import android.os.Binder;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.SurfaceControl;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    public static Fragment fr,subFragment,blankFragment,listFragment;
    public static androidx.fragment.app.FragmentTransaction fragmentTransaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vars.mContext = this;

        Vars.mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Vars.viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        Vars.mainBinding.setLifecycleOwner(this);
        Vars.mainBinding.setViewModel(Vars.viewModel);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        subFragment = new SubFragment();
        fr = subFragment;
        fragmentTransaction.add(R.id.mL02,fr);
        fragmentTransaction.commitAllowingStateLoss();

        Vars.mainBinding.fabAdd.setOnClickListener(view -> {
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            blankFragment = new BlankFragment();
            fr = blankFragment;
            fragmentTransaction.replace(R.id.mL02,fr);
            fragmentTransaction.commitAllowingStateLoss();
        });

        Vars.mainBinding.fabRemove.setOnClickListener(view -> {
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            listFragment = new ListFragment();
            fr = listFragment;
            fragmentTransaction.replace(R.id.mL02,fr);
            fragmentTransaction.commitAllowingStateLoss();
        });

//        Vars.mainBinding.maB01.setOnClickListener(view -> {
//            Vars.viewModel.insertList();
//        });

        Thread thread = new CountThread();
        thread.setDaemon(true);
        thread.start();
    }
}