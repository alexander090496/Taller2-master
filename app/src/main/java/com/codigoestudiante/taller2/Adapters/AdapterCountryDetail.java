package com.codigoestudiante.taller2.Adapters;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.codigoestudiante.taller2.MainActivity;
import com.codigoestudiante.taller2.Models.CountryDetail;
import com.codigoestudiante.taller2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 28/09/2017.
 */

public class AdapterCountryDetail extends RecyclerView.Adapter<AdapterCountryDetail.ViewHolder>{

    List<CountryDetail> countryDetailList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public AdapterCountryDetail(List<CountryDetail> countryDetailList, Context context) {
        this.countryDetailList = countryDetailList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        holder.textViewSubregion.setText(countryDetailList.get(position).getSubregion());
        holder.textViewLenguage.setText(countryDetailList.get(position).getLanguages());
        holder.textViewarea.setText(Integer.toString(countryDetailList.get(position).getArea()));
    }

    @Override
    public int getItemCount() {
        return countryDetailList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewSubregion;
        TextView textViewLenguage;
        TextView textViewarea;
        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);
            textViewSubregion = (TextView) item.findViewById(R.id.id_tv_item_subregion);
            textViewLenguage = (TextView) item.findViewById(R.id.id_tv_item_lenguaje);
            textViewarea = (TextView) item.findViewById(R.id.id_tv_item_area);
        }

        @Override
        public void onClick(View view) {

            

            Toast.makeText(context,"click en el item",Toast.LENGTH_SHORT).show();
        }
    }
}
