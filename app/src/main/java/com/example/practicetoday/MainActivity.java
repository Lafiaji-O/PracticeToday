package com.example.practicetoday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public void convertButton (View view) {

      ImageView imageView = (ImageView) findViewById(R.id.imageView);
      imageView.setImageResource(R.drawable.cat);

      EditText nameText = (EditText) findViewById(R.id.nameText);
      EditText amountText = (EditText) findViewById(R.id.amountText);

      Double amount = Double.parseDouble(amountText.getText().toString());

      Double convert = amount * 0.85 ;

      Toast.makeText(MainActivity.this, "Hi " + nameText.getText().toString()
              + ", your amount in dollars is $" + String.format("%.2f", convert), Toast.LENGTH_LONG).show();

  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
