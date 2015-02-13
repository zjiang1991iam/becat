package org.insbaixcamp.becat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.insbaixcamp.becat.classes.MyOnClickListener;


public class MainActivity extends ActionBarActivity {

    ImageView ivPregunta;
    TextView tvPregunta;
    Button bPregunta1;
    Button bPregunta2;
    Button bPregunta3;
    Button bPregunta4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPregunta = (ImageView) findViewById(R.id.ivPregunta);
        tvPregunta = (TextView) findViewById(R.id.tvPregunta);
        bPregunta1 = (Button) findViewById(R.id.bResposta1);
        bPregunta2 = (Button) findViewById(R.id.bResposta2);
        bPregunta3 = (Button) findViewById(R.id.bResposta3);
        bPregunta4 = (Button) findViewById(R.id.bResposta4);

        bPregunta1.setOnClickListener(new MyOnClickListener(bPregunta1,""));
        bPregunta2.setOnClickListener(new MyOnClickListener(bPregunta2,""));
        bPregunta3.setOnClickListener(new MyOnClickListener(bPregunta3,""));
        bPregunta4.setOnClickListener(new MyOnClickListener(bPregunta4,""));
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
