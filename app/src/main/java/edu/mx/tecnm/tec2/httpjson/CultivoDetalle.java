package edu.mx.tecnm.tec2.httpjson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
public class CultivoDetalle extends AppCompatActivity {
    Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivo_detalle);
        btnRegresar = findViewById(R.id.buttonRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        getIncomingIntent();
    }
    private void getIncomingIntent(){
        if (getIntent().hasExtra("id") &&
                getIntent().hasExtra("nombrecomun") &&
                getIntent().hasExtra("nombrecientifico") &&
                getIntent().hasExtra("descripcion") &&
                getIntent().hasExtra("imagen")) {
            String id = getIntent().getStringExtra("id");
            String nombrecomun =
                    getIntent().getStringExtra("nombrecomun");
            String nombrecientifico =
                    getIntent().getStringExtra("nombrecientifico");
            String descripcion =
                    getIntent().getStringExtra("descripcion");
            String imagen = getIntent().getStringExtra("imagen");
            setDatos(id, nombrecomun, nombrecientifico, descripcion,
                    imagen);
        }
    }
    public void setDatos(String id, String nombrecomun, String
            nombrecientifico, String descripcion,
                         String imagen) {
        TextView id1 = findViewById(R.id.textViewId);
        id1.setText(id);
        TextView nombrecomun1 = findViewById(R.id.textViewNombre);
        nombrecomun1.setText(nombrecomun);
        TextView nombrecientifico1 =
                findViewById(R.id.textViewNombreC);
        nombrecientifico1.setText(nombrecientifico);
        TextView descripcion1 =
                findViewById(R.id.textViewDescripcion);
        descripcion1.setText(descripcion);
        String imageURL =
                "https://alanmontessilva.000webhostapp.com/imagenes/" + imagen;
        ImageView image = findViewById(R.id.imageView);
        Glide.with(this)
                .asBitmap()
                .load(imageURL)
                .into(image);
    }
}
