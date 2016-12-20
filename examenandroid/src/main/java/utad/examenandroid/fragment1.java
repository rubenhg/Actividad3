package utad.examenandroid;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


/**
 * Created by ruben.higuera on 20/12/2016.
 */
public class fragment1 extends  FragmentActivity {

    Button AM,Co,Le,De,Inf,Coches;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmen1);

        AM=(Button)findViewById(R.id.btnArtes);
        Co=(Button)findViewById(R.id.btnComida);
        Le=(Button)findViewById(R.id.btnLectura);
        De=(Button)findViewById(R.id.btnDeportes);
        Coches=(Button)findViewById(R.id.btnCoches);
        Inf=(Button)findViewById(R.id.btnInformatica);

        }

        public void changeFragment(){

        }
}
