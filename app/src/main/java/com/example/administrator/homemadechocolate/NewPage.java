package com.example.administrator.homemadechocolate;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewPage extends AppCompatActivity {
    // Recyclerview initialisation
    RecyclerView recyclerView;
    List<Model2> model;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_page);

        //Recycler View
        recyclerView=findViewById(R.id.recycler22);
        progressDialog=new ProgressDialog(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        model =new ArrayList<>();
        loadProducts();



        progressDialog.dismiss();




    }
    //////////////////

    private void loadProducts()
    {
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        model.add(new Model2(R.drawable.ieight,"Oreo Chocolate","MRP: Rs.100/-"));
        model.add(new Model2(R.drawable.ifive,"Nut Cracker","MRP: Rs.70/-"));
        model.add(new Model2(R.drawable.inine,"Fruit & Nut","MRP: Rs.80/-"));
        model.add(new Model2(R.drawable.iten,"Crackle","MRP: Rs.75/-"));
        model.add(new Model2(R.drawable.ithirteen,"Nutella","MRP: Rs.65/-"));
        Adapter2 adapter2 =new Adapter2(getApplicationContext(),model);
        recyclerView.setAdapter(adapter2);
    }
}
