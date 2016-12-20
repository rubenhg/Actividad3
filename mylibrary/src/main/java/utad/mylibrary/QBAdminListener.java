package utad.mylibrary;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

/**
 * Created by ruben.higuera on 29/11/2016.
 */
public interface QBAdminListener {

    public void registrado(boolean blregistrado);
    public void logeado(boolean bllogeado,QBUser user);
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos);


}
