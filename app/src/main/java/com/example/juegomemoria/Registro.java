package com.example.juegomemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText txt_nombre, txt_apellido, txt_username, txt_password;
    private ConexionSQLiteHelper dbHelper;
    private SQLiteDatabase db;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txt_nombre = (EditText) findViewById(R.id.nombre);
        txt_apellido = (EditText) findViewById(R.id.apellido);
        txt_username = (EditText) findViewById(R.id.username);
        txt_password = (EditText) findViewById(R.id.password);
        dbHelper = new ConexionSQLiteHelper(this, "bd_juegomemoria", null, 1);
        db = dbHelper.getWritableDatabase();

    }

    public void clickRegistro(View view) {

        String nombre = txt_nombre.getText().toString();
        String apellido = txt_apellido.getText().toString();
        String username = txt_username.getText().toString();
        String password = txt_password.getText().toString();

        if (nombre.length() == 0 || apellido.length() == 0 || username.length() == 0 || password.length() == 0) {
            Toast.makeText(this, "Faltan completar campos", Toast.LENGTH_LONG).show();
        } else {

            if (verificarUsuario(username)) {
                Toast.makeText(this, "ERROR. Username ya existe.", Toast.LENGTH_LONG).show();
            } else {
                dbHelper.insertar("INSERT INTO USUARIO VALUES('" + username + "','" + nombre + "','" + apellido + "','" + password + "')", db);
                onBackPressed();
                Toast.makeText(this, "Registro con éxito", Toast.LENGTH_LONG).show();
            }
        }
    }

    public boolean verificarUsuario(String username) {
        Cursor c = db.rawQuery("SELECT username FROM usuario WHERE username = '" + username + "'", null);
        return (c.moveToFirst());
    }

    public void clickRegresar(View view) {
        onBackPressed();
    }
}