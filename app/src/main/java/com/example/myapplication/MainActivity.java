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

public class MainActivity extends AppCompatActivity{

    public static BlankFragment blankFragment;
    public static Fragment fr;
    public FragmentTransaction transaction;
    public static androidx.fragment.app.FragmentTransaction fragmentTransaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vars.mContext = this;

        //Vars.mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
//        Vars.viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
//        Vars.mainBinding.setLifecycleOwner(this);
//        Vars.mainBinding.setViewModel(Vars.viewModel);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        blankFragment = new BlankFragment();
        fr = blankFragment;
        fragmentTransaction.add(R.id.mL02,fr);
        fragmentTransaction.commit();

        Thread thread = new CountThread();
        thread.setDaemon(true);
        thread.start();

    }
}