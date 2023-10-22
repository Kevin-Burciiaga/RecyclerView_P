package com.example.recyclerview_p.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import  androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_p.Models.Equipos;
import com.example.recyclerview_p.R;


import java.util.List;
public class EquiposAdapter extends RecyclerView.Adapter<EquiposAdapter.ViewHolder>{

    List<Equipos>Lista_Equipos;
    public EquiposAdapter(List<Equipos> lista_Equipos) {
        Lista_Equipos = lista_Equipos;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v = ly.inflate(R.layout.item_equipo,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Equipos c = Lista_Equipos.get(position);
        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return Lista_Equipos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

            TextView txNombre;
            TextView txLiga;
            TextView txEstadio;
            Equipos cp;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txNombre = itemView.findViewById(R.id.txNombre);
                txLiga = itemView.findViewById(R.id.txLiga);
                txEstadio = itemView.findViewById(R.id.txEstadio);
            }

            public void setData(Equipos c) {
                cp=c;
                txNombre.setText(cp.getNombre());
                txLiga.setText(cp.getLiga());
                txEstadio.setText(cp.getEstadio());
            }
        }
        }

