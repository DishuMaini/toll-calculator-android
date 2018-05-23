package com.example.toll_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class a5 extends Activity {

	TextView t1,t2,t3,t4,t5,t6;
	Bundle b=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a5);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);

        t1.setText("Welcome");

        b=getIntent().getExtras();

        String s1=b.getString("nnna2");
        t2.setText("Name:-"+s1);

        String s2=b.getString("nnna1");
        t3.setText("User Name:-"+s2);

        String s3=b.getString("nnna3");
        t4.setText("Vehicle Type:-"+s3);

        String s4=b.getString("nnna4");
        t5.setText("Vehicle No.:-"+s4);

        String s6=b.getString("nnna6");
        t6.setText("Price:-"+s6);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
