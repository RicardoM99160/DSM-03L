package sv.edu.udb.dcomplementaria_guia3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numero;
    private Button agregar;
    private TextView resultado;
    private MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregar = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.textView);
        model = new ViewModelProvider(this).get(MainActivityViewModel.class);

        final Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onChanged(Integer nuevoValor) {
                resultado.setText(""+nuevoValor);
            }
        };

        model.getNum().observe(this,observer);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(model.getNum().getValue() == null){
                    numero = 1;
                }else{
                    numero = model.getNum().getValue();
                    numero = (numero < 9) ? numero+=1 : 0;
                }

                model.getNum().setValue(numero);
            }
        });


    }

}