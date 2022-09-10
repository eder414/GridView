package curso.clases.gridview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

import curso.clases.gridview.Models.Usuarios;
import curso.clases.gridview.R;

public class GridAdapter extends BaseAdapter {
    Context context;
    List<Usuarios> lUsuarios;
    LayoutInflater inflater;
    ImageView imagen;
    TextView nombre;
    public GridAdapter(Context context, List<Usuarios> lUsuarios) {
        this.context = context;
        this.lUsuarios = lUsuarios;
    }

    @Override
    public int getCount() {
        return lUsuarios.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null){
            view = inflater.inflate(R.layout.grid_item,null);
        }


        imagen = view.findViewById(R.id.gridImage);
        nombre = view.findViewById(R.id.item_name);

        Usuarios usuario = lUsuarios.get(i);

        imagen.setImageResource(usuario.getImage());
        nombre.setText(usuario.getNombre());

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(),usuario.getNombre(),Toast.LENGTH_LONG ).show();
            }
        });

        return view;
    }
}
