package ru.mirea.kurginau.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clik(View view) {
        EditText text = findViewById(R.id.editTextTextPersonName);
        String t = text.getText().toString();
        String s = "Студент №" + t.length() + "группа" + t.length() + "количество символов" + t.length();
        Toast toast = Toast.makeText(getApplicationContext(),
                s,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}