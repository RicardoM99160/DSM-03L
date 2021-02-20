package sv.edu.udb.guia04appdiscusionr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultadosActividad extends AppCompatActivity {

    TextView txtvNombre, txtvHoras, txtvIsss, txtvAfp, txtvRenta, txtvSueldo, txtvSueldoNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_actividad);

        txtvNombre = (TextView) findViewById(R.id.txtvNombre);
        txtvHoras = (TextView) findViewById(R.id.txtvHoras);
        txtvIsss = (TextView) findViewById(R.id.txtvISSS);
        txtvAfp = (TextView) findViewById(R.id.txtvAFP);
        txtvRenta = (TextView) findViewById(R.id.txtvRenta);
        txtvSueldo = (TextView) findViewById(R.id.txtvSueldo);
        txtvSueldoNeto = (TextView) findViewById(R.id.txtvSueldoNeto);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("Nombre");
        int horas = Integer.parseInt(bundle.getString("Horas"));

        float sueldo = (float) (horas * 8.5);
        float ISSS = (float) (sueldo * 0.02);
        float AFP = (float) (sueldo * 0.03);
        float renta = (float) (sueldo * 0.04);
        float sueldoNeto = sueldo - (ISSS + AFP + renta);

        txtvNombre.setText("Nombre: "+nombre);
        txtvHoras.setText("Horas trabajadas: "+horas);
        txtvSueldo.setText("Sueldo: "+sueldo);
        txtvIsss.setText("Descuento ISSS: "+ISSS);
        txtvAfp.setText("Descuento AFP: "+AFP);
        txtvRenta.setText("Descuento Renta: "+renta);
        txtvSueldoNeto.setText("Sueldo neto: "+sueldoNeto);

    }

    public void finalizar(View v){
        finish();
    }
}