package com.horse.geoloc.mapview;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText UserNameET,PasswordET;
	Button LoginBT;
	
	String usernm="nagi";
	String pss="adem";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        
        UserNameET=(EditText)findViewById(R.id.UserNameET);
        PasswordET=(EditText)findViewById(R.id.PasswordET);
        LoginBT=(Button)findViewById(R.id.LoginBT);
        LoginBT.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				try{
					if(UserNameET.getText().toString()==usernm && PasswordET.getText().toString()==pss)
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
					UserNameET.setText(e.toString());
					
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
