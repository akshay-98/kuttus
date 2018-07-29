package com.example.asus.rentyourspace;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class Rent_activity extends Activity {

    EditText wheeler2 ;
    EditText car;
    EditText bus;
    CheckBox twoWHeeler;
    CheckBox CaR;
    CheckBox BuS;
    int CAR,BUS,TWOWHEELER;

    public void onCheckBoxClicked(View view)
    {
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            if(checkBox.getId()==twoWHeeler.getId())
            {
                wheeler2.setVisibility(View.VISIBLE);
            }
            else if(checkBox.getId()==CaR.getId())
            {
                car.setVisibility(View.VISIBLE);
            }
            else if(checkBox.getId()==BuS.getId())
            {
                bus.setVisibility(View.VISIBLE);
            }

        }

    }

    public void onNext(View view)
    {
        CAR=Integer.parseInt(car.getText().toString());
        BUS=Integer.parseInt(bus.getText().toString());
        TWOWHEELER=Integer.parseInt(wheeler2.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_activity);

        wheeler2=findViewById(R.id.Wheeler2);
        car=findViewById(R.id.Car);
        bus=findViewById(R.id.Bus);
        twoWHeeler=findViewById(R.id.checkBox);
        CaR=findViewById(R.id.checkBox2);
        BuS=findViewById(R.id.checkBox3);




    }
}
