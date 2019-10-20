package com.fathulmunif.uts_h1101171013.ActivityKomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fathulmunif.uts_h1101171013.R;
import com.fathulmunif.uts_h1101171013.Sintaks.Sintaks4;

public class Komponen4Activity extends AppCompatActivity {

    Button syntax4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);

        syntax4 = (Button) findViewById(R.id.sintaks4);

        syntax4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Komponen4Activity.this, Sintaks4.class);
                startActivity(i);
            }
        });
    }

    public void link4(View view) {
        Intent link4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id#Components"));
        startActivity(link4);
    }
}
