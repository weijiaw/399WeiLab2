package phitlab.org.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    Button mMyCenterButton;
    Button mNewEventButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyCenterButton = (Button)findViewById(R.id.my_center);
        mMyCenterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyCenter.class));
            }
        });

        mNewEventButton = (Button)findViewById(R.id.new_event);
        mNewEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewEvent.class));
            }
        });

    }



//Create Intent in MainActivity ()
    /*public void onClick(View view){
        Intent myIntent = new Intent(this, MyCenter.class);

        final EditText myEditText = (EditText)findViewById(R.id.editText);
        String myString = myEditText.getText().toString();
        myIntent.putExtra("mainAactivityData", myString);
        startActivityForResult(myIntent);
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // make Home button work
    /*
    mHomeButton = (Button)findViewById(R.id.home);
    mHomeButton.setOnClikListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

        }
    })
    */




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
