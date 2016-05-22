package com.mustafatosun.refugee2;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mustafa on 2.5.2016.
 */
public class RegisterRequest extends StringRequest {

    private  static  final String REGISTER_REQUEST_URL ="http://refugee.comli.com/register.php";
    private Map<String, String>params;

    public RegisterRequest (String name, String username, String mail,String password,Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("mail",mail);
        params.put("password",password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
