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
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText weightText = null;
	TextView resultText = null;
	EditText sizeText = null;
	Button calculateButton = null;
	Button razButton = null;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       weightText = (EditText) findViewById(R.id.editText1);
       resultText = (TextView) findViewById(R.id.textView4);
       sizeText  = (EditText) findViewById(R.id.editText2);
       calculateButton = (Button) findViewById(R.id.button1);
       razButton = (Button) findViewById(R.id.button2);
        
        
        calculateButton.setOnClickListener(compute);
        
        
    }


    public void raz(){
    	
    }
    private OnClickListener compute = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			
	        float weight = Float.valueOf(weightText.getText().toString());
	        float size = Float.valueOf(sizeText.getText().toString());
			float resultFloat=(weight/(size*size));
			resultText.setText(String.valueOf(resultFloat));
			
		}
    };
    
}
