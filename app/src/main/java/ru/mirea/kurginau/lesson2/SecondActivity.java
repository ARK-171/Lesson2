package ru.mirea.kurginau.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String t = (String) getIntent().getSerializableExtra("key");
        text = findViewById(R.id.editTextdata2);
        text.setText(t.toString());
    }
}