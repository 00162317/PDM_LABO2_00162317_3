package com.example.paneles;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mLinearLayout;

    private Button btn1, btn2, btn3;

    public ArrayList<Drawable> listaRoja  = new ArrayList<>();
    public ArrayList<Drawable> listaVerde  = new ArrayList<>();
    public ArrayList<Drawable> listaAzul  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*BUSCANDO ID*/
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        /*AL CLICK*/
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        colores();
        int n=randomColor();
        int viewId = v.getId();
        switch (viewId){
            case R.id.btn1:
                btn1.setBackground(listaRoja.get(n));
                break;
            case R.id.btn2:
                btn2.setBackground(listaVerde.get(n));
                break;
            case R.id.btn3:
                btn3.setBackground(listaAzul.get(n));
                break;
            default:
                break;
        }
    }
    public void colores(){
        listaRoja.add(getResources().getDrawable(R.color.rojoUno));
        listaRoja.add(getResources().getDrawable(R.color.rojoDos));
        listaRoja.add(getResources().getDrawable(R.color.rojoTres));
        listaRoja.add(getResources().getDrawable(R.color.rojoCuatro));
        listaRoja.add(getResources().getDrawable(R.color.rojoCinco));
        listaRoja.add(getResources().getDrawable(R.color.rojoSeis));

        listaAzul.add(getResources().getDrawable(R.color.azulUno));
        listaAzul.add(getResources().getDrawable(R.color.azulDos));
        listaAzul.add(getResources().getDrawable(R.color.azulTres));
        listaAzul.add(getResources().getDrawable(R.color.azulCuatro));
        listaAzul.add(getResources().getDrawable(R.color.azulCinco));
        listaAzul.add(getResources().getDrawable(R.color.azulSeis));

        listaVerde.add((getResources().getDrawable(R.color.verdeUno)));
        listaVerde.add((getResources().getDrawable(R.color.verdeDos)));
        listaVerde.add((getResources().getDrawable(R.color.verdeTres)));
        listaVerde.add((getResources().getDrawable(R.color.verdeCuatro)));
        listaVerde.add((getResources().getDrawable(R.color.verdeCinco)));
        listaVerde.add((getResources().getDrawable(R.color.verdeSeis)));

    }

    public int randomColor(){
        int num = (int) (Math.random()*6)+1;
        return num;
    }
}
