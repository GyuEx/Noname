package com.example.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

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

    public void insertList()
    {
        List<Integer> id = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        List<String> listTitle = Arrays.asList("국화", "사막", "수국", "해파리", "코알라", "등대", "펭귄", "튤립",
                "국화", "사막", "수국", "해파리", "코알라", "등대", "펭귄", "튤립");
        List<String> listContent = Arrays.asList(
                "이 꽃은 국화입니다.",
                "여기는 사막입니다.",
                "이 꽃은 수국입니다.",
                "이 동물은 해파리입니다.",
                "이 동물은 코알라입니다.",
                "이것은 등대입니다.",
                "이 동물은 펭귄입니다.",
                "이 꽃은 튤립입니다.",
                "이 꽃은 국화입니다.",
                "여기는 사막입니다.",
                "이 꽃은 수국입니다.",
                "이 동물은 해파리입니다.",
                "이 동물은 코알라입니다.",
                "이것은 등대입니다.",
                "이 동물은 펭귄입니다.",
                "이 꽃은 튤립입니다."
        );
        if(Vars.memoViewModel != null) Vars.memoViewModel.insertLogic(listTitle,listContent,id);
    }
}
