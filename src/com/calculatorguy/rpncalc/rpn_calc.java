package com.calculatorguy.rpncalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class rpn_calc extends Activity {
	String[] mStringTable = {
		"9","8","7","Ö","sin","6","5","4","x","cos","3","2","1","+","tan","±","0",".","=","sqrt"	
	};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        ((GridView)findViewById(R.id.GridView01)).setAdapter(new ButtonAdapter());
    }
    
    public void onResume() {
    	
    }
    
    class ButtonAdapter extends BaseAdapter implements OnClickListener {

		public int getCount() {
			// TODO Auto-generated method stub
			return mStringTable.length;
		}

		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return mStringTable[position];
		}

		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			Button b = null;
			if (convertView == null) {
				b = (Button) getLayoutInflater().inflate(R.layout.calc_button, null);
				b.setOnClickListener(this);
				
				//b.setBackgroundColor(R.color.button_colors);
			} else {
				b = (Button)convertView;
			}
			
			b.setText(mStringTable[position]);
			b.setClickable(true);
			
			return b;
		}

		public void onClick(View v) {
			Button b = (Button)v;
			Log.i("rpn_calc","pressed "+b.getText());
			((TextView)rpn_calc.this.findViewById(R.id.textView1)).setText(b.getText());
		}
    	
    }
}