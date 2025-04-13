package br.com.pabloandrade.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);

        Button login = findViewById(R.id.btn_logar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_logar = new Intent(LoginActivity.this, MenuAdmin.class);
                startActivity(in_logar);
            }
        });
    }
}
