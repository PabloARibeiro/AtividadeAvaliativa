package br.com.pabloandrade.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button admin = findViewById(R.id.btn_admin);
        Button cidadao = findViewById(R.id.btn_cidadao);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(in_login);
            }
        });

        cidadao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_lista = new Intent(MainActivity.this, ListaActivity.class);
                startActivity(in_lista);
            }
        });
    }
}