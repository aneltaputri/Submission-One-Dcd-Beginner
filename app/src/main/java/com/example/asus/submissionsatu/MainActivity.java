package com.example.asus.submissionsatu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<FootbalModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_list);
        rvTeam.setHasFixedSize(true);
        list.addAll(FootbalData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        FootbalAdapter footbalAdapter = new FootbalAdapter(this);
        footbalAdapter.setFootbalList(list);
        rvTeam.setAdapter(footbalAdapter);
    }
}
