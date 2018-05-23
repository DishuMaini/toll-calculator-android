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

public class a3 extends Activity {

	EditText b1,b2;
	Button a;
	Bundle b=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
        b1=(EditText)findViewById(R.id.editText1);
        b2=(EditText)findViewById(R.id.editText2);
        a=(Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b=getIntent().getExtras();
				String x1=b1.getText().toString();
				String x2=b2.getText().toString();
				String s1=b.getString("a2");
				String s2=b.getString("a3");
				String s3=b.getString("a1");
				b.putString("na1", s1);
				b.putString("na2", s3);
				if(x1.equals(s1) && x2.equals(s2)){
				Intent i= new Intent(a3.this,a2.class);
				i.putExtras(b);
				startActivity(i);
				}
				else
				  {
					Toast.makeText(a3.this, "UserName or Password is wrong", 3000).show();
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
