package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {

    private ArrayList<Equipo> listaEquipos;

    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItenClick(Equipo item);
    }

    public EquipoAdapter(ArrayList<Equipo> listaEquipos, OnItemClickListener listener) {
        this.listaEquipos = listaEquipos;
        this.listener = listener;
    }



    public static class EquipoViewHolder extends RecyclerView.ViewHolder {
        private TextView tvestadio;
        private TextView tventrenador;
        private TextView tvequipo;

        public EquipoViewHolder(View itemView) {
            super(itemView);
            tventrenador = (TextView)itemView.findViewById(R.id.tvEntrenador);
            tvestadio = (TextView)itemView.findViewById(R.id.tvEstadio);
            tvequipo = (TextView)itemView.findViewById(R.id.tvEquipo);

        }


        public void bindEquipo(final Equipo equipo, final OnItemClickListener listener) {
            tvequipo.setText(equipo.getNombre());
            tvestadio.setText(equipo.getEstadio());
            tventrenador.setText(equipo.getEntrenador());
            /* Coloco el listener a la vista*/
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItenClick(equipo);
                }
            });
        }


    }

    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        /*Crea la vista de un item y la "pinta"*/
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_equipo, viewGroup, false);
        /* Crea un objeto de la clase CocheViewHolder, pasándole la vista anteriormente creada*/
        EquipoViewHolder equipoVH = new EquipoViewHolder(itemView);
        /* devuelve la vissta*/
        return equipoVH;
    }
    @Override
    public void onBindViewHolder(EquipoViewHolder viewHolder, int pos) {
        Equipo equipo = listaEquipos.get(pos);
        /* Llama a bindCoche, para que "pinte" los datos del coche que se le pasa como parámetro*/
        viewHolder.bindEquipo(equipo,listener);
    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

}
