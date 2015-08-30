package com.firstapp.azad.myapplication12;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    String displayText="";
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(TextView)findViewById(R.id.result);

        Button oneButton = (Button) findViewById(R.id.one);
        Button twoButton = (Button) findViewById(R.id.two);
        Button threeButton = (Button) findViewById(R.id.three);
        Button fourButton = (Button) findViewById(R.id.four);
        Button fiveButton = (Button) findViewById(R.id.five);
        Button sixButton = (Button) findViewById(R.id.six);
        Button sevenButton = (Button) findViewById(R.id.seven);
        Button eightButton = (Button) findViewById(R.id.eight);
        Button nineButton = (Button) findViewById(R.id.nine);
        Button zeroButton = (Button) findViewById(R.id.zero);
        Button plusButton = (Button) findViewById(R.id.plus);
        Button equalButton = (Button) findViewById(R.id.equal);
        Button ceButton= (Button) findViewById(R.id.ce);
        Button eraseButton =(Button) findViewById(R.id.erase);

        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);
        ceButton.setOnClickListener(this);
        eraseButton.setOnClickListener(this);

    }
    public String removeLastChar(String s){return (s != null && s.length() != 0) ? s.substring(0, s.length()-1): s;}

    @Override
    public void onClick(View v) {
        int buttonid = v.getId();
        switch (buttonid){
            case R.id.one:
                displayText=displayText+"1";
                display.setText(displayText);
                break;
            case R.id.two:
                displayText=displayText+"2";
                display.setText(displayText);
                break;
            case R.id.three:
                displayText=displayText+"3";
                display.setText(displayText);
                break;
            case R.id.four:
                displayText=displayText+"4";
                display.setText(displayText);
                break;
            case R.id.five:
                displayText=displayText+"5";
                display.setText(displayText);
                break;
            case R.id.six:
                displayText=displayText+"6";
                display.setText(displayText);
                break;
            case R.id.seven:
                displayText=displayText+"7";
                display.setText(displayText);
                break;
            case R.id.eight:
                displayText=displayText+"8";
                display.setText(displayText);
                break;
            case R.id.nine:
                displayText=displayText+"9";
                display.setText(displayText);
                break;
            case R.id.zero:
                displayText=displayText+"0";
                display.setText(displayText);
                break;
            case R.id.plus:
                displayText=displayText+"+";
                display.setText(displayText);
                break;
            case R.id.equal:
                String[] numbers=displayText.split("\\+");
                int sum=0;
                for(int i=0;i<numbers.length;i++){
                    int num=Integer.parseInt(numbers[i]);
                    sum=sum+num;
                    display.setText(sum+"");
                }

                break;
            case R.id.erase:
                String str=displayText.toString();
                if(displayText.length()>0)
                {
                    String x =str.substring(0, str.length() - 1);
                    display.setText(x);

                }




                //displayText="";
               // display.setText("");
                //display.setText(displayText);
                break;
            case R.id.ce:
                displayText="";
                display.setText("");
                break;

        }

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
