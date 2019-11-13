package com.spp.foodorderingsystemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonpizza,buttonburger,buttonpastry;

    String choices="";
    double price=0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonpizza=(Button)findViewById(R.id.buttonaddpizza);
        buttonburger=(Button)findViewById(R.id.buttonaddburger);
        buttonpastry=(Button)findViewById(R.id.buttonaddpastry);
    }

public void add_to_list(View view)
    {
    if (view==findViewById(R.id.buttonaddpizza))
        {
            choices=choices + "Pizza";
            price=price+1200;
        }

       else  if (view==findViewById(R.id.buttonaddburger))
        {
            choices=choices + "burger";
            price=price+200;
        }

       else  if (view==findViewById(R.id.buttonaddpastry))
        {
           choices=choices + "pastry";
            price=price+80;
        }
    }

    public void PlaceOrder(View view) {

        Intent intent=new Intent(MainActivity.this,OrderDetails.class);
        Bundle bundle=new Bundle();
        bundle.putString("choices" ,choices);
        bundle.putDouble("price" ,price);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
