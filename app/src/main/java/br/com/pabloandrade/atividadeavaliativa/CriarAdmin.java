package br.com.pabloandrade.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CriarAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_admin);

        Button inserir = findViewById(R.id.btn_inserir);

        inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_inserir = new Intent(CriarAdmin.this, MenuAdmin.class);
                startActivity(in_inserir);
            }
        });
    }
}
