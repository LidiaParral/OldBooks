package com.dam.oldbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *  Ventana de Login
 *  @author lidia
 *  @see OBLogin
 */
public class OBLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ob_login);
    }

    public void signIn(View view) {
        Intent i = new Intent(this, OBMain.class);
        startActivity(i);
    }
}