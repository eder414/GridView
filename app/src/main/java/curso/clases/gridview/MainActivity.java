package curso.clases.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import curso.clases.gridview.Adapters.GridAdapter;
import curso.clases.gridview.Models.Usuarios;
import curso.clases.gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<Usuarios> lUsuarios;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lUsuarios = GetUsuarios();
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,lUsuarios);

        gridView = findViewById(R.id.gridView);

        gridView.setAdapter(gridAdapter);


    }

    private List<Usuarios> GetUsuarios() {
        List<Usuarios> lUsuarios = new ArrayList<>();
        lUsuarios.add(new Usuarios("Prueba",R.drawable.caracangrejo));
        lUsuarios.add(new Usuarios("Prueba",R.drawable.cell));
        lUsuarios.add(new Usuarios("Prueba",R.drawable.gorila));
        lUsuarios.add(new Usuarios("Prueba",R.drawable.saitama));
        lUsuarios.add(new Usuarios("Prueba",R.drawable.android));
        return lUsuarios;
    }
}