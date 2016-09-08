package appewtc.masterung.bowlingproduce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, descripTextView, priceTextView;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        titleTextView = (TextView) findViewById(R.id.textView9);
        descripTextView = (TextView) findViewById(R.id.textView11);
        priceTextView = (TextView) findViewById(R.id.textView10);
        imageView = (ImageView) findViewById(R.id.imageView6);
        button = (Button) findViewById(R.id.button2);

        //Show Text
        titleTextView.setText(getIntent().getStringExtra("Title"));
        descripTextView.setText(getIntent().getStringExtra("Descrip"));
        priceTextView.setText(getIntent().getStringExtra("Price"));

        //Show Image
        Picasso.with(this)
                .load(getIntent().getStringExtra("Icon"))
                .resize(150, 180).into(imageView);

        //Button Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }   // Main Method

}   // Main Class
