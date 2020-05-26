package com.example.example_it_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText object_a, object_b, object_c;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solve(View v) {

        if(v.getId() == R.id.solve_button) {
            object_a = findViewById(R.id.editA);
            object_b = findViewById(R.id.editB);
            object_c = findViewById(R.id.editC);

            result = findViewById(R.id.result);
            double a = Double.parseDouble(object_a.getText().toString());
            double b = Double.parseDouble(object_b.getText().toString());
            double c = Double.parseDouble(object_c.getText().toString());
            double d = b * b - 4 * a * c;
            DecimalFormat df = new DecimalFormat("###.###");


            if (d == 0) {
                double x = (-b + Math.sqrt(d)) / 2 * a;
                result.setText("Один корень: " + df.format(x));
            } else if (d < 0) {
                result.setText("Нет решений!");
            } else if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 2 * a;
                result.setText("Два корня: x1=" + df.format(x1) + "; x2=" + df.format(x2));
            }

        } else {
            object_a.setText("");
            object_b.setText("");
            object_c.setText("");
            result.setText("");
        }



    }
}
