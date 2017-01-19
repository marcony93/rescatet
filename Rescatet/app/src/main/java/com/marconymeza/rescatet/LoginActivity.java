package com.marconymeza.rescatet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUsuario, txtContrasenia;
    private Button btnIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsuario = (EditText) findViewById(R.id.LoginTxtUser);
        txtContrasenia = (EditText) findViewById(R.id.LoginTxtPass);
        btnIniciarSesion = (Button) findViewById(R.id.LoginBtnInicioSecion);
        btnIniciarSesion.setOnClickListener(EventoClicInicioSesion);
    }

    View.OnClickListener EventoClicInicioSesion = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            IniciarSesion();
        }
    };

    private void IniciarSesion()
    {
        String usuario = txtUsuario.getText().toString();
        String contrasenia = txtContrasenia.getText().toString();
        if(usuario.equals("marcony") && contrasenia.equals("123"))
        {
            Toast.makeText(this, "Ha ingresado con éxito", Toast.LENGTH_SHORT).show();
            IrMenuActivity();
        }
        else
            Toast.makeText(this, "Error al iniciar Sesion", Toast.LENGTH_SHORT).show();
    };

    private void IrMenuActivity()
    {
        Intent i = new Intent(this,MenuActivity.class);
        startActivity(i);
    }
}
