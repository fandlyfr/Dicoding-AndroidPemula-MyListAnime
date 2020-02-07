package com.example.mylistanime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.mylistanime.AnimeData.*;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Anime> list = new ArrayList<>();
    private ArrayList<Anime> listAnime;
    private ArrayList<Anime> getListPresident() {
        return listAnime;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list.addAll(getListData());
        showRecyclerGrid();
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        final ListAnimeAdapter listPresidentAdapter = new ListAnimeAdapter(this);
        listPresidentAdapter.setListAnime(list);
        rvCategory.setAdapter(listPresidentAdapter);

    }


    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        final GridAnimeAdapter gridAnimeAdapter = new GridAnimeAdapter(this);
        gridAnimeAdapter.setListPresident(list);
        rvCategory.setAdapter(gridAnimeAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedAnime(list.get(position));
            }
        });
    }

    private void showSelectedAnime(Anime anime){
        //Toast.makeText(this, "Kamu memilih "+anime.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        intent.putExtra(DetailActivity.TITLE,anime.getName());
        intent.putExtra(DetailActivity.STUDIO,anime.getRemarks());
        intent.putExtra(DetailActivity.GENRE,anime.getGenre());
        intent.putExtra(DetailActivity.DESCRIPTION,anime.getDesc());
        intent.putExtra(DetailActivity.IMAGE,anime.getPhoto());
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

