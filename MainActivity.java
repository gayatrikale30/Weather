package com.example.temperature_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    private EditText text;
    //4View view;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editText);
    }


    /* this method is called when user clicks the button and is handled
    because we assigned the name to the "OnClick property" of the
    button */
    public void onClick(View view) {
        if(view.getId()==R.id.button) {

                RadioButton celsiusButton =
                        findViewById(R.id.radioButton);
                RadioButton fahrenheitButton =
                        findViewById(R.id.radioButton2);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue =
                        Float.parseFloat(text.getText().toString());
                if (celsiusButton.isChecked()) {
                    text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }
                else {
                    text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                }
            inputValue = Float.parseFloat(text.getText().toString());
                view = findViewById(R.id.activity_main);
            iv= findViewById(R.id.imageView);

            if (inputValue>90){

                view.setBackgroundColor(Color.YELLOW);
                iv.setVisibility(View.VISIBLE);
                //clear any prior image
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(0);
                iv.setImageResource(R.drawable.sun);  //show sun on image
                    }

                else{
                    view.setBackgroundColor(Color.parseColor("#87ceff"));
                iv.setVisibility(View.VISIBLE);
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(0);
                iv.setImageResource(R.drawable.frost_jpg);  //show sun on image
                     }

            }
    }}




