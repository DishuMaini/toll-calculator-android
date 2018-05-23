package com.example.toll_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class a2 extends Activity {

	Button a;
	Bundle b=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        a=(Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b=getIntent().getExtras();
				String s1=b.getString("na1");
				String s2=b.getString("na2");
				b.putString("nna1", s1);
				b.putString("nna2", s2);
				Intent i= new Intent(a2.this,a4.class);
				i.putExtras(b);
				startActivity(i);
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
