package com.example.vianneyribeiro.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String dd ="{\"nome\":\"Vianney Ribeiro\",\"telefone\": 99182182912, livros:{\"servidao\": \"martins silva\",\"obras mortas\": \"josue pereira\"}}";
       try {
            JSONObject root = new JSONObject(dd);
            String nome = root.getString("nome");
            int telefone = root.getInt("telefone");

            System.out.println(nome);
            System.out.println(telefone);

JSONObject livros = root.getJSONObject("livros");
String obra = livros.getString("servidao");
String obramorta = livros.getString("obras mortas");

            System.out.println(obra);
            System.out.println(obramorta);

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
