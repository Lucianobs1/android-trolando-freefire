package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton eCorno = (RadioButton) findViewById(R.id.radioSim);
        final RadioButton naoCorno = (RadioButton) findViewById(R.id.radioNao);
        final ImageView corno = (ImageView) findViewById(R.id.imagePadrao);
        final TextView result = (TextView) findViewById(R.id.resultAnalise);
        final EditText name = (EditText) findViewById(R.id.nameText);

        Button verificar = (Button) findViewById(R.id.analiseCorno);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(naoCorno.isChecked()){
                    result.setText( name.getText() + " Você escapou da cornisse meu jovem !!! ");
                }
                if(eCorno.isChecked()){
                   corno.setImageResource(R.drawable.corno);
                   result.setText( name.getText() + " Corno pra caralho !!! ");
                }
            }
        });
    }
}
