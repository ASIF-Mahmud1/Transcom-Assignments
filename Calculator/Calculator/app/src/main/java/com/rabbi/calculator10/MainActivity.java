package com.rabbi.calculator10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEq, btnAdd, btnSub, btnMul, btnDiv, btnC, btnDot;
    TextView display;

    String op;
    Float result;
    //boolean opClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnEq = findViewById(R.id.btnEq);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnC = findViewById(R.id.btnC);
        btnDot = findViewById(R.id.btnDot);
        display = findViewById(R.id.lblDisplay);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display.setText(display.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "0");
            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "+";
                result = Float.parseFloat(display.getText() + "");
                display.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "-";
                result = Float.parseFloat(display.getText() + "");
                display.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "*";
                result = Float.parseFloat(display.getText() + "");
                display.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "/";
                result = Float.parseFloat(display.getText() + "");
                display.setText(null);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "";
                result = 0f;
                display.setText(null);

            }
        });


        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op == "+"){
                    result = result + Float.parseFloat(display.getText() + "");
                    display.setText(result+"");
                }

                else if(op == "-"){
                    result = result - Float.parseFloat(display.getText() + "");
                    display.setText(result+"");
                }

                else if(op == "*"){
                    result = result * Float.parseFloat(display.getText() + "");
                    display.setText(result+"");
                }

                else if(op == "/"){
                    result = result / Float.parseFloat(display.getText() + "");
                    display.setText(result+"");
                }

                else {

                }
            }
        });


    }
}
