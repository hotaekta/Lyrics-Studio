package in.cetb.ekta.lyricsstudio;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EnglishSongActivity extends ActionBarActivity {

    Integer songIndex;
    String songTitle,songLyrics;
    TextView tvTitle, tvLyrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_song);

        Intent intent = getIntent();
        songIndex = intent.getIntExtra(EnglishActivity.ESONGINDEX,1);
        songTitle = intent.getStringExtra(EnglishActivity.ESONGTITLE);
        songLyrics = intent.getStringExtra(EnglishActivity.ESONGLYRICS);

        tvTitle = (TextView) findViewById(R.id.textViewtitle);
        tvLyrics = (TextView) findViewById(R.id.textViewlyrics);

        tvTitle.setText(songTitle.toString());
        tvLyrics.setText(songLyrics.toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english_song, menu);
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
