package com.example.lelin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double fn;
    double sn;
    String operator;

    EditText edtText;
    Button btnBack;
    Button btnClear;
    Button btnPlus;
    Button btnMinus;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnMul;
    Button btnDiv;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnClose;
    Button btnEqual;
    Button btnDot;
    Button btnPlusEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.edtInput);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClose = (Button)findViewById(R.id.btnClose);
        btnDiv = (Button) findViewById(R.id.btnDivision);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);

        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine = (Button)findViewById(R.id.btn9);
        btnZero = (Button) findViewById(R.id.btn0);
        btnMul = (Button) findViewById(R.id.btnMulti);
        btnOne = (Button)findViewById(R.id.btn1);

        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button)findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnEqual = (Button)findViewById(R.id.btnEqual);

        btnDot = (Button) findViewById(R.id.btnDot);
        btnPlusEqual = (Button)findViewById(R.id.btnPlusEqual);

        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClose.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);


        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnPlusEqual.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        String string = edtText.getText().toString();
        switch (v.getId()){
            case R.id.btn0 :
                edtText.setText(string + btnZero.getText());
                break;

            case R.id.btn1 :
                edtText.setText(string + btnOne .getText());
                break;
            case R.id.btn2 :
                edtText.setText(string + btnTwo .getText());
                break;
            case R.id.btn3 :
                edtText.setText(string + btnThree .getText());
                break;
            case R.id.btn4 :
                edtText.setText(string +btnFour .getText());
                break;
            case R.id.btn5 :
                edtText.setText(string + btnFive .getText());
                break;
            case R.id.btn6 :
                edtText.setText(string + btnSix .getText());
                break;
            case R.id.btn7 :
                edtText.setText(string +btnSeven .getText());
                break;


            case R.id.btn8 :
                edtText.setText(string + btnEight .getText());
                break;
            case R.id.btn9 :
                edtText.setText(string +btnNine .getText());
                break;

            case R.id.btnDot:
                edtText.setText(string + btnDot.getText());

                break;
            case R.id.btnClear :
                edtText.setText("");
                break;
            case R.id.btnBack:
                StringBuilder stb = new StringBuilder(string);
                stb.deleteCharAt(string.length() -1);
                edtText.setText(stb.toString());
                break;

            case R.id.btnPlus:
                operator ="+";
                fn = Double.parseDouble(edtText.getText().toString());
                edtText.setText("");
                break;

            case R.id.btnMinus:
                operator ="-";
                fn = Double.parseDouble(edtText.getText().toString());
                edtText.setText("");
                break;

            case R.id.btnDivision:
                operator ="÷";
                fn = Double.parseDouble(edtText.getText().toString());
                edtText.setText("");
                break;

            case R.id.btnMulti:
                operator ="×";
                fn = Double.parseDouble(edtText.getText().toString());
                edtText.setText("");
                break;

            case R.id.btnPlusEqual:
                edtText.setText(Double.parseDouble(edtText.getText().toString()) * (-1) + "");
                break;
            case R.id.btnEqual:
                sn = Double.parseDouble(edtText.getText().toString());
                double result=0;

                switch (operator){
                    case "+":
                        result = fn + sn;
                        break;

                    case "-":
                        result = fn - sn;
                        break;

                    case "×":
                        result = fn * sn;
                        break;

                    case "÷":
                        result = fn / sn;
                        break;


                }

                edtText.setText(result+"");

                 break;
            case R.id.btnClose:
                finish();

                break;


        }
    }
}
