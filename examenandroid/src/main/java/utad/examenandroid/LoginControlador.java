package utad.examenandroid;

import android.view.View;

/**
 * Created by ruben.higuera on 20/12/2016.
 */
public class LoginControlador implements View.OnClickListener{

    MainActivity vista;
    Registro vistaRegistro;


    public LoginControlador(MainActivity vista,Registro vistaRegistro){
        this.vista = vista;
        this.vistaRegistro = vistaRegistro;
    }




    @Override
    public void onClick(View v) {

        if (v.getId() == vista.Loggin.getId()){
            if (!vista.Usuario.getText().toString().equals("") &&
                    !vista.Contraseña.getText().toString().equals("")) {

                vista.qbAdmin.Loggin(vista.Usuario.getText().toString(), vista.Contraseña.getText().toString());

            }
        } else if (v.getId() == vistaRegistro.Registrarse.getId()){
            if (!vistaRegistro.UsuarioRegistro.getText().toString().equals("") && !vistaRegistro.Email.getText().toString().equals("") &&
                    !vistaRegistro.ContraseñaRegistro.getText().toString().equals("")){

                vistaRegistro.qbAdmin.Register(vistaRegistro.UsuarioRegistro.getText().toString(), vistaRegistro.Email.getText().toString(),
                        vistaRegistro.ContraseñaRegistro.getText().toString());
            }

        }

    }
}
