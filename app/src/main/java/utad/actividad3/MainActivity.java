package utad.actividad3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

import utad.mylibrary.QBAdmin;
import utad.mylibrary.QBAdminListener;

public class MainActivity extends AppCompatActivity implements QBAdminListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void logeado(boolean logeado, QBUser user){
        //syso(Me he logeado)
    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }

}
