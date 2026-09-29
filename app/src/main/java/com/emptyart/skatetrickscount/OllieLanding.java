package com.emptyart.skatetrickscount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            if(skateTrick=="Ollie"){
                try{
                    BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("ollie.text")));
                    
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(skateTrick=="Flip"){

            }
            if(skateTrick=="BackFlip"){

            }
            if(skateTrick=="FrontSide180"){

            }
            if(skateTrick=="BackSide180"){

            }
        }else{
            Log.d("error:", "invalid intent ..");
        }
    }

}
