package ac.id.atmaluhur.mhs.sepatuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sepatu_Compass_Retrograde_White extends AppCompatActivity {

    ImageView back13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu_compass_retrograde_white);

        back13 = findViewById(R.id.back13);

        back13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sepatu_Compass_Retrograde_White.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}