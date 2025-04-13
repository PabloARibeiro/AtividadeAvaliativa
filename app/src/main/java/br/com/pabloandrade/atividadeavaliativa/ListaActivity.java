package br.com.pabloandrade.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Button voltar = findViewById(R.id.btn_voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_voltar = new Intent(ListaActivity.this, MainActivity.class);
                startActivity(in_voltar);
            }
        });
    }
}
