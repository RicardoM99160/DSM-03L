package sv.edu.udb.guia04appdiscusionr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etHoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.txtNombre);
        etHoras = (EditText) findViewById(R.id.txtHoras);
    }

    public void calcularSalario(View v){

        Intent i = new Intent(this, resultadosActividad.class);
        i.putExtra("Nombre",etNombre.getText().toString());
        i.putExtra("Horas",etHoras.getText().toString());
        startActivity(i);

    }
}