package com.example.osvaldoairon.expandlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView listview = (ExpandableListView)findViewById(R.id.listaviewExpand);


        List<String> listPe = new ArrayList<String>();
        listPe.add("Caruaru");
        listPe.add("Recife");

        List<String> listSp = new ArrayList<String>();
        listSp.add("Sao Paulo");
        listSp.add("Campinas");

        List<String> listPb = new ArrayList<String>();

        listPb.add("Rio Tinto");
        listPb.add("Joao Pessoa");

        Map<String,List<String>> dados = new HashMap<String , List<String>>();
        dados.put("PE", listPe);
        dados.put("SP", listSp);
        dados.put("PB", listPb);

        listview.setAdapter(new MeuExpandableAdapter(dados));

        List<String> cidades = new ArrayList<String>();
        cidades.add("Pedra");
        cidades.add("Arcoverde");
        cidades.add("Buique");
        cidades.add("Recife");
        cidades.add("Custodia");
        cidades.add("Garanhus");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,cidades);

        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);


        actv.setAdapter(adapter);


    }
}
