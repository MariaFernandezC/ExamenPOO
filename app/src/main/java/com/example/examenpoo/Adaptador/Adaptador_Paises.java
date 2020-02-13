package com.example.examenpoo.Adaptador;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.examenpoo.Paises;
import com.example.examenpoo.R;

import com.mindorks.placeholderview.PlaceHolderView;


public class Adaptador_Paises extends PlaceHolderView.Adapter<Adaptador_Paises.ViewHolderDatos>{

    Paises[] listaDatos;
    Context context;
    private Posicion posicion;

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Adaptador_Paises(Paises[] listaDatos) {
        this.listaDatos = listaDatos;
    }
    public Adaptador_Paises(Paises[] listaDatos, Context context) {
        this.context=context;
        this.listaDatos = listaDatos;
    }

    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Enlaza el adaptador con el archivo layout_paises
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_paises,null,false);
        return new ViewHolderDatos(view,posicion);
    }

    @Override
    public void onBindViewHolder( ViewHolderDatos viewHolderDatos, int i) {
        //establece la comunicación entre el adaptador y la clase viewHolderDatos
        viewHolderDatos.lblPais.setText(listaDatos[i].getName());

        Glide.with(this.context)
                .load(listaDatos[i].getUrl())

                .into(viewHolderDatos.imgPais);

    }

    @Override
    public int getItemCount() {
        //Retornara el tamaño de la lista
        return listaDatos.length;
    }



    public class ViewHolderDatos extends PlaceHolderView.ViewHolder {

        ImageView imgPais;
        TextView lblPais;

        public ViewHolderDatos(@NonNull View itemView, final Posicion pos) {
            super(itemView);
            imgPais=itemView.findViewById(R.id.imgPais);
            lblPais=itemView.findViewById(R.id.lblPais);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pos.position(getLayoutPosition());
                    //Log.d("Log viewHolder","Click" + getLayoutPosition());
                }
            });
        }


    }
}
