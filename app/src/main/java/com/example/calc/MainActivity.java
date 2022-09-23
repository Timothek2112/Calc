package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button oneBtn;
    Button twoBtn;
    Button threeBtn;
    Button fourBtn;
    Button equals;
    Button fiveBtn;
    Button sixBtn;
    Button sevenBtn;
    Button eightBtn;
    Button nineBtn;
    Button nullBtn;
    Button plusBtn;
    Button decreaseBtn;
    Button stepenBtn;
    Button multiplyBtn;
    TextView result;
    String operator = "";
    Boolean _isOperatorPicked = false;
    Boolean _isFirstNumber = true;
    char pickedOperation;
    String calcStr = "";
    float leftNumber = 0;
    float rightNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneBtn = (Button) findViewById(R.id.onebtn);
        twoBtn = (Button) findViewById(R.id.twobtn);
        threeBtn = (Button) findViewById(R.id.threebtn);
        fourBtn = (Button) findViewById(R.id.fourbtn);
        fiveBtn = (Button) findViewById(R.id.fivebtn);
        sixBtn = (Button) findViewById(R.id.sixbtn);
        sevenBtn = (Button) findViewById(R.id.sevenbtn);
        eightBtn = (Button) findViewById(R.id.eightbtn);
        nineBtn = (Button) findViewById(R.id.ninebtn);
        nullBtn = (Button) findViewById(R.id.nullbtn);
        equals = (Button) findViewById(R.id.equals);
        plusBtn = (Button) findViewById(R.id.plusbtn);
        decreaseBtn = (Button) findViewById(R.id.decreasebtn);
        stepenBtn = (Button) findViewById(R.id.stepenbtn);
        multiplyBtn = (Button) findViewById(R.id.multiplybtn);
        result = (TextView) findViewById(R.id.result);
    }

    protected void OnlyNull(){
        if(_isFirstNumber){
            result.setText("");
            _isFirstNumber = false;
        }
    }

    public void On1Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "1";
            result.setText(result.getText()+ "1");
        }
    }
    public void On2Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "2";
            result.setText(result.getText()+ "2");
        }
    }
    public void On3Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "3";
            result.setText(result.getText()+ "3");
        }
    }
    public void On4Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "4";
            result.setText(result.getText()+ "4");
        }
    }
    public void On5Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "5";
            result.setText(result.getText()+ "5");
        }
    }
    public void On6Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "6";
            result.setText(result.getText()+ "6");
        }
    }
    public void On7Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "7";
            result.setText(result.getText()+ "7");
        }
    }
    public void On8Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "8";
            result.setText(result.getText()+ "8");
        }
    }
    public void On9Click(View view){
        OnlyNull();
        if(calcStr.length()<5) {
            calcStr += "9";
            result.setText(result.getText()+ "9");
        }
    }
    public void OnMultiplyClicked(View view){
        if(!_isOperatorPicked&&!_isFirstNumber) {
            leftNumber = Float.parseFloat(calcStr);
            calcStr += " * ";
            result.setText(calcStr);
            calcStr = "";
            _isOperatorPicked = true;
            operator = "multiply";
        }
    }

    public void OnEqualClicked(View view){
        if(_isOperatorPicked){
            rightNumber = Float.parseFloat(calcStr);
            switch (operator){
                case "multiply":
                    float res = leftNumber * rightNumber;
                    result.setText(Float.toString(res));
                    calcStr = "";
                    _isFirstNumber = true;
                    _isOperatorPicked = false;
                    break;
            }
        }
    }
}