package com.example.bilibilibymyself.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bilibilibymyself.R;
import com.example.bilibilibymyself.adapter.AnimalAdapter;
import com.example.bilibilibymyself.base.BaseFragment;
import com.example.bilibilibymyself.bean.Animal;

public  class AnimalFragment extends BaseFragment {


    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public int setTdResource() {
        return R.layout.carton_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Animal animal=new Animal(R.drawable.ic_rabbit,"我是一只兔子");
            animals.add(animal);
        }

    }

    @Override
    public void initView() {
        recyclerView=getView().findViewById(R.id.animal_recycler_view);
        adapter=new AnimalAdapter(animals,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
