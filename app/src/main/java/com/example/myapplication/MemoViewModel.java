package com.example.myapplication;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MemoViewModel extends ViewModel {

    private List<Memo> items;
    private RecyclerAdapter adapter;


    public MemoViewModel() {

        Log.e("Memo","Memo call");
        if (items == null) {
            items = new ArrayList<>();
        }
        if (adapter == null) {
            adapter = new RecyclerAdapter(this);
        }
    }

    public void insertLogic(List<String> title,List<String> content,List<Integer> id) {
        for (int i = 0; i < id.size(); i++) {
            Memo memo = new Memo();
            memo.setId(id.get(i));
            memo.setMemoContext(content.get(i));
            memo.setTitle(title.get(i));
            items.add(memo);
            adapter.notifyDataSetChanged();
        }
    }

    public void ListClick() {

    }

    public void onCreate() {
        adapter.notifyDataSetChanged();
    }

    public void onResume() {

    }

    public RecyclerAdapter getAdapter() {
        return adapter;
    }

    public List<Memo> getItems() {
        return items;
    }

    public String getTitle(int pos) {
        return items.get(pos).getTitle();
    }

    public String getContents(int pos) {
        return items.get(pos).getMemoContext();
    }
}