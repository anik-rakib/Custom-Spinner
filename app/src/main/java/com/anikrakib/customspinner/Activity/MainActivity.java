package com.anikrakib.customspinner.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.anikrakib.customspinner.Adapter.CustomAdapter;
import com.anikrakib.customspinner.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] countryNames={"","Bangladesh","China","new Zealand","United Kingdom","United States","Srilanka","Brazil","Canada","Germany","Sweden"};
    int flags[] = {0, R.drawable.bangladesh, R.drawable.china, R.drawable.new_zealand, R.drawable.united_kingdom, R.drawable.united_states, R.drawable.sri_lanka,R.drawable.brazil,R.drawable.canada,R.drawable.germany,R.drawable.sweden};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = findViewById(R.id.countrySpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countryNames);
        spin.setAdapter(customAdapter);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), countryNames[position]+" "+position, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}