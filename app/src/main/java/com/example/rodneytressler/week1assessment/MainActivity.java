package com.example.rodneytressler.week1assessment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;
    private TextView titleView;
    private EditText editView;
    private Button nextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.button_submit);
        titleView = findViewById(R.id.text_view);
        editView = findViewById(R.id.edit_text);
        nextPage = findViewById(R.id.next_button);
        buttonPressed();
        nextButtonPressed();
    }

    private void buttonPressed() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput =  editView.getText().toString();
                titleView.setText(textInput);
                editView.setText("");

            }
        });
    }
    private void nextButtonPressed() {
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context toastContext = getApplicationContext();
                CharSequence toastText = "Android is fun!";
                int toastDuration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(toastContext, toastText, toastDuration);
                toast.show();
                Intent nextPageAction = new Intent(MainActivity.this, SecondPageActivity.class);
                MainActivity.this.startActivity(nextPageAction);

            }
        });

    }
}
