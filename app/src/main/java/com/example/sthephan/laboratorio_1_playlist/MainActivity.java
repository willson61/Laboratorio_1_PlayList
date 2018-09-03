package com.example.sthephan.laboratorio_1_playlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;
    @BindView(R.id.swOrden)
    Switch swOrden;
    @BindView(R.id.lstCanciones)
    ListView lstCanciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Diccionario dic = new Diccionario();
        dic.llenarDiccionario();
    }

    @OnClick({R.id.btnBuscar, R.id.btnAgregar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBuscar:
                break;
            case R.id.btnAgregar:
                break;
        }
    }
}
