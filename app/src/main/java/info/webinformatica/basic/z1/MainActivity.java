package info.webinformatica.basic.z1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ed1 =  findViewById(R.id.editText1);
    }

    public void gravar(View view) {
        Utils.salvarDadosComponente("fanta",ed1.getText().toString(),view.getContext());
    }
}
