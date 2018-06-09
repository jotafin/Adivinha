package app.adivinha.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button  botaojogar;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botaojogar = findViewById(R.id.botao_jogarId);
        resultado = findViewById(R.id.resultadoId);

        //resultado.setText("lol");

        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();

                int naleatorio = randomico.nextInt(11);

                resultado.setText("Número escolhido: " + naleatorio);
            }
        });


    }
}
