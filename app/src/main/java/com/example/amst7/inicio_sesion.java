package com.example.amst7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class inicio_sesion  {
    EditText usuario, contrasena;
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);
        usuario = (EditText)findViewById(R.id.editTextUsuario);
        contrasena = (EditText)findViewById(R.id.editTextContraseña);


        iniciar=findViewByIZd(R.id.button);
        iniciar.setOnClickListener(v ->){
            if(usuario.getText().toString().isEmpty()||contrasena.getText().toString().isEmpty()){
                Toast.makeText(inicio_sesion.this, "Agregue Credenciales",Toast.LENGTH_LONG);
            }
            if(usuario.getText().toString() != "LuisSanta17"){
                Toast.makeText(inicio_sesion.this,"Usuario Incorrecto",Toast.LENGTH_LONG);

            }
            else{
                Intent i=new Intent(this.MenuACTIVITY);
                startActivity(i);
            }
        };









    }


}
