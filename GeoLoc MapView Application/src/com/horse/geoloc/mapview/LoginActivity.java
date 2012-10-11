package com.horse.geoloc.mapview;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText username,password;
	Button ok;
	
	String usernm="nagi";
	String pss="adem";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        
        username=(EditText)findViewById(R.id.UserNameET);
        password=(EditText)findViewById(R.id.PasswordET);
        ok=(Button)findViewById(R.id.LoginBT);
        ok.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				try{
					if(username.getText().toString()==usernm && password.getText().toString()==pss)
					{
					   Toast.makeText(getApplicationContext(),"Correct!", Toast.LENGTH_SHORT).show();
						
					}
					else
					{
						Toast.makeText(getApplicationContext(),"Uncorrect!", Toast.LENGTH_SHORT).show();
					}
					
				}
				catch(Exception e)
				{
					username.setText(e.toString());
					
				}

				
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
