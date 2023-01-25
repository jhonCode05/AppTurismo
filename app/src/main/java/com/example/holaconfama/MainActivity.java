package com.example.holaconfama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // atributos

    // metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // metodo para crear un menu

    // cargar el menu creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        // el primer menu es el de xml y lo guardo  en el onjeto menu de java
        return true;
    }

    // dar funcionamiento al menu



    // metodo para ver la opcion selleccionada
    public boolean onOptionsItemSelected( MenuItem item) {
        // observamos que item selecciona
        int itemseleccionado = item.getItemId();// ak guardo el id

        switch (itemseleccionado){
            case (R.id.opcion1):
                Toast.makeText(this, "seleccionaste opcion 1", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion2):
                Toast.makeText(this, "seleccionaste opcion 2", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion3):
                Toast.makeText(this, "seleccionaste opcion 3", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}