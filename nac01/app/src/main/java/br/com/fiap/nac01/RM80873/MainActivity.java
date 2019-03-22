package br.com.fiap.nac01.RM80873;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto = findViewById(R.id.image);

    }

    int[] position = {R.drawable.p0, R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6};

    int i = 0;

    public void btnNext(View view) {

        if(i < 6 && i >=0 ) {
            foto.setImageResource(position[i + 1]);
            i++;
        }


    }


    public void btnPrevious(View view) {

        if (i > 0 ) {
            i--;
            foto.setImageResource(position[i]);
        }
    }


}




