package ac.id.atmaluhur.mhs.sepatuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SepatuCompassGazaleBlackWhite extends AppCompatActivity {

    ImageView back11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu_compass_gazale_black_white);

        back11 = findViewById(R.id.back11);

        back11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SepatuCompassGazaleBlackWhite.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}