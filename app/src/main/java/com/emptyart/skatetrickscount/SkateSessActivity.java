package com.emptyart.skatetrickscount;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.util.Log;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * Who bared record of the word of god, and of the
 * testimony of Jesus Christ and of all things that he saw
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class SkateSessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skate_sess);
        //choosing the trick
        Button btnNext = (Button) findViewById(R.id.my_button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = (Spinner) findViewById(R.id.my_spinner);
                String spinnerValue = spinner.getSelectedItem().toString();
                Log.d("skate_trick", spinnerValue);
                //Intent intent = new Intent(MainActivity.this, OllieLanding.class);
                //intent.putExtra("beach_code", spinnerValue);
                //startActivity(intent);
            }
        });
    }
}
