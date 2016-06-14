package com.example.pc.myapplication;

package com.example.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
//
public class MainActivity extends Activity {
    double tet = 0;// 현재 값
    double i = 0;
    double j = 0;
    String temp="";//기호저장
    String tada="";//숫자저장(출력용)
    String tada2="";//숫자저장 2
    int indexof;
    Boolean B;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(mClickListener);
        findViewById(R.id.button2).setOnClickListener(mClickListener);
        findViewById(R.id.button3).setOnClickListener(mClickListener);
        findViewById(R.id.button4).setOnClickListener(mClickListener);
        findViewById(R.id.button5).setOnClickListener(mClickListener);
        findViewById(R.id.button6).setOnClickListener(mClickListener);
        findViewById(R.id.button7).setOnClickListener(mClickListener);
        findViewById(R.id.button8).setOnClickListener(mClickListener);
        findViewById(R.id.button9).setOnClickListener(mClickListener);
        findViewById(R.id.button10).setOnClickListener(mClickListener);
        findViewById(R.id.button11).setOnClickListener(mClickListener);
        findViewById(R.id.button12).setOnClickListener(mClickListener);
        findViewById(R.id.button13).setOnClickListener(mClickListener);
        findViewById(R.id.button14).setOnClickListener(mClickListener);
        findViewById(R.id.button15).setOnClickListener(mClickListener);
        findViewById(R.id.button16).setOnClickListener(mClickListener);
        findViewById(R.id.button17).setOnClickListener(mClickListener);
        findViewById(R.id.b).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            TextView text = (TextView) findViewById(R.id.textView);
            switch (v.getId()) {
                case R.id.button://C(있는 값을 지움)
                    tada = "";
                    tada2 = "";
                    temp = "";
                    text.setText("0");
                    Log.d("n", "c");
                    break;
                case R.id.button2://   /(나누기)
                    if(tada.substring(tada.length()-1, tada.length())==".")
                        break;
                    else if (tada2 == "") {
                        temp = "/";
                        text.setText(tada + temp);
                    } else {
                        i = Double.parseDouble(tada);
                        j = Double.parseDouble(tada2);
                        if (temp == "/")
                            tada = Double.toString((i / j));
                        else if (temp == "+")
                            tada = Double.toString((i + j));
                        else if (temp == "-")
                            tada = Double.toString((i - j));
                        else if (temp == "*")
                            tada = Double.toString((i * j));

                        temp = "/";
                        tada2 = "";
                        text.setText(tada + temp);
                    }
                    break;
                case R.id.button3://*
                    if(tada.substring(tada.length()-1, tada.length())==".")
                        break;
                    else if (tada2 == "") {
                        temp = "*";
                        text.setText(tada + temp);
                    } else {
                        i = Double.parseDouble(tada);
                        j = Double.parseDouble(tada2);
                        if (temp == "/")
                            tada = Double.toString((i / j));
                        else if (temp == "+")
                            tada = Double.toString((i + j));
                        else if (temp == "-")
                            tada = Double.toString((i - j));
                        else if (temp == "*")
                            tada = Double.toString((i * j));

                        temp = "*";
                        tada2 = "";
                        text.setText(tada + temp);
                    }
                    break;
                case R.id.button4://-
                    if(tada.substring(tada.length()-1, tada.length())==".")
                        break;
                    else if (tada2 == "") {
                        temp = "-";
                        text.setText(tada + temp);
                    } else {
                        i = Double.parseDouble(tada);
                        j = Double.parseDouble(tada2);
                        if (temp == "/")
                            tada = Double.toString((i / j));
                        else if (temp == "+")
                            tada = Double.toString((i + j));
                        else if (temp == "-")
                            tada = Double.toString((i - j));
                        else if (temp == "*")
                            tada = Double.toString((i * j));

                        temp = "-";
                        tada2 = "";
                        text.setText(tada + temp);
                    }
                    break;
                case R.id.button5://7
                    if (temp == "") {
                        tada += "7";
                        text.setText(tada);
                    } else {
                        tada2 += "7";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "7");
                    break;
                case R.id.button6://8
                    if (temp == "") {
                        tada += "8";
                        text.setText(tada);
                    } else {
                        tada2 += "8";
                        text.setText(tada + temp + tada2);
                    }
                    text.setText(tada + temp + tada2);
                    Log.d("n", "8");
                    break;
                case R.id.button7://9
                    if (temp == "") {
                        tada += "9";
                        text.setText(tada);
                    } else {
                        tada2 += "9";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "9");
                    break;
                case R.id.button8://+
                    if(tada.substring(tada.length()-1, tada.length())==".")
                        break;
                    else if (tada2 == "") {
                        temp = "+";
                        text.setText(tada + temp);
                    } else {
                        i = Double.parseDouble(tada);
                        j = Double.parseDouble(tada2);
                        if (temp == "/")
                            tada = Double.toString((i / j));
                        else if (temp == "+")
                            tada = Double.toString((i + j));
                        else if (temp == "-")
                            tada = Double.toString((i - j));
                        else if (temp == "*")
                            tada = Double.toString((i * j));

                        temp = "+";
                        tada2 = "";
                        text.setText(tada + temp);
                    }
                    Log.d("n", "+");
                    break;
                case R.id.button9://4
                    if (temp == "") {
                        tada += "4";
                        text.setText(tada);
                    } else {
                        tada2 += "4";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "4");
                    break;
                case R.id.button10://5
                    if (temp == "") {
                        tada += "5";
                        text.setText(tada);
                    } else {
                        tada2 += "5";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "5");
                    break;
                case R.id.button11://6
                    if (temp == "") {
                        tada += "6";
                        text.setText(tada);
                    } else {
                        tada2 += "6";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "6");
                    break;
                case R.id.button12://1
                    if (temp == "") {
                        tada += "1";
                        text.setText(tada);
                    } else {
                        tada2 += "1";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "1");
                    break;
                case R.id.button13://2
                    if (temp == "") {
                        tada += "2";
                        text.setText(tada);
                    } else {
                        tada2 += "2";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "2");
                    break;
                case R.id.button14://3
                    if (temp == "") {
                        tada += "3";
                        text.setText(tada);
                    } else {
                        tada2 += "3";
                        text.setText(tada + temp + tada2);
                    }
                    Log.d("n", "3");
                    break;
                case R.id.button15://=(결과구하기)
                    if(tada2==""){
                        break;
                    }
                    i = Double.parseDouble(tada);
                    j = Double.parseDouble(tada2);
                    if (temp == "/") {
                        tada = Double.toString((i / j));
                    } else if (temp == "+") {

                        tada = Double.toString((i + j));
                    } else if (temp == "-") {

                        tada = Double.toString((i - j));
                    } else if (temp == "*") {

                        tada = Double.toString((i * j));
                    }
                    temp = "";
                    tada2 = "";
                    text.setText(tada);
                    break;
                case R.id.button16://0
                    if (temp == "") {
                        B = tada.startsWith("0");
                        if(B=false) {
                            if (tada == "") {
                                break;
                            } else {
                                tada += "0";
                                text.setText(tada);
                            }
                            Log.d("n", "0");
                            break;
                        }
                    } else {
                        B = tada2.startsWith("0");
                        if (B = false) {
                            if (tada2 == "") {
                                break;
                            } else {
                                tada2 += "0";
                                text.setText(tada + temp + tada2);
                            }
                            Log.d("n", "0");
                            break;
                        }
                    }
                case R.id.button17://.(점)
                    Boolean c;
                    if (temp == "") {
                        c = tada.contains(".");
                        if (c == true)
                            break;
                        else {
                            if (tada == "")
                                tada += "0.";
                            else
                                tada += ".";
                        }
                    } else {
                        c = tada2.contains(".");
                        if (c == true)
                            break;
                        else {
                            if (tada2 == "")
                                tada2 += "0.";
                            else
                                tada2 += ".";
                        }
                    }
                    text.setText(tada + temp + tada2);
                    break;
                case R.id.b://제거
                    if(tada==""||tada==null||tada.length()==0){
                        tada="";
                        text.setText("0");
                        break;}

                    if (tada2 == "") {
                        if (temp == "") {
                            tada = tada.substring(0, tada.length() - 1);
                            if(tada==""||tada==null||tada.length()==0){
                                tada="";
                                text.setText("0");
                                break;
                            }
                            text.setText(tada);
                        }else
                            temp = "";
                        text.setText(tada);
                    }
                    else{
                        tada2=tada2.substring(0, tada2.length()-1);
                        text.setText(tada+temp+tada2);
                    }
                    break;
            }
        }
    };
}
