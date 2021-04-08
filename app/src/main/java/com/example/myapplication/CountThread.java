package com.example.myapplication;

import android.util.Log;

public class CountThread extends java.lang.Thread {
    private boolean isKeep = false;

    public CountThread(){
        Log.e("Thread", "Thread Start");
        isKeep = true;
    }

    @Override
    public void run(){
        while (isKeep)
        {
            if(Vars.viewModel != null) Vars.viewModel.increase();
            if(Vars.blankFragmentViewModel != null) Vars.blankFragmentViewModel.increase();
            try {
                Thread.sleep(1000);
            }catch (Exception e) {};
        }
    }
}
