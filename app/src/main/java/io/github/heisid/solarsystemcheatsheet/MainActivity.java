package io.github.heisid.solarsystemcheatsheet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

        list.addAll(SolarSystemObjectsData.getListData());
        showRecyclerList();
    }

    private void showSelectedObject(SolarSystemObject solarSystemObject) {
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        detailIntent.putExtra(DetailActivity.NAME, solarSystemObject.getName());
        detailIntent.putExtra(DetailActivity.SHORT_DETAIL, solarSystemObject.getShortDetail());
        detailIntent.putExtra(DetailActivity.OBJECT_DATA, solarSystemObject.getData());
        startActivity(detailIntent);
    }

    private void showRecyclerList() {
        rvSolarSystem.setLayoutManager(new LinearLayoutManager(this));
        SolarSystemAdapter solarSystemAdapter = new SolarSystemAdapter(list);
        rvSolarSystem.setAdapter(solarSystemAdapter);
        solarSystemAdapter.setOnItemClickCallback(new SolarSystemAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(SolarSystemObject data) {
                showSelectedObject(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent intentAbout = new Intent(MainActivity.this, About.class);
                startActivity(intentAbout);
                break;
            case R.id.exit:
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
		        builder.setMessage("Exit?");
		        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				finish();
			}
		});
		        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
			        @Override
			        public void onClick(DialogInterface dialogInterface, int i) {
				        dialogInterface.dismiss();
		        	}
		        });

		        AlertDialog alertDialog = builder.create();
		        alertDialog.show();

        }
    }
}
