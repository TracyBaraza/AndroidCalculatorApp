package com.example.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editText3);
        EditText e2 = (EditText) findViewById(R.id.editText4);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int SUM = num1 + num2;
        TextView t1 = (TextView)findViewById(R.id.textView2);

        t1.setText(Integer.toString(SUM));
    }

    public void onButton2Click(View v) {
        EditText e3 = (EditText) findViewById(R.id.editText3);
        EditText e4 = (EditText) findViewById(R.id.editText4);
        TextView t1 = (TextView)findViewById(R.id.textView2);

        int number1 = Integer.parseInt(e3.getText().toString());
        int number2 = Integer.parseInt(e4.getText().toString());
        int MULTIPLY = number1 * number2;
        t1.setText(Integer.toString(MULTIPLY));
    }



    public void onButton3Click(View v) {
        EditText e5 = (EditText) findViewById(R.id.editText3);
        EditText e6 = (EditText) findViewById(R.id.editText4);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int numb1 = Integer.parseInt(e5.getText().toString());
        int numb2 = Integer.parseInt(e6.getText().toString());
        int SUBTRACT = numb1 - numb2;
        t1.setText(Integer.toString(SUBTRACT));
    }

        public void onButton4Click(View v){
            EditText e7 = (EditText) findViewById(R.id.editText3);
            EditText e8 = (EditText) findViewById(R.id.editText4);
            TextView t1 = (TextView)findViewById(R.id.textView2);
            int numbr1 = Integer.parseInt(e7.getText().toString());
            int numbr2 = Integer.parseInt(e8.getText().toString());
            int DIVIDE = numbr1 / numbr2;

            t1.setText(Integer.toString(DIVIDE));
        }




























    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
