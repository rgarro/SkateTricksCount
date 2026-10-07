package com.emptyart.skatetrickscount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import android.content.Intent;
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
 * Worthy is the Lamb that was slain to receive power,
 * and riches, and wisdom, and strength,
 * and honour, and glory, and blessing
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class OllieLanding extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ollie_landing);

        String skateTrick = "";
        if (getIntent() != null) {
            skateTrick = getIntent().getStringExtra("skate_trick");
            Log.d("truco skate", skateTrick);
            Log.d("HERE", "we go! ..");
            Context context = this;
            if(skateTrick=="Ollie"){
                FileCounterUtils.incrementFileCounter(context,"ollie.txt");
            }
            if(skateTrick=="Flip"){
                FileCounterUtils.incrementFileCounter(context,"flip.txt");
            }
            if(skateTrick=="BackFlip"){
                FileCounterUtils.incrementFileCounter(context,"backflip.txt");
            }
            if(skateTrick=="FrontSide180"){
                FileCounterUtils.incrementFileCounter(context,"front.txt");
            }
            if(skateTrick=="BackSide180"){
                FileCounterUtils.incrementFileCounter(context,"back.txt");
            }
            //redirecciona a main , tricks report debe ser frangment
            Intent intent = new Intent(OllieLanding.this,SkateSessActivity.class);
            //intent.putExtra("skate_trick", spinnerValue);
            startActivity(intent);
        }else{
            Log.d("error:", "invalid intent ..");
        }
    }

}
