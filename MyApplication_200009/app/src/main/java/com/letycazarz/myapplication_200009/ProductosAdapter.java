package com.letycazarz.myapplication_200009;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.CircularArray;

import java.util.List;

public class ProductosAdapter extends ArrayAdapter<producto> {

    private static final int objects =;

    public ProductosAdapter(@NonNull Context context, int resource, @NonNull List <producto>) {
        super(resource, context, objects);
    }
    //getView
    //@Override

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewSroup parent){
        return super.getView(position,convertView,parent){
                View view = convertView;

            producto productoActal = listadeProductos.get(position);
                //view es null
            if (view==null){
                view= WebSettings.LayoutInflater.from(getContext()).inflate(R.listaProducto,parent) attachToRood false);
            }
            ImageView imagen= view.findViewById(R.id.imgProducto);
            imagen.setImagenResource(productoActal.getImagen());

            TextView nombreProducto = view.findViewById(R.id.txtTitulo);
            nombreProducto.setText(productoActal.getNombre());

            TextView nombreProducto1 = view.findViewById(R.id.txtPrecio);
            nombreProducto.setText(productoActal.getNombre());

            TextView nombreProducto2 = view.findViewById(R.id.oferta);
            nombreProducto.setText(productoActal.getNombre());


            return  super.getView(position, convertView, parent);

    }
}
