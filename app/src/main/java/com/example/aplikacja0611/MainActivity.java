package com.example.aplikacja0611;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Album> albumy = new ArrayList<>();
    ImageButton buttonDalej;
    ImageButton buttonWstecz;
    Button buttonPobierz;
    TextView textViewAlbum;
    TextView textViewWykonawca;
    TextView textViewRok;
    TextView textViewPobrania;
    int aktualny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDalej = findViewById(R.id.imageButton2);
        buttonWstecz = findViewById(R.id.imageButton);
        buttonPobierz = findViewById(R.id.button3);
        textViewAlbum = findViewById(R.id.textViewAlbum);
        textViewPobrania = findViewById(R.id.textViewPobrania);
        textViewRok = findViewById(R.id.textViewRok);
        textViewWykonawca = findViewById(R.id.textViewWykonawca);


        albumy.add(new Album("The Now Now","Gorillaz",1999,72,0));
        albumy.add(new Album("Sigma","Bartek",1989,122,0));
        albumy.add(new Album("The Black Parade","My Chemical Romance",1969,212,0));

        wyswietlPiesn(0);

        buttonDalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualny++;
                        if(aktualny == albumy.size()){
                            aktualny = 0;
                        }
                        wyswietlPiesn(aktualny);
                    }
                }
        );

        buttonWstecz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualny--;
                        if(aktualny < 0){
                            aktualny = albumy.size()-1;
                        }
                        wyswietlPiesn(aktualny);
                    }
                }
        );

        buttonPobierz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        albumy.get(aktualny).zwiekszPobrania();
                        wyswietlPiesn(aktualny);
                    }
                }
        );

    }


    private void wyswietlPiesn(int i){
        Album album = albumy.get(i);
        textViewWykonawca.setText(album.getWykonawca());
        textViewRok.setText(String.valueOf(album.getRok()+" " + String.valueOf(album.getLiczbaUtworow())));
        textViewAlbum.setText(String.valueOf(album.getNazwa()));
        textViewPobrania.setText(String.valueOf(album.getPobrania()));
    }

}