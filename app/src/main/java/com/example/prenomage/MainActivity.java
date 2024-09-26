package com.example.prenomage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.age = (EditText) findViewById(R.id.txtAge);
        this.name = (EditText) findViewById(R.id.txtName);
    }

    public void teleport(View view) {

        //#1
        // faire la creation du bus en fournissant une indentite (this) au conducteur
        //et une destination (la seconde activity que nous visons)
        Intent i = new Intent(this, MainActivity2.class);

        //#2
        // faire le ceuilete des informations qui  doivent voyager de
        // la page a vers la page b
        String n = thid.name.getText().toString();
        int a = Integer.parseInt(this.age.getText().toString());

        //#3
        // atribuer une place aux passagers (keyx) et les installer dans le bus
        i.putExtra("Key1",n);
        i.putExtra("key2",a);

        Montre m1 = new Montre(price: 525.99, maker: "Guess", weight: 1.0);
        i.putExtra(name:"watch", m1);

        train.passger = "Guy";
        train.etudiantVoyareur = new Student(id: 123, nom: "tarik", age: 20);

        //#4
        //sonner le depart du bus
        startActivity(i);

    }


}