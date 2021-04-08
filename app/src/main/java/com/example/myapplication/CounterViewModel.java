package com.example.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel{
    public MutableLiveData<Integer> counter = new MutableLiveData<>();
    public MutableLiveData<String> rName = new MutableLiveData<>();

    public CounterViewModel(){
        counter.setValue(0);
    }

    public void increase() {
        counter.postValue(counter.getValue() + 1);
    }

    public void decrease() {
        counter.postValue(counter.getValue() - 1);
    }
}
