package com.example.calcarea;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc();
    }
    public void calc()
    {
        final Button button = (Button) findViewById(R.id.b_calc);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double height = Double.parseDouble(((EditText) findViewById(R.id.e_height)).getText().toString());
                double width = Double.parseDouble(((EditText) findViewById(R.id.e_width)).getText().toString());
                TextView area = (TextView) findViewById(R.id.area_text);
                DecimalFormat df = new DecimalFormat("#.#");
                double area_total = height * width;
                String area = "Área: " + Double.parseDouble(df.format(height * width)) + " u²";
                area.setText(area);
            }
        });
    }
}
