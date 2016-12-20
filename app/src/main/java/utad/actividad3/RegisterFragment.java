package utad.actividad3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.quickblox.auth.QBAuth;
import com.quickblox.auth.model.QBSession;
import com.quickblox.core.QBEntityCallback;
import com.quickblox.users.QBUsers;
import com.quickblox.users.model.QBUser;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {


    public Button btnSignUP;
    public EditText login, registro;


    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_register, container, false);



    }

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

    final QBUser user = new QBUser(login.getText().toString() , registro.getText().toString());
    QBUsers.signUp(user, new QBEntityCallback<QBUser>() {
        @Override
        public void onSuccess(QBUser user, Bundle args) {

        }

        @Override
        public void onError(QBResponseException errors) {

        }
    });

}
