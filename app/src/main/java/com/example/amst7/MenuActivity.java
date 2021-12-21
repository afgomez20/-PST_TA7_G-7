package com.example.amst7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {
    CategoriasFragment categoriasFragment = new CategoriasFragment();
    InicioFragment inicioFragment = new InicioFragment();
    PerfilFragment perfilFragment = new PerfilFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navigation = findViewById(R.id.bottomnavigation_menu);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFrament(inicioFragment);
    }
    /**
     * BottomNavigationView que permite cambiar entre fragmentos de vistas (Inicio, Perfil, Categorias)
     * */
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.categoriasFragment:
                    loadFrament(categoriasFragment);
                    return true;
                case R.id.inicioFragment:
                    loadFrament(inicioFragment);
                    return true;
                case R.id.perfilFragment:
                    loadFrament(perfilFragment);
                    return true;
            }
            return false;
        }
    };

    /**
     * Funcion encargada de carga cada uno de los fragmentos solicitados
     * */
    public void loadFrament(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
    }
}