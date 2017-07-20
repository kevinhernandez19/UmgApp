package curso.umg.gt.umgapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LogoUmg extends AppCompatActivity {

    private List<String> listaestudiantes;
    private EditText et3;
    private EditView lv1;
    private ArrayAdapter<String> listaadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_umg);

    listaestudiantes = new ArrayList<>();

        et3 = (EditText)findViewById(R.id.et3);
        lv1 = (EditView)findViewById(R.id.lv1);
        listaadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaestudiantes);


        listaestudiantes.add("ana");
        listaestudiantes.add("carlos");
        listaestudiantes.add("rosa");
        listaestudiantes.add("carla");




    public void addestudiante(View view) {
        String nombre = et3.getText().toString();
        listaestudiantes.add(nombre);

        listaadapter.notifyDataSetChanged();




    }

    }






