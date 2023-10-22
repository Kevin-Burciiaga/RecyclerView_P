package com.example.recyclerview_p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.recyclerview_p.Models.Equipos;
import com.example.recyclerview_p.Adapter.EquiposAdapter;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Equipos>Lista_Equipos = new ArrayList<>();
        Lista_Equipos.add(new Equipos("Real Madrid","La Liga","Santiago Bernabeu"));
        Lista_Equipos.add(new Equipos("Barcelona","La Liga","Camp Nou"));
        Lista_Equipos.add(new Equipos("Atlético de Madrid","La Liga","Wanda Metropolitano"));
        Lista_Equipos.add(new Equipos("Manchester United","Premier League","Old Trafford"));
        Lista_Equipos.add(new Equipos("Manchester City","Premier League","Etihad Stadium"));
        Lista_Equipos.add(new Equipos("Chelsea","Premier League","Stamford Bridge"));
        Lista_Equipos.add(new Equipos("Liverpool","Premier League","Anfield"));
        Lista_Equipos.add(new Equipos("Juventus","Serie A","Allianz Stadium"));
        Lista_Equipos.add(new Equipos("A.C Milan","Serie A","San Siro"));
        Lista_Equipos.add(new Equipos("Inter de Milan","Serie A","San Siro"));
        Lista_Equipos.add(new Equipos("Bayern Munich","Bundesliga","Allianz Arena"));
        Lista_Equipos.add(new Equipos("Borussia Dortmund","Bundesliga","Signal Iduna Park"));
        Lista_Equipos.add(new Equipos("PSG","Ligue 1","Parc des Princes"));
        Lista_Equipos.add(new Equipos("Olympique de Lyon","Ligue 1","Parc Olympique Lyonnais"));
        Lista_Equipos.add(new Equipos("Boca Juniors","Superliga Argentina","La Bombonera"));
        Lista_Equipos.add(new Equipos("River Plate","Superliga Argentina","El Monumental"));
        Lista_Equipos.add(new Equipos("América","Liga MX","Estadio Azteca"));
        Lista_Equipos.add(new Equipos("Chivas","Liga MX","Estadio Akron"));
        Lista_Equipos.add(new Equipos("Santos","Brasilerao","Vila Belmiro"));
        Lista_Equipos.add(new Equipos("Flamengo","Brasilerao","Maracaná"));
        Lista_Equipos.add(new Equipos("Palmeiras","Brasilerao","Allianz Parque"));

        EquiposAdapter ea = new EquiposAdapter(Lista_Equipos);
        androidx.recyclerview.widget.RecyclerView rc = findViewById(R.id.rcEquipos);
        rc.setAdapter(ea);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}