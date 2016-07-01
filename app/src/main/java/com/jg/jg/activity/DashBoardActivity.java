package com.jg.jg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jg.jg.R;
import com.jg.jg.adapter.DashBoardAdapter;
import com.jg.jg.model.DashBoardModel;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView recyclerDashBord;
    ArrayList<DashBoardModel> dashBoardModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inIt();

        dashBoardModels = new ArrayList<>();
        for (int i = 0; i < 6; i++) {

            DashBoardModel dashBoardModel = new DashBoardModel();
            dashBoardModel.setRef("505");
            dashBoardModel.setCustomerName("Rahul Wadhai");
            dashBoardModel.setZipCode("440024");
            dashBoardModel.setDateSold("05/10/2016");
            dashBoardModel.setCustomerId("C1698 & SJ1");
            dashBoardModel.setJobPacket("C1698-SJ1-monal");
            dashBoardModel.setJobPacket("C1698-SJ1-monal");
            dashBoardModel.setCategory("Decking-Railing-Post-Columns");
            dashBoardModel.setStatus("Status");
            dashBoardModel.setNotes("Notes");
            dashBoardModels.add(dashBoardModel);
        }

        DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(DashBoardActivity.this,dashBoardModels);
        recyclerDashBord.setAdapter(dashBoardAdapter);
        recyclerDashBord.setHasFixedSize(true);
    }

    public void inIt() {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getResources().getString(R.string.activity_dash_board));
            getSupportActionBar().setSubtitle("Welcome Justi Grove");
        }
        recyclerDashBord = (RecyclerView) findViewById(R.id.recyclerDashBord_Id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerDashBord.setItemAnimator(new DefaultItemAnimator());
        recyclerDashBord.setHasFixedSize(true);
        recyclerDashBord.setLayoutManager(layoutManager);

    }
}
