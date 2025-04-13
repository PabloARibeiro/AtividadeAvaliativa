package br.com.pabloandrade.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_admin);

        Button add = findViewById(R.id.btn_add);
        Button sair = findViewById(R.id.btn_sair_adm);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_add = new Intent(MenuAdmin.this, CriarAdmin.class);
                startActivity(in_add);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_sair = new Intent(MenuAdmin.this, MainActivity.class);
                startActivity(in_sair);
            }
        });
    }
}
