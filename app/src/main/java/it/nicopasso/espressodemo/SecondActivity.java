package it.nicopasso.espressodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by niccolo on 17/05/15.
 */
public class SecondActivity extends AppCompatActivity {

    private TextView mNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_layout);

        mNameText = (TextView) findViewById(R.id.name_text);

        Bundle bundle = new Bundle();


        String name = getIntent().getExtras().getString("person_name");
        mNameText.setText("Hello " + name);
    }
}
