package info.webinformatica.basic.z1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private static final String KEY_SAUDACAO = "msgSaudacao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ed1 =  findViewById(R.id.editText1);
         String msg = Utils.carregarDadosComponente(KEY_SAUDACAO,this);
         ed1.setText(msg);
    }

    public void gravar(View view) {
        Utils.salvarDadosComponente(KEY_SAUDACAO,ed1.getText().toString(),view.getContext());
    }
}
