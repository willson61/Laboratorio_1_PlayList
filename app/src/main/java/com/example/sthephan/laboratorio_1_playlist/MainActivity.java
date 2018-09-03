package com.example.sthephan.laboratorio_1_playlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;
    @BindView(R.id.swOrden)
    Switch swOrden;
    @BindView(R.id.btnBuscar)
    Button btnBuscar;
    @BindView(R.id.lstCanciones)
    ListView lstCanciones;
    @BindView(R.id.lstBusqueda)
    ListView lstBusqueda;

    public HashMap<String, Cancion> canciones = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Diccionario.llenarDiccionario(canciones);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnBuscar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBuscar:
                if (txtNombre.equals(null)) {
                    Toast message = Toast.makeText(getApplicationContext(), "Por favor ingrese el nombre de la cancion", Toast.LENGTH_LONG);
                    message.show();
                } else {
                    Cancion c1 = canciones.get(txtNombre.getText());
                    ArrayList<Cancion> lstCancion = new ArrayList<Cancion>();
                    AdapterCancion adapter = new AdapterCancion(this, lstCancion);
                    lstBusqueda.setAdapter(adapter);
                }
                break;
        }
    }
}
