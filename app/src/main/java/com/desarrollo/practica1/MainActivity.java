package com.desarrollo.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final float[] resultado = new float[1];
        Button btnCalcular= (Button) findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView edit_Peso=(TextView) findViewById(R.id.editPeso);
                TextView edit_Altura=(TextView) findViewById(R.id.editAltura);
                TextView tv_Resultado=(TextView) findViewById(R.id.tv_imc);
                TextView tv_Rec2=(TextView) findViewById(R.id.tvRec2);
                TextView tv_Descripcion=(TextView) findViewById(R.id.tv_estado);


                int peso= Integer.parseInt(edit_Peso.getText().toString());
                float altura= Float.parseFloat(edit_Altura.getText().toString());
                resultado[0] =(peso/(altura*altura));
                if(resultado[0]<18.5){
                    tv_Resultado.setText("IMC:"+resultado[0]);
                    tv_Descripcion.setText(R.string.rp1);
                    tv_Rec2.setText(R.string.reco1);
                }else{
                    if (resultado[0]<24.9){
                        tv_Resultado.setText("IMC:"+resultado[0]);
                        tv_Descripcion.setText(R.string.rp2);
                        tv_Rec2.setText(R.string.reco2);
                    }else{
                        if (resultado[0]<29.9){
                            tv_Resultado.setText("IMC:"+resultado[0]);
                            tv_Descripcion.setText(R.string.rp3);
                            tv_Rec2.setText(R.string.reco3);
                        }else{
                            tv_Resultado.setText("IMC:"+resultado[0]);
                            tv_Descripcion.setText(R.string.rp4);
                            tv_Rec2.setText(R.string.reco4);
                        }

                    }
                }
            }
        });

    }
}