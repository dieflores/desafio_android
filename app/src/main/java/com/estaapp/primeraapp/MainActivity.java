package com.estaapp.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView miImagen1 = findViewById(R.id.miImagen1);
        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(miImagen1);

        Button mibotoncito = findViewById(R.id.mi_buton);

        mibotoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "este es mi new toats", Toast.LENGTH_SHORT).show();
                intentExample();
            }

        });
    }

    private void intentExample() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
