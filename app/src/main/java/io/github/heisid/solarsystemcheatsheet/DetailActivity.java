package io.github.heisid.solarsystemcheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String SHORT_DETAIL = "short_detail";
    public static final String OBJECT_DATA = "object_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getStringExtra(NAME);
        String short_detail = getIntent().getStringExtra(SHORT_DETAIL);
        double[] object_data = getIntent().getDoubleArrayExtra(OBJECT_DATA);

        TextView tvName = findViewById(R.id.tv_name);
        TextView tvShortDetail = findViewById(R.id.tv_short_detail);
        TextView tvAphelion = findViewById(R.id.tv_aphelion);

        tvName.setText(name);
        tvShortDetail.setText(short_detail);
    }
}
