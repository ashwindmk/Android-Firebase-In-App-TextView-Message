package com.example.ashwin.firebaseinappmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message = "No new messages";
    private TextView mTextViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewMessage = (TextView) findViewById(R.id.textViewMessage);

        if(getIntent().hasExtra("message"))
        {
            message = getIntent().getExtras().getString("message");
        }

        mTextViewMessage.setText(message);

    }
}
