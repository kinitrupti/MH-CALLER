package com.example.myapp;

import android.os.Bundle; 
import android.app.Activity;
import android.app.AlertDialog;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.net.Uri;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
	  private AutoCompleteTextView actv;
	   
	  final Context context = this;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] cities = getResources().
        getStringArray(R.array.cities);
        ArrayAdapter adapter = new ArrayAdapter
        (this,android.R.layout.simple_list_item_1,cities);
        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1); //autocompletes city name
        actv.setAdapter(adapter);
        
      
            
        EditText auto=(EditText) findViewById(R.id.autoCompleteTextView1);
        EditText phone=(EditText) findViewById(R.id.phone);
        phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
      
        
            @Override
            public void onFocusChange(View view, boolean hasFocus) { //inputs std code onfocus to phone textbox before calling
            	  EditText auto=(EditText) findViewById(R.id.autoCompleteTextView1);
                  if (hasFocus && auto.getText().toString().equals("Achalpur")) {
                	
                  	 EditText phone=(EditText) findViewById(R.id.phone);
                	 phone.setText("07223"+phone.getText().toString().trim());
                	 
                	
                    }
                   
                  else if (hasFocus && auto.getText().toString().equals("Ahmednagar")){
                  	EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("0241"+phone.getText());
                  	 
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Ahmedpur")){
                  		EditText phone=(EditText) findViewById(R.id.phone);
                     	 phone.setText("02381"+phone.getText());
                     
                  	
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Akkalkot")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02181"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Alibagh")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02141"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Amravati")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("0721"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Aurangabad")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02432"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Balapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07257"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Bassein")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("0250"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Bhandara")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07184"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Chandrapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07172"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Chanwad")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02556"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Chhikaldara")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07220"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Chinchwad")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("0212"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Dahanu")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02528"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Deogad")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02364"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Deoli")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07158"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Deori")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07199"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Dhanora")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07138"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Gangapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("02433"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Goregaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                  	 phone.setText("07187"+phone.getText());
                    
                  	  }
                   else if (hasFocus && auto.getText().toString().equals("Igatpuri")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02553"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Jalgaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0257"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Junnar")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02132"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Kalyan")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0251"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Khadakwasala")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0230"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Khopoli")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02192"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Kolhapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0231"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Kopargaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02423"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Koregaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02163"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Latur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02382"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Lonavala")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02114"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Mahabaleswar")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("4344"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Malegaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02554"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Malwan")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02365"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Mumbai")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("022"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Murud")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("023867"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Nagpur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0712"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Nanded")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02462"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Nandgaon")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("07221"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Nashik city")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0253"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Navi Mumbai")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("0215"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Osmanabad")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02472"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Paithan")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                   	 phone.setText("02431"+phone.getText());
                     
                   	  }
                   else if (hasFocus && auto.getText().toString().equals("Pali")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02142"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Panhala")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02328"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Patan")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02372"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Pune")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("020"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Ramtek")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("07114"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Ratnagiri")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02352"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Sakarwadi")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02160"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Sakoli")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("07186"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Sangli")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("0233"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Sholapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("0217"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Tumsar")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("07183"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Vijapur")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02436"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Wardha")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("07152"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Yawal")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02585"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Yeola")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                    	 phone.setText("02559"+phone.getText());
                      
                    	  }
                   else if (hasFocus && auto.getText().toString().equals("Yeotmal")){
                	   EditText phone=(EditText) findViewById(R.id.phone);
                     	 phone.setText("07232"+phone.getText());
                       
                   }


            
            }
        } );
       
        
        Button buttonExit = (Button)this.findViewById(R.id.exit); //exit button code
        buttonExit.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View v) {
                	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
            				context);
             
            			// set title
            			
             
            			// set dialog message
            			alertDialogBuilder
            				.setMessage("Click yes to exit MH-CALLER!")
            				.setCancelable(false)
            				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
            					public void onClick(DialogInterface dialog,int id) {
            						// if this button is clicked, close
            						// current activity
            						MainActivity.this.finish();
            					}
            				  })
            				.setNegativeButton("No",new DialogInterface.OnClickListener() {
            					public void onClick(DialogInterface dialog,int id) {
            						// if this button is clicked, just close
            						// the dialog box and do nothing
            						dialog.cancel();
            					}
            				});
             
            				// create alert dialog
            				AlertDialog alertDialog = alertDialogBuilder.create();
             
            				// show it
            				alertDialog.show();
            			}
            		});
    

        Button button1 = (Button) findViewById(R.id.call);
     // add PhoneStateListener
     		
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	 EditText auto=(EditText) findViewById(R.id.autoCompleteTextView1);
                 EditText phone=(EditText) findViewById(R.id.phone);
                 
              
              if( auto.length() == 0 || phone.length() == 0 ) { //empty field validation
                  Toast.makeText(v.getContext(), "Please Fill All The Details", Toast.LENGTH_SHORT).show();
               
              }
              else {
            	  Intent callIntent = new Intent(Intent.ACTION_CALL);          //calls desired number
                  callIntent.setData(Uri.parse("tel:"+phone.getText().toString().trim()));
                  startActivity(callIntent); 
              }
       	  
 				
              
              
              
              
              
           }
            
        });
   
        Button btn=(Button) findViewById(R.id.clear); //clear button code
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText auto=(EditText) findViewById(R.id.autoCompleteTextView1);
                EditText phone=(EditText) findViewById(R.id.phone);
                auto.setText("");
                phone.setText("");
            }
     
        }
        );
        
        
       
    }





	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}	}