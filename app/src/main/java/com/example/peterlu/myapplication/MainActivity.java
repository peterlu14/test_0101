package com.example.peterlu.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity {

    OnClickListener listenerx = null;
    Button button1x;
    private Button button01;
    private TextView textView01;
    private String temp = "";
    private int finish = 0;

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView01 = (TextView)findViewById(R.id.text);

        button01 = (Button)findViewById(R.id.one);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "1";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.two);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "2";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.three);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "3";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.four);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "4";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.five);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "5";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.six);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "6";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.seven);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0 )
                {
                    temp = (String) textView01.getText();
                    temp = temp + "7";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.eight);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "8";
                    textView01.setText(temp);
                }

                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.nine);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "9";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.zero);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "0";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.add);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "+";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.minus);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "-";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.mul);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "*";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.divide);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + "/";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.point);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(finish == 0)
                {
                    temp = (String) textView01.getText();
                    temp = temp + ".";
                    textView01.setText(temp);
                }
                else
                {
                    textView01.setText(null);
                    finish = 0;
                }
            }

        });
        button01 = (Button)findViewById(R.id.equal);
        button01.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Parser a = new Parser();
                double answer = 0;
                try {
                    answer = a.evaluate(temp);
                } catch (ParserException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                String temp = "";
                textView01.setText(Double.toString(answer));
                finish = 1;
            }

        });
    }

}
