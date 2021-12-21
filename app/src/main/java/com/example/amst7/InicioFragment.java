package com.example.amst7;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amst7.clases.LibroAdapter;
import com.example.amst7.clases.ListLibro;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;

import android.widget.Toast;

import com.example.amst7.clases.Data;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //Clases libros y adaptador
    LibroAdapter libros;
    RecyclerView recyclerView;
    ArrayList<ListLibro> librosList;

    public InicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
   /**
    * Funcion q muestra el view del Inicio
    * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_inicio, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        librosList = new ArrayList<>();
        //Cargamos la lista
        cargarLista();
        //Mostramos datos
        mostrarDatos();
        return v;
    }
    /**
     * Funcion que se encarga de cargar la lista de datos de la clase Data y convertirlas en objeto librosList
     * */

    public void cargarLista(){
        for(int i=0;i<Data.libros.length;i++){
            librosList.add(new ListLibro(Data.libros[i][0],Data.libros[i][1],Data.libros[i][2],Data.libros[i][3],Data.libros[i][4],Data.librosImg[i]));
        }
    }
    /**
     * Funcion en cargada de mostrar los datos necesarios para el cardview
     * */
    public void mostrarDatos(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        libros = new LibroAdapter(getContext(), librosList);
        recyclerView.setAdapter(libros);
        libros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = librosList.get(recyclerView.getChildAdapterPosition(view)).getNombre();
                Toast.makeText(getContext(), "Seleccionaste: "+titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}