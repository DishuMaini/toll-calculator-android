package com.example.toll_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class a4 extends Activity {

	EditText a1;
	Button a;
	Spinner sp1,sp2;
	String s1[]={"3 Wheeler","Car","Jeep","Lcv","Bus","Truck","Mav"};
	String s2[]={"Single","Return","Daily","Monthly Pass"};
	Bundle b=new Bundle();
	String u,v,x,y;
	ArrayAdapter<String> c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);
        a1=(EditText)findViewById(R.id.editText2);
        a=(Button)findViewById(R.id.button1);
        sp1=(Spinner)findViewById(R.id.spinner1);
        sp2=(Spinner)findViewById(R.id.spinner2);
        c1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,s1);
        sp1.setAdapter(c1);
        c2=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,s2);
        sp2.setAdapter(c2);
        sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				u =arg0.getItemAtPosition(arg2).toString();
				x=u;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        sp2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				v =arg0.getItemAtPosition(arg2).toString();
				y=v;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});

        a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				b=getIntent().getExtras();
				String s11=b.getString("nna1");
				String s21=b.getString("nna2");
				b.putString("nnna1", s11);
				b.putString("nnna2", s21);
		        b.putString("nnna3", u);
				String z2=a1.getText().toString();
		        b.putString("nnna4", z2);
		        b.putString("nnna5", v);
		        String pr = null;
		        String x1="3 Wheeler";        
		        String x2="Car";        
		        String x3="Jeep";        
		        String x4="Lcv";        
		        String x5="Bus";        
		        String x6="Truck";        
		        String x7="Mav";  
		        String y1="Single";        
		        String y2="Return";        
		        String y3="Daily";        
		        String y4="Monthly Pass";  
		        if(x.equals(x1) && y.equals(y1))
		    	{
		    		pr="9";
		    	}
		        else if(x.equals(x1) && y.equals(y2))
		    	{
		    		pr="17";
		    	}
		        else if(x.equals(x1) && y.equals(y3))
		    	{
		    		pr="30";
		    	}
		        else if(x.equals(x1) && y.equals(y4))
		    	{
		    		pr="280";
		    	}
		        else if((x.equals(x2) || x.equals(x3)) && y.equals(y1))
		    	{
		    		pr="25";
		    	}
		        else if((x.equals(x2) || x.equals(x3)) && y.equals(y2))
		    	{
		    		pr="50";
		    	}
		        else if((x.equals(x2) || x.equals(x3)) && y.equals(y3))
		    	{
		    		pr="80";
		    	}
		        else if((x.equals(x2) || x.equals(x3)) && y.equals(y4))
		    	{
		    		pr="1950";
		    	}
		        else if(x.equals(x4) && y.equals(y1))
		    	{
		    		pr="41";
		    	}
		        else if(x.equals(x4) && y.equals(y2))
		    	{
		    		pr="80";
		    	}
		        else if(x.equals(x4) && y.equals(y3))
		    	{
		    		pr="110";
		    	}
		        else if(x.equals(x4) && y.equals(y4))
		    	{
		    		pr="2550";
		    	}
		        else if(x.equals(x5) && y.equals(y1))
		    	{
		    		pr="65";
		    	}
		        else if(x.equals(x5) && y.equals(y2))
		    	{
		    		pr="125";
		    	}
		        else if(x.equals(x5) && y.equals(y3))
		    	{
		    		pr="190";
		    	}
		        else if(x.equals(x5) && y.equals(y4))
		    	{
		    		pr="4200";
		    	}
		        else if(x.equals(x6) && y.equals(y1))
		    	{
		    		pr="97";
		    	}
		        else if(x.equals(x6) && y.equals(y2))
		    	{
		    		pr="180";
		    	}
		        else if(x.equals(x6) && y.equals(y3))
		    	{
		    		pr="280";
		    	}
		        else if(x.equals(x6) && y.equals(y4))
		    	{
		    		pr="6200";
		    	}
		        else if(x.equals(x7) && y.equals(y1))
		    	{
		    		pr="194";
		    	}
		        else if(x.equals(x7) && y.equals(y2))
		    	{
		    		pr="360";
		    	}
		        else if(x.equals(x7) && y.equals(y3))
		    	{
		    		pr="560";
		    	}
		        else if(x.equals(x7) && y.equals(y4))
		    	{
		    		pr="12500";
		    	}
		        b.putString("nnna6",pr);
				Intent i= new Intent(a4.this,a5.class);
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