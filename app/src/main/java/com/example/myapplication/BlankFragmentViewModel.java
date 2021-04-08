package com.example.myapplication;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlankFragmentViewModel extends ViewModel implements ITreaters{
    public MutableLiveData<Integer> uTxt = new MutableLiveData<>();

    public BlankFragmentViewModel(){
        uTxt.postValue(0);
    }

    @Override
    public void increase() {
        uTxt.postValue(uTxt.getValue() + 1);
    }

    @Override
    public void decrease() {
        uTxt.postValue(uTxt.getValue() - 1);
    }
}
