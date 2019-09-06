package io.github.heisid.solarsystemcheatsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSolarSystem;
    private ArrayList<SolarSystemObject> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSolarSystem = findViewById(R.id.rv_solarsystem);
        rvSolarSystem.setHasFixedSize(true);

        list.addAll(ObjectsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvSolarSystem.setLayoutManager(new LinearLayoutManager(this));
        SolarSystemAdapter solarSystemAdapter = new SolarSystemAdapter(list);
        rvSolarSystem.setAdapter(solarSystemAdapter);
    }
}
