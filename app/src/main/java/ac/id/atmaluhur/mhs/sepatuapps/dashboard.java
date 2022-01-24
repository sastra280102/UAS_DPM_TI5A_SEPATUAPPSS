package ac.id.atmaluhur.mhs.sepatuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
    ImageView imageView;
    ImageView sepatu12;
    ImageView sepatu13;
    ImageView keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageView = findViewById(R.id.imageView);
        sepatu12 = findViewById(R.id.sepatu12);
        sepatu13 = findViewById(R.id.sepatu13);
        keluar = findViewById(R.id.keluar);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this, SepatuCompassGazaleBlackWhite.class);
                startActivity(i);
            }
        });
        sepatu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this, sepatu_matcha_green_blue.class);
                startActivity(i);
            }
        });
        sepatu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this, sepatu_Compass_Retrograde_White.class);
                startActivity(i);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this, MainActivity.class);
                startActivity((i));
            }
        });
    }
}