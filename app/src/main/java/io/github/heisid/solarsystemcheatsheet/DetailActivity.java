package io.github.heisid.solarsystemcheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String PICTURE = "picture";
    public static final String SHORT_DETAIL = "short_detail";
    public static final String OBJECT_DATA = "object_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getStringExtra(NAME);
        //int pic = getIntent().getIntExtra(PICTURE,0);
        Bundle bundle = getIntent().getExtras();
        int pic = bundle.getInt("PICTURE");
        String short_detail = getIntent().getStringExtra(SHORT_DETAIL);
        double[] object_data = getIntent().getDoubleArrayExtra(OBJECT_DATA);
        // aphelion(km), perihelion(km), orbital period(d), radius(km), mass(kg), surface gravity(m/s2), rotation period(h)
        String aphelion = checkEmpty(object_data[0]) + " km";
        String perihelion = checkEmpty(object_data[1]) + " km";
        String orbital_period = checkEmpty(object_data[2]) + " days";
        String radius = checkEmpty(object_data[3]) + " km";
        String mass = checkEmpty(object_data[4]) + " kg";
        String surface_gravity = checkEmpty(object_data[5]) + " m/s2";
        String rotation_period = checkEmpty(object_data[6]) + " hours";

        TextView tvName = findViewById(R.id.tv_name);
        ImageView ivPic = findViewById(R.id.iv_pic);
        TextView tvShortDetail = findViewById(R.id.tv_short_detail);
        TextView tvAphelion = findViewById(R.id.tv_aphelion);
        TextView tvPerihelion = findViewById(R.id.tv_perihelion);
        TextView tvOrbitalPeriod = findViewById(R.id.tv_orbital_period);
        TextView tvRadius = findViewById(R.id.tv_radius);
        TextView tvMass = findViewById(R.id.tv_mass);
        TextView tvSurfaceGravity = findViewById(R.id.tv_gravity);
        TextView tvRotationPeriod = findViewById(R.id.tv_rotation_period);

        tvName.setText(name);
        ivPic.setImageResource(pic);
        tvShortDetail.setText(short_detail);
        tvAphelion.setText(aphelion);
        tvPerihelion.setText(perihelion);
        tvOrbitalPeriod.setText(orbital_period);
        tvRadius.setText(radius);
        tvMass.setText(mass);
        tvSurfaceGravity.setText(surface_gravity);
        tvRotationPeriod.setText(rotation_period);

    }

    private String checkEmpty(double value) {
        if (value == 0.0) {
            return "-";
        } else {
            return String.valueOf(value);
        }
    }
}
