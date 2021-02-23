package com.example.task04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CustomDialog.CustomDialogListener{
    private TextView textView_UserName;
    private TextView textView_Password;
    private Button button_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_UserName = findViewById(R.id.text_username);
        textView_Password = findViewById(R.id.text_password);
        button_dialog = findViewById(R.id.button_dialog);
        button_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomDialog();
            }
        });
    }

    public void openCustomDialog(){
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(getSupportFragmentManager(), "Custom Dialog");
    }

    @Override
    public void sendText(String username, String password) {
        textView_UserName.setText(username);
        textView_Password.setText(password);
    }
}