package com.example.fileoperationlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_NAME = "lesson.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.inputButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // TODO こちらにinputEditTextの文字列をファイル書き込みするコードを入れます。

                    Toast.makeText(getApplicationContext(), "ファイルに書き込みました", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "エラーです", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.resultButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    // TODO こちらにファイルを読み込み、resultTextViewにファイル内の文字列を出すコードを入れます。

                    Toast.makeText(getApplicationContext(), "ファイルを読み込みました", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "エラーです", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.deleteButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO こちらにファイルを削除するコードを書きます

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
