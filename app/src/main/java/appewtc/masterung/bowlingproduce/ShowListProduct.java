package appewtc.masterung.bowlingproduce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ShowListProduct extends AppCompatActivity {

    //Explicit
    private String categoryString;
    private TextView textView;
    private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_product);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView8);
        listView = (ListView) findViewById(R.id.listView);
        button = (Button) findViewById(R.id.button);

        //Get Value from Intent
        categoryString = getIntent().getStringExtra("Category");

        //Show Text
        textView.setText(categoryString);

    }   // Main Method

}   // Main Class
