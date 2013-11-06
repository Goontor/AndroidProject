package example.imctuto;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText weightText = null;
	TextView resultText = null;
	RadioButton metre = null;
	RadioButton centimetre = null;
	EditText sizeText = null;
	Button calculateButton = null;
	Button razButton = null;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       metre = (RadioButton) findViewById(R.id.radioButton1);
       centimetre = (RadioButton) findViewById(R.id.radioButton2);
       weightText = (EditText) findViewById(R.id.editText1);
       resultText = (TextView) findViewById(R.id.textView4);
       sizeText  = (EditText) findViewById(R.id.editText2);
       calculateButton = (Button) findViewById(R.id.button1);
       razButton = (Button) findViewById(R.id.button2);
        
        
        calculateButton.setOnClickListener(compute);
        razButton.setOnClickListener(raz);
        
        
    }


    private OnClickListener raz = new View.OnClickListener() {
    	public void onClick(View v) {
    		String reboot = (String) getResources().getString(R.string.resultStandard);
    		weightText.setText("");
    		sizeText.setText("");
    		resultText.setText(reboot);
    	}
    	
    };
    private OnClickListener compute = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			float resultFloat = 0;
	        float weight = Float.valueOf(weightText.getText().toString());
	        float size = Float.valueOf(sizeText.getText().toString());
	        if(metre.isChecked()){
				resultFloat=(weight/(size*size));
	        }
	        else{
	        	resultFloat = (weight/((size/100)*(size/100)));
	        }
			resultText.setText(String.valueOf(resultFloat));
			
		}
    };
    
}
