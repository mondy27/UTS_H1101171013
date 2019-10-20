package com.fathulmunif.uts_h1101171013.ActivityKomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fathulmunif.uts_h1101171013.R;
import com.fathulmunif.uts_h1101171013.Sintaks.Sintaks1;

public class Komponen1Activity extends AppCompatActivity {

    Button syntax1, link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);
        syntax1 = (Button) findViewById(R.id.sintaks1);
        link1 = (Button) findViewById(R.id.link1);

        syntax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Komponen1Activity.this, Sintaks1.class);
                startActivity(f);
            }
        });
    }

    public void link(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id#Components"));
        startActivity(link1);
    }
}
