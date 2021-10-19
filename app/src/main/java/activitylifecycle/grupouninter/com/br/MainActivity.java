package activitylifecycle.grupouninter.com.br;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String ACTIVITY = "MainActivity";

    TextView resultado;
    Button btnOpcao;
    static int ACAO_BUSCA_PREFERENCIA_USER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(ACTIVITY, "onCreate()");

        Button btnSegundaActivity = findViewById(R.id.button);
        btnSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SegundaActivity.class);
                startActivity(intent);
            }
        });
//        --------------------------------- Aula 03 -------------------------------
        btnOpcao = (Button) findViewById(R.id.btnOpcao);
        btnOpcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SegundaActivity.class);
                startActivityForResult(intent, ACAO_BUSCA_PREFERENCIA_USER);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ACAO_BUSCA_PREFERENCIA_USER){
            if (requestCode == RESULT_OK) {
                resultado = (TextView) findViewById(R.id.resultado);
                resultado.setText(data.getStringExtra("retorno"));
            }
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(ACTIVITY, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(ACTIVITY, "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(ACTIVITY, "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(ACTIVITY, "onStop()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(ACTIVITY, "onRestart()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(ACTIVITY, "onDestroy()");
    }

}