package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Tables extends AppCompatActivity {
    EditText number;
    TextView tableShow;
    Integer num = 2,x;
    Button button;
    String tbhint ="",tb="";
    Spinner spinner;
    Integer[] items = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
     //  number = findViewById(R.id.number);
       tableShow = findViewById(R.id.tableShow);
       button = findViewById(R.id.button);
       spinner = findViewById(R.id.spinner2);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_item,items);
        spinner.setAdapter(adapter);


        for(int i = 1;i<11;i++){
            x =num*i;
            tbhint = tbhint+(num+"  "+"x"+"  "+i+"  "+"="+"    "+x+"  "+"\n");

        }
        tableShow.setText(tbhint);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // num = Integer.parseInt(number.getText().toString());
                num = Integer.parseInt(spinner.getSelectedItem().toString());
                if (!(spinner.getSelectedItem().toString().equals(""))){

                    for (int i = 1; i < 11; i++) {
                        x = num * i;
                        tb = tb + (num + "   " + "x" + "   " + i + "   " + "=" + "     " + x + "   " + "\n");

                    }

                    tableShow.setText(tb);
                    tb = "";

                }
                else{
                    Toast.makeText(Tables.this, "Enter the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}