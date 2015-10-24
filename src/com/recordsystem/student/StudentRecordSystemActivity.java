package com.recordsystem.student;

//import com.resord.studentsystem.R;

import com.recordsystem.student.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class StudentRecordSystemActivity extends Activity implements 
														  OnClickListener,
														  RadioGroup.OnCheckedChangeListener,
														  OnCheckedChangeListener
{
	//test for checkbox2 for anonymous method
	TextView lbl_test;
	
	Button btn_search, btn_first, btn_next, btn_prev, btn_last,
		   btn_new, btn_add, btn_update, btn_delete;
	EditText txt_name, txt_password, txt_email,txt_address;
	RadioGroup radiogroup1;
	CheckBox check_checkbox1, check_checkbox2;
	Spinner combo1, combo2;
	
	String country[] = {"Pakistan", "America", "England"};
	String city[] = {"Karachi", "NewYork", "London"};
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainemp);
         
        //label test for anonymous method
        lbl_test = (TextView)findViewById(R.id.lbl_test);
        //Buttons link
        btn_search = (Button)findViewById(R.id.btn_search);
        btn_first = (Button)findViewById(R.id.btn_first);
        btn_next = (Button)findViewById(R.id.btn_next);
        btn_prev = (Button)findViewById(R.id.btn_previous);
        btn_last = (Button)findViewById(R.id.btn_last);
        btn_new = (Button)findViewById(R.id.btn_new);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_update = (Button)findViewById(R.id.btn_update);
        btn_delete = (Button)findViewById(R.id.btn_delete);
        
        //Text Boxes link
        txt_name = (EditText)findViewById(R.id.txt_name);
        txt_password = (EditText)findViewById(R.id.txt_password);
        txt_email = (EditText)findViewById(R.id.txt_email);
        txt_address = (EditText)findViewById(R.id.txt_address);
        
        //Button execution on this activity
        btn_search.setOnClickListener(this);
        btn_first.setOnClickListener(this);
        btn_next.setOnClickListener(this);
        btn_prev.setOnClickListener(this);
        btn_last.setOnClickListener(this);
        btn_add.setOnClickListener(this);		
        
        //Linking radio group
        radiogroup1 = (RadioGroup)findViewById(R.id.radiogroup1);
        //radiogroupwith interface
        radiogroup1.setOnCheckedChangeListener(this);
        
        //Linking of CheckBoxes
        check_checkbox1 = (CheckBox)findViewById(R.id.check_checkbox1);
        check_checkbox2 = (CheckBox)findViewById(R.id.check_checkbox2);
        
        //checkbox with interfaces
        check_checkbox1.setOnCheckedChangeListener(this);
        //For Check Box 2 we need to open an Anonymous Method
        check_checkbox2.setOnCheckedChangeListener(
        new OnCheckedChangeListener() 
        {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{
				if(isChecked)
				{
					lbl_test.setText("CheckBox2 is Checked!");
				}
				
				else
				{
					lbl_test.setText("CheckBox2 is UNChecked!");
				}
				
			}
		}       
        
        ); 
        
        //ComboBox Implementation--Linking
        combo1 = (Spinner)findViewById(R.id.combo_country);
        combo2 = (Spinner)findViewById(R.id.combo_city);
        
        //For ComboBox Country
        ArrayAdapter cmb_country = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);
        combo1.setAdapter(cmb_country);
        
      //For ComboBox Country
        ArrayAdapter cmb_city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, city);
        combo2.setAdapter(cmb_city);
        
    }
    
    public void onClick(View v) 
    {
		switch (v.getId())
		{
		case id.btn_search:
		{
			Toast
			.makeText(this, "Search Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		case id.btn_first:
		{
			Toast
			.makeText(this, "First Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		case id.btn_next:
		{
			Toast
			.makeText(this, "Next Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		case id.btn_previous:
		{
			Toast
			.makeText(this, "Previous Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		case id.btn_last:
		{
			Toast
			.makeText(this, "Last Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		
		case id.btn_add:
		{
			Toast
			.makeText(this, "Add Button Pressed!", Toast.LENGTH_SHORT)
			.show();
			break;
		}
		
		}
	}
    
    //RadioGroupInterface Method
    public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) 
    {
    	RadioButton radio_male = (RadioButton)findViewById(R.id.radio_male);
    	if(radio_male.isChecked())
    	{
    		Toast
			.makeText(this, "Male is Selected!", Toast.LENGTH_SHORT)
			.show();			
    	}
    	
    	else
    	{
    		Toast
			.makeText(this, "Female is Selected!", Toast.LENGTH_SHORT)
			.show();
			
    	}   	

	}
    
    //Check Box1 Method from the interface class
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
    {
		if(isChecked)
		{
			Toast
			.makeText(this, "CheckBox1 is Checked!", Toast.LENGTH_SHORT)
			.show();
		}
		
		else
		{
			Toast
			.makeText(this, "CheckBox1 is UNChecked!", Toast.LENGTH_SHORT)
			.show();
		}

	}
}