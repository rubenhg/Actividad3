package utad.examenandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

import utad.mylibrary.QBAdmin;
import utad.mylibrary.QBAdminListener;

public class MainActivity extends AppCompatActivity implements QBAdminListener {
    MainActivity  vista;
    Registro vistaRegistro;

    EditText Usuario,Contraseña;
    LoginControlador controlador;
    Button Loggin;
    TextView Registrarse;
    QBAdmin qbAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador = new LoginControlador(vista,vistaRegistro);
        Usuario = (EditText)findViewById(R.id.etUsuario);
        Contraseña = (EditText)findViewById(R.id.etContraseña);
        Loggin = (Button)findViewById(R.id.btnLoggin);
        Registrarse = (TextView)findViewById(R.id.lblRegistro);


        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    @Override
    public void registrado(boolean blregistrado) {

    }

    @Override
    public void logeado(boolean bllogeado, QBUser user) {
        if (bllogeado=true){
            Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
            MainActivity.this.startActivity(myIntent);
        }else{
            System.out.println("Vuelve a intentarlo");
        }
    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }


}
