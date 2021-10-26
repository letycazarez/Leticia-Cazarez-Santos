package com.letycazarz.myapplication_200009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<producto>listaProductos;
    private  ProductosAdapter productosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProductos= new ArrayList<>();
        Object precio;
        listaProductos.add(new Producto(nombre "SAMSUNG Galaxy Watch Active2", R.drawable.ic_launcher_foreground,precio: 5,132.01, oferta false));
        listaProductos.add(new Producto(nombre "Huawei Watch Gt 2 - Reloj Inteligente", R.drawable.ic_launcher_foreground,precio: 3699, oferta: true));

        productosAdapter= new ProductosAdapter(getApplicationContext(),resource 0, listaProductos);
        ListView listView= findViewById(R.id.listViewProductos);
    }
}