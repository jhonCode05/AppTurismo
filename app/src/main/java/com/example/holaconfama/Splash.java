package com.example.holaconfama;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    // mediapalyer es una clase que me sirve para almacenar multimedia
    MediaPlayer cancion;

    // metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // oculte el action bar
        ActionBar barra = getSupportActionBar();
        barra.hide();

        // lanzar la cancion
        // metodo mediaplayer tiene 2 parametros
        // donde va a iniciar el audio y la ruta donde se encuentra
        // clas r es una clase que contiene todos los recursos de mi app
        cancion=MediaPlayer.create(this,R.raw.cancionapp);

        // ak inicio la reproduccion de la cancion
        cancion.start();

        // ak configuro el tiempo que va a reproducirse la cancion
        // timestark es una clase que me permite controlarv el tiempo
        TimerTask inicioapp= new TimerTask() {
            @Override
            public void run() {
                // intent me permite cargar una actividad el constructor tiene dos parametros donde estoy y a que actividad quiero pasar
                Intent intent=new Intent(Splash.this,MainActivity.class);
                //inicio la otra vista
                startActivity(intent);


            }
        };
        // ak le pongo el tiempo que se demora la aplicacion

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,10000);


    }


    }
