package ac.id.atmaluhur.mhs.sepatuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sepatu_matcha_green_blue extends AppCompatActivity {

    ImageView back12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu_matcha_green_blue);

        back12 = findViewById(R.id.back12);

        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sepatu_matcha_green_blue.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}