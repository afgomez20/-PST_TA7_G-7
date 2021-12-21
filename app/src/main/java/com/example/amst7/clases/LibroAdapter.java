package com.example.amst7.clases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amst7.R;

import java.util.ArrayList;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolder> implements View.OnClickListener{
    /**
     * Adaptador para el RecyclerView
     * */
    ArrayList<ListLibro> modelo;
    LayoutInflater inflater;

    Context context;

    //Listener
    private View.OnClickListener listener;

    public LibroAdapter(Context context, ArrayList<ListLibro> modelo){
        this.inflater = LayoutInflater.from(context);

        this.context = context;

        this.modelo = modelo;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_libro, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String titulo = modelo.get(position).getNombre();
        String autor = modelo.get(position).getAutor();
        String editor = modelo.get(position).getEditorial();
        int img = modelo.get(position).getImagen();
        holder.titulo.setText(titulo);
        holder.autor.setText(autor);
        holder.editor.setText(editor);
        holder.img.setImageResource(img);

    }

    @Override
    public int getItemCount() {
        return modelo.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView autor;
        TextView editor;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tituloLibro);
            autor = itemView.findViewById(R.id.autorLibro);
            editor = itemView.findViewById(R.id.editorialLibro);
            img = itemView.findViewById(R.id.imgLibro);
        }
    }
}
