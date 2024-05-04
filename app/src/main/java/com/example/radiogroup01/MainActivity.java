package com.example.radiogroup01;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnChange;
    RadioButton rbRed, rbGreen, rbBlue, rbWhite;
    Switch swtch;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews()
    {
        btnChange = findViewById(R.id.btnChange);

        rbRed = findViewById(R.id.rbRed);
        rbGreen = findViewById(R.id.rbGreen);
        rbBlue = findViewById(R.id.rbBlue);
        rbWhite = findViewById(R.id.rbWhite);

        swtch = findViewById(R.id.swtch);
        LL = findViewById(R.id.main);
    }


    public void changeDodge(View view)
    {
        if (rbRed.isChecked())
            LL.setBackgroundColor (Color.RED);

        else if(rbGreen.isChecked())
            LL.setBackgroundColor (Color.GREEN);

        else if(rbBlue.isChecked())
            LL.setBackgroundColor (Color.BLUE);

        else
            LL.setBackgroundColor (Color.WHITE);
    }


    public void redDodge(View view)
    {
        if(swtch.isChecked())
        {
            LL.setBackgroundColor (Color.RED);
        }
    }

    public void greenDodge(View view)
    {
        if(swtch.isChecked())
        {
            LL.setBackgroundColor (Color.GREEN);
        }
    }

    public void blueDodge(View view)
    {
        if(swtch.isChecked())
        {
            LL.setBackgroundColor (Color.BLUE);
        }
    }

    public void whiteDodge(View view)
    {
        if(swtch.isChecked())
        {
            LL.setBackgroundColor (Color.WHITE);
        }
    }
}
