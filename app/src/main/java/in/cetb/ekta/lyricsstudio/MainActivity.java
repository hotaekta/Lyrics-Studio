package in.cetb.ekta.lyricsstudio;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToEnglishSongs(View view){
        Intent intent = new Intent(MainActivity.this, EnglishActivity.class);
        startActivity(intent);
    }

    public void goToHindiSongs(View view){
        Intent intent = new Intent(MainActivity.this, HindiActivity.class);
        startActivity(intent);
    }

    public void goToBengaliSongs(View view){
        Intent intent = new Intent(MainActivity.this, BengaliActivity.class);
        startActivity(intent);
    }

    public void goToTeluguSongs(View view){
        Intent intent = new Intent(MainActivity.this, TeluguActivity.class);
        startActivity(intent);
    }

    public void goToOdiaSongs(View view){
        Intent intent = new Intent(MainActivity.this, OdiaActivity.class);
        startActivity(intent);
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
