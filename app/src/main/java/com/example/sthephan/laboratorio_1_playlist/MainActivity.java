package com.example.sthephan.laboratorio_1_playlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;
    @BindView(R.id.btnBuscar)
    Button btnBuscar;
    @BindView(R.id.lstCanciones)
    ListView lstCanciones;
    @BindView(R.id.lstBusqueda)
    ListView lstBusqueda;


    public HashMap<String, Cancion> canciones = new HashMap<>();
    public ArrayList<Cancion> lstBusCancion = new ArrayList<Cancion>();
    public ArrayList<Cancion> lstPlaylist = new ArrayList<Cancion>();
    public AdapterCancion adapter2 = new AdapterCancion(this, lstPlaylist);
    public AdapterCancion adapter1 = new AdapterCancion(this, lstBusCancion);
    @BindView(R.id.rgOrden)
    RadioGroup rgOrden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Diccionario.llenarDiccionario(canciones);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        lstBusqueda.setClickable(true);
        lstBusqueda.setOnItemClickListener(new ItemList());

    }

    @OnClick({R.id.btnBuscar, R.id.btAscendenteNom, R.id.btAscendenteDur, R.id.btDescendenteNom, R.id.btDescendenteDur})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBuscar:
                String prueba = txtNombre.getText().toString();
                if (txtNombre.getText().toString().equals("")) {
                    Toast message = Toast.makeText(getApplicationContext(), "Por favor ingrese el nombre de la cancion", Toast.LENGTH_LONG);
                    message.show();
                } else {
                    Cancion c1 = canciones.get(txtNombre.getText().toString());
                    if(c1 != null){
                        lstBusCancion.clear();
                        lstBusCancion.add(c1);
                        lstBusqueda.setAdapter(adapter1);
                    }
                    else{
                        Toast message1 = Toast.makeText(getApplicationContext(), "El nombre de la cancion no ha sido encontrado", Toast.LENGTH_LONG);
                        message1.show();
                    }
                }
                break;
            case R.id.btAscendenteNom:
                Ordenamiento.ordenamientoAscC(lstPlaylist);
                lstCanciones.setAdapter(adapter2);
                break;
            case R.id.btAscendenteDur:
                Ordenamiento.ordenamientoAscT(lstPlaylist);
                lstCanciones.setAdapter(adapter2);
                break;
            case R.id.btDescendenteNom:
                Ordenamiento.ordenamientoDesc(lstPlaylist);
                lstCanciones.setAdapter(adapter2);
                break;
            case R.id.btDescendenteDur:
                Ordenamiento.ordenamientoDescT(lstPlaylist);
                lstCanciones.setAdapter(adapter2);
                break;
        }
    }

    class ItemList implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            boolean val = true;
            for (Cancion c : lstPlaylist) {
                if (c.getNombre().equals(lstBusCancion.get(0).getNombre())) {
                    val = false;
                    break;
                }
            }
            if (val == true) {
                lstPlaylist.add(lstBusCancion.get(0));
                Ordenamiento.ordenamientoAscC(lstPlaylist);
                lstCanciones.setAdapter(adapter2);
            }
            lstCanciones.setAdapter(adapter2);
        }
    }
}
