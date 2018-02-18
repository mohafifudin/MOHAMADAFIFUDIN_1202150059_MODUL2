package com.example.apip.mohamadafifudin_1202150059_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    Adaptermenu adapter;
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.ikan, "IkanBakar", 20000, "ikan dibakar"));
        listmenu.add(new pilihMenu(R.drawable.kentang, "Sambel Goreng Kentang", 10000, "kentang, cabai, petai"));
        listmenu.add(new pilihMenu(R.drawable.ayambakar, "Ayam Bakar", 25000, "ayam , sayuran, kecap"));
        listmenu.add(new pilihMenu(R.drawable.ayamgoreng, "Ayam Goreng", 25000, "ayam, sayuran"));
        listmenu.add(new pilihMenu(R.drawable.nasigoreng, "Nasi Goreng", 23000, "nasi, kecap, cabai, telor"));
        adapter = new Adaptermenu(this, listmenu);
        rv.setAdapter(adapter);
    }
}
