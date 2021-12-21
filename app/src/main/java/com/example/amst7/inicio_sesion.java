package com.example.amst7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class inicio_sesion extends AppCompatActivity {
    EditText usuario, contrasena;
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);
        usuario = (EditText)findViewById(R.id.editTextUsuario);//recibe dato ingresado en usuario
        contrasena = (EditText)findViewById(R.id.editTextContraseña);


        iniciar=findViewById(R.id.button);
        iniciar.setOnClickListener(v ->  {
            if(usuario.getText().toString().isEmpty()||contrasena.getText().toString().isEmpty()){
                Toast.makeText(inicio_sesion.this, "Agregue Credenciales",Toast.LENGTH_LONG);
            }
            if(usuario.getText().toString() != "LuisSanta17" ){
                //comrpueba que el usuario ingresado es correcto
                Toast.makeText(inicio_sesion.this,"Usuario Incorrecto",Toast.LENGTH_LONG);

            }
            if(contrasena.getText().toString() != "12345"){
                Toast.makeText(inicio_sesion.this,"Usuario Incorrecto",Toast.LENGTH_LONG);
            }
            else{ //da paso a la nueva actividad al aplastar boton
                Intent i=new Intent(this.MenuActivity.class);
                startActivity(i);
            };
        });









    }


}
