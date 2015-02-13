package org.insbaixcamp.becat.classes;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.insbaixcamp.becat.R;

/**
 * Classe que recollira tots els clics de la nostra pantalla.
 */
public class MyOnClickListener extends ActionBarActivity implements View.OnClickListener {

    Button bResposta;
    String mensaje;

    public MyOnClickListener(Button bResposta, String mensaje){
        this.bResposta = bResposta;
    }

    @Override
    public void onClick(View v) {
        bResposta.setBackgroundColor(Color.RED);
    }
}
