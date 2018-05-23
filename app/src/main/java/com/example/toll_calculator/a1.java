package com.example.toll_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class a1 extends Activity {

	EditText a1,a2,a3,a4,a5;
	Button a;
	Bundle b=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
        a1=(EditText)findViewById(R.id.editText1);
        a2=(EditText)findViewById(R.id.editText2);
        a3=(EditText)findViewById(R.id.editText3);
        a4=(EditText)findViewById(R.id.editText4);
        a5=(EditText)findViewById(R.id.editText5);
        a=(Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x1=a1.getText().toString();
		        b.putString("a1", x1);
				String x2=a2.getText().toString();
		        b.putString("a2", x2);
				String x3=a3.getText().toString();
		        b.putString("a3", x3);
				String x4=a4.getText().toString();
		        b.putString("a4", x4);
				String x5=a5.getText().toString();
		        b.putString("a5", x5);
		        int w1=x1.length();
		        int w2=x2.length();
		        int w3=x3.length();
		        int w4=x4.length();
		        int w5=x5.length();
		        if(x3.equals(x4) && w5==10 && w1!=0 && w2!=0 && w3!=0 && w4!=0)
		          {
		        	Intent i= new Intent(a1.this,a3.class);
		        	i.putExtras(b);
		        	startActivity(i);
		          }
		        else if(x3.equals(x4)!=true)
		          {
		        	Toast.makeText(a1.this, "Password and Confirm Password Should be same",2000).show();
		          }
		        else if(w5!=10)
		          {
		        	Toast.makeText(a1.this, "Mobile Number Should be of 10 digits",2000).show();
		          }
		        else if(w1==0 || w2==0 || w3==0 || w4==0)
		          {
		        	Toast.makeText(a1.this, "Field cannot be empty",2000).show();
		          }
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
