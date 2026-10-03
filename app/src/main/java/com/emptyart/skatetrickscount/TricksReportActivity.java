package com.emptyart.skatetrickscount;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import android.util.Log;
import java.io.File;
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
public class TricksReportActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricks_report);
        getReport();
    }

    private void getReport(){
        Log.d("error:", "invalid intent ..");
    }

}
