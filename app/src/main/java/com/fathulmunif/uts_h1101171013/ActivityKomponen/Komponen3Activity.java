package com.fathulmunif.uts_h1101171013.ActivityKomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fathulmunif.uts_h1101171013.R;
import com.fathulmunif.uts_h1101171013.Sintaks.Sintaks3;

public class Komponen3Activity extends AppCompatActivity {

    Button syntax3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen3);
        syntax3 = (Button) findViewById(R.id.sintaks3);

        syntax3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(Komponen3Activity.this, Sintaks3.class);
                startActivity(h);
            }
        });
    }

    public void link3(View view) {
        Intent link3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id#Components"));
        startActivity(link3);
    }
}
