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
            //((ITreaters)Vars.mContext).increase();
            if(Vars.viewModel != null)Vars.viewModel.increase();
        }
    }
}
