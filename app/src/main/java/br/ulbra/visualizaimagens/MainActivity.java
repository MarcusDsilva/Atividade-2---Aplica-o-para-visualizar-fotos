package br.ulbra.visualizaimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        ImageView imgfoto;
        Button btnfoto1, btnfoto2;
        TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgfoto = (ImageView) findViewById(R.id.imgfoto);
        btnfoto1 = (Button) findViewById(R.id.btnfoto1);
        btnfoto2 = (Button) findViewById(R.id.btnfoto2);
       txtInformacao = (TextView) findViewById(R.id.txtInformacao);

       btnfoto1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               imgfoto.setImageResource(R.drawable.vocefoiavisado);
           }
       });

       btnfoto2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               imgfoto.setImageResource(R.drawable.budabrasil);
               txtInformacao.setText("Foto 2");
           }
       });


    }
}