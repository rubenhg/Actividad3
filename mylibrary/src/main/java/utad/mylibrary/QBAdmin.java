package utad.mylibrary;

import android.app.Activity;
import android.os.Bundle;

import com.quickblox.auth.QBAuth;
import com.quickblox.auth.model.QBSession;
import com.quickblox.core.QBEntityCallback;
import com.quickblox.core.QBSettings;
import com.quickblox.core.exception.QBResponseException;
import com.quickblox.users.QBUsers;
import com.quickblox.users.model.QBUser;

/**
 * Created by ruben.higuera on 22/11/2016.
 */
public class QBAdmin {

    QBAdminListener listener;

    public QBAdmin(QBAdminListener listener, Activity activity) {

        this.listener = listener;

        String APP_ID = "50919";
        String AUTH_KEY = "XHkHqa657NGXakB";
        String AUTH_SECRET = "ndTne4F4wDtupgM";
        String ACCOUNT_KEY = "yoqyZbHgJjSzdhcHbjbP";
//
        QBSettings.getInstance().init(activity, APP_ID, AUTH_KEY, AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(ACCOUNT_KEY);
    }

    public void InicioQB() {

        QBAuth.createSession(new QBEntityCallback<QBSession>() {

            @Override
            public void onSuccess(QBSession session, Bundle params) {
                // You have successfully created the session
                //
                // Now you can use QuickBlox API!
            }

            @Override
            public void onError(QBResponseException errors) {

            }
        });

    }

    public void Loggin(final String usuario, final String password) {


        final QBUser user = new QBUser(usuario, password);

        QBUsers.signIn(user, new QBEntityCallback<QBUser>() {
            @Override
            public void onSuccess(QBUser user, Bundle params) {

               listener.logeado(true,user);
            }

            @Override
            public void onError(QBResponseException errors) {
                System.out.println(errors + " !!!!!");
                System.out.println("Usuario: " + usuario + "Contraseña: " + password);
                 listener.logeado(false,user);
            }
        });

    }
    public void Register(String usuario, String password, String email){

        final QBUser user = new QBUser(usuario, password);
        user.setEmail(email);
        QBUsers.signUp(user, new QBEntityCallback<QBUser>() {
            @Override
            public void onSuccess(QBUser user, Bundle args) {
                System.out.println("Registrado.");
                listener.registrado(true);
            }

            @Override
            public void onError(QBResponseException errors) {
                System.out.println(errors);
                System.out.println("Usuario No Registrado.");
                listener.registrado(false);
            }
        });

    }


}



