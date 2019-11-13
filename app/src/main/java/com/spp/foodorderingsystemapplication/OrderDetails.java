package com.spp.foodorderingsystemapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView listview, priceview;
    String list_choice;
    double price_bd,price_usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        listview = (TextView) findViewById(R.id.listview);
        priceview = (TextView) findViewById(R.id.priceview);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_bd = bundle.getDouble("price");

        price_usd = price_bd * 79.0;

        listview.setText(list_choice);
        priceview.setText("BDT:"+ (price_bd) +" USD:"+price_usd);

    }
}

