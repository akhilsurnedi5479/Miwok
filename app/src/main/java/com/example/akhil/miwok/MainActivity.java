package com.example.akhil.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For numbers
        TextView numbers=(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(Intent);
            }
            });

        //for family
        TextView family=(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(Intent);
            }
        });

        //for colors
        TextView colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(Intent);
            }
        });

        //for phrases
        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(Intent);
            }
        });
    }


}
