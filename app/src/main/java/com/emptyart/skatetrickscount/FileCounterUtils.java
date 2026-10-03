package com.emptyart.skatetrickscount;

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
 * I am Alpha and Omega, the beginning and the ending,
 * saith the Lord, which is, and which was,
 * and which is to come, the Almighty
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class FileCounterUtils {

    public static void incrementFileCounter(Context context, String filename) {
        int count = 0;
        FileInputStream fis = null;
        BufferedReader reader = null;

        // 1. Read the current integer from the file
        try {

            //String path = Environment.getExternalStorageDirectory().getPath()
            File path = context.getFilesDir();
            Log.d("tricks files path",path.toString());
            //check if file exist or init file with 0 value
            if(!context.getFileStreamPath(filename).exists()){
                File file = new File(path, filename);
            } else {
                // Open the file from internal storage
                fis = context.openFileInput(filename);
                reader = new BufferedReader(new InputStreamReader(fis));
                String line = reader.readLine();

                if (line != null) {
                    // Parse the string to an integer
                    count = Integer.parseInt(line.trim());
                    Log.d("TRICK Contando", filename +" - "+ count);
                }
            }

        } catch (Exception e) {
            // If file doesn't exist or is empty, count remains 0
            e.printStackTrace();
        } finally {
            // Safely close reading streams (Required for Java 6 / Android 2.3)
            try { if (reader != null) reader.close(); } catch (Exception e) {
                Log.d("se le cayo la pati", e.toString());
            }
            try { if (fis != null) fis.close(); } catch (Exception e) {
                Log.d("pifio el flip", e.toString());
            }
        }

        // 2. Increment the number
        count++;

        // 3. Write the incremented integer back to the file
        FileOutputStream fos = null;
        OutputStreamWriter writer = null;
        try {
            // MODE_PRIVATE overwrites the file content
            fos = context.openFileOutput(filename, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(fos);
            writer.write(String.valueOf(count));
            writer.flush();
            Log.d("CONTO EL TRICK!!", filename +" - "+ count);
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
    }
}
