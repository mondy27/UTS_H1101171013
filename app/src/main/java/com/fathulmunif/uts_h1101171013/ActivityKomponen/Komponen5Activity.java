package com.fathulmunif.uts_h1101171013.ActivityKomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fathulmunif.uts_h1101171013.R;
import com.fathulmunif.uts_h1101171013.Sintaks.Sintaks5;

public class Komponen5Activity extends AppCompatActivity {

    Button syntax5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);
        syntax5 = (Button) findViewById(R.id.sintaks5);

        syntax5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Komponen5Activity.this, Sintaks5.class);
                startActivity(j);
            }
        });
    }

    public void link5(View view) {
        Intent link5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/intents-filters?hl=id#Types"));
        startActivity(link5);
    }
}
