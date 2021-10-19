package activitylifecycle.grupouninter.com.br;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.VideoView;

public class SegundaActivity extends Activity {

    RadioButton rbOpcao1;
    RadioButton rbOpcao2;
    RadioButton rbOpcao3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_segunda);

            rbOpcao1 = (RadioButton) findViewById(R.id.rbOpcao1);
            rbOpcao2 = (RadioButton) findViewById(R.id.rbOpcao2);
            rbOpcao3 = (RadioButton) findViewById(R.id.rbOpcao3);

            rbOpcao1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("retorno", "Primeira Opção");
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });

            rbOpcao2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("retorno", "Segunda Opção");
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });

            rbOpcao3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("retorno", "Terceira Opção");
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });

            Button voltaPrimeiraTela = findViewById(R.id.buttonVoltar);
            voltaPrimeiraTela.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
    }

}
