package com.example.appaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            SQLiteDatabase bancoDados= openOrCreateDatabase("dbAluno",MODE_PRIVATE,null);

            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS tbAluno (nome VARCHAR(50),email VARCHAR(50),telefone VARCHAR(10))");

            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Clara','clara@gmail.com','1131234567')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Vitoria','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Carol','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Flavia','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Humberto','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Henrique','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Eduardo','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Vitor','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Camila','vic@gmail.com','1178945612')");
            bancoDados.execSQL("INSERT INTO tbAlunos(nome,email,telefone) VALUES('Livia','vic@gmail.com','1178945612')");




            Cursor cursor= bancoDados.rawQuery("SELECT nome,email,telefone FROM tbAluno",null);
           int indiceNome= cursor.getColumnIndex("nome");
           int indiceEmail= cursor.getColumnIndex("email");
           int indiceTelefone= cursor.getColumnIndex("telefone");

           cursor.moveToFirst();
           while (cursor != null) {

               Log.i("RESULTADO -nome", cursor.getString(indiceNome));

               Log.i("RESULTADO -email", cursor.getString(indiceEmail));

               Log.i("RESULTADO -telefone", cursor.getString(indiceTelefone));

               cursor.moveToNext();

           }

        }catch (Exception e){
            e.printStackTrace();
        }



        }

    }

