package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Equipo> datos = new ArrayList<>();

        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Barcelona" ,"Camp Nou" ,"Guardiola "));
        datos.add(new Equipo("Real Betis" ,"Benito Villamarin" ,"Lopetegui "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));
        datos.add(new Equipo("Real Madrid" ,"Bernabeu" ,"Zidane "));

        recyclerView = (RecyclerView) findViewById(R.id.RecView);
        recyclerView.setHasFixedSize(false);

        //Crea el adaptador, pasándole como parámetro los datos
        final EquipoAdapter adaptador = new EquipoAdapter(datos, new EquipoAdapter.OnItemClickListener() {
            @Override
            public void onItenClick(Equipo equipo) {
                Toast.makeText(MainActivity.this, "Coche pulsado: " + equipo.getNombre(), Toast.LENGTH_SHORT).show();

            }

        });

        //Asocia a recylerView el adaptador
        recyclerView.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        //Pone una división entre items
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        // Pone la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}