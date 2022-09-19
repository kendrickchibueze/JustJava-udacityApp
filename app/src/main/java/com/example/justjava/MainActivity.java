package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView num = findViewById(R.id.quantity_text_view);
        TextView priceTextView = findViewById(R.id.price_text_view);
        Button order1 = findViewById(R.id.order);
        Button check1 = findViewById(R.id.btn1);
        Button check2 = findViewById(R.id.btn2);

        check1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                increment();


            }
               public void increment(){
                quantity =quantity+1;
                display(quantity);


            }

            private void display(int number) {
                //  TextView quantity = (TextView) findViewById(R.id.quantity);
                num.setText("" + number);
            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement();

            }

            public void decrement(){
                quantity =quantity-1;
                display(quantity);

            }
            private void display(int number) {
                //  TextView quantity = (TextView) findViewById(R.id.quantity);
                num.setText("" + number);
            }
        });


        order1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price = quantity* 5;
                String priceMessage = "Total :  $" + price;
                priceMessage = priceMessage + "\nThank you";
                displayMessage(priceMessage);


            }



            /**
             * This method displays the given quantity value on the screen.
             */
            private void display1(int number) {
                //  TextView quantity = (TextView) findViewById(R.id.quantity);
                num.setText("" + number);
            }

            /**
             * This method displays the given price on the screen.
             */
            private void displayPrice(int number) {
                //TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
                priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
            }

            /**
             * This method displays the given text on the screen.
             */
            private void displayMessage(String message) {
                TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
                priceTextView.setText(message);
            }


        });
    }
}