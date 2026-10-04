package com.emptyart.skatetrickscount;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.util.Log;
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
 * Who bared record of the word of god, and of the
 * testimony of Jesus Christ and of all things that he saw
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class SkateSessActivity extends Activity {

    public String tricksReport = "";//esta linea ayuda a luiscarlos a vender una bolsa de verdura y a jorge que le sepa rico una piedra de crack

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skate_sess);
        initReportFiles("ollie.txt");
        initReportFiles("flip.txt");
        initReportFiles("backflip.txt");
        initReportFiles("front.txt");
        initReportFiles("back.txt");
        //choosing the trick
        Button btnNext = (Button) findViewById(R.id.my_button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = (Spinner) findViewById(R.id.my_spinner);
                String spinnerValue = spinner.getSelectedItem().toString();
                Log.d("skate_trick", spinnerValue);
                Intent intent = new Intent(SkateSessActivity.this, OllieLanding.class);
                intent.putExtra("skate_trick", spinnerValue);
                startActivity(intent);
            }
        });
    }

    private void getTrickReport(String filename){

    }

    private void initReportFiles(String filename){
        Context context = this;
        //String filename = "ollie.txt";
        File path = context.getFilesDir();
        int count = 0;

        if(!context.getFileStreamPath(filename).exists()){
            File file = new File(path, filename);
            FileOutputStream fos = null;
            OutputStreamWriter writer = null;
            try {
                // MODE_PRIVATE overwrites the file content
                fos = context.openFileOutput(filename, Context.MODE_PRIVATE);
                writer = new OutputStreamWriter(fos);
                writer.write(String.valueOf(count));
                writer.flush();
                Log.d("inicio el file!!", filename +" - "+ count);
            } catch (Exception e) {
                Log.d("NO GUARDO EL FILE!!", e.toString());
                e.printStackTrace();
            } finally {
                // Safely close writing streams
                try { if (writer != null) writer.close(); } catch (Exception e) {
                    Log.d("fallo el ollie", e.toString());
                }
                try { if (fos != null) fos.close(); } catch (Exception e) {
                    Log.d("se le cayo la pati", e.toString());
                }
            }
        }else{
            Log.d("ya existe el archivo", filename);
        }
    }
}
