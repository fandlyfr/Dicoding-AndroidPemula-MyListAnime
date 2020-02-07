package com.example.mylistanime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String IMAGE = "IMAGE";
    public static String TITLE = "TITLE";
    public static String STUDIO = "STUDIO";
    public static String GENRE = "GENRE";
    public static String DESCRIPTION = "DESCRIPTION";

    ImageView img;
    TextView title;
    TextView genre;
    TextView desc;
    TextView std;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String imgPath = getIntent().getStringExtra(IMAGE);
        img = (ImageView)findViewById(R.id.tvimg);
        Glide.with(this)
                .load(imgPath)
                .into(img);

        String ttl = getIntent().getStringExtra(TITLE);
        title = (TextView) findViewById(R.id.title_name);
        title.setText(ttl);

        String studio = getIntent().getStringExtra(STUDIO);
        std = (TextView) findViewById(R.id.studio_name);
        std.setText(studio);

        String gnr = getIntent().getStringExtra(GENRE);
        genre = (TextView) findViewById(R.id.genre_name);
        genre.setText(gnr);

        String descr = getIntent().getStringExtra(DESCRIPTION);
        desc = (TextView) findViewById(R.id.desc_name);
        desc.setText(descr);
    }
}
