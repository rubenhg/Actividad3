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

public class Registro extends AppCompatActivity implements QBAdminListener {

    EditText UsuarioRegistro,ContraseñaRegistro,Email;
    Button Registrarse;
    LoginControlador controlador;
    QBAdmin qbAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        UsuarioRegistro = (EditText)findViewById(R.id.etUsuarioRegistro);
        ContraseñaRegistro = (EditText)findViewById(R.id.etContraseñaRegistro);
        Registrarse = (Button)findViewById(R.id.btnRegistro);
        Email = (EditText)findViewById(R.id.etEmail);
        controlador = new LoginControlador(this);
        qbAdmin = new QBAdmin(this, this);
        qbAdmin.InicioQB();

        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Registro.this, MainActivity.class);
                Registro.this.startActivity(myIntent);
            }
        });
    }

    @Override
    public void logeado(boolean bllogeado, QBUser user) {

    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }
}
