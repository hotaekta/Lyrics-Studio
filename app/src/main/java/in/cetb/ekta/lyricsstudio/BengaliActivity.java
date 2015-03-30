package in.cetb.ekta.lyricsstudio;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BengaliActivity extends ActionBarActivity {

    public static final String BSONGINDEX = "in.cetb.ekta.lyricsstudio.BengaliActivity.BSONGINDEX";
    static final String BSONGTITLE = "in.cetb.ekta.lyricsstudio.BengaliActivity.BSONGTITLE";
    static final String BSONGLYRICS = "in.cetb.ekta.lyricsstudio.BengaliActivity.BSONGLYRICS";
    ListView lv;
    public ArrayList<String> SongTitleList;
    public ArrayList<String> SongLyricsList;
    public ArrayList<Integer> indexList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali);

        lv = (ListView) findViewById(R.id.listView);
        SongTitleList = new ArrayList<String>();
        SongLyricsList = new ArrayList<String>();
        indexList = new ArrayList<Integer>();
        getSongList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, SongTitleList);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Integer selectedSongIndex = indexList.get(position);
                Intent intent = new Intent(BengaliActivity.this, BengaliSongActivity.class);
                intent.putExtra(BSONGINDEX, selectedSongIndex);
                intent.putExtra(BSONGTITLE, SongTitleList.get(selectedSongIndex));
                intent.putExtra(BSONGLYRICS, SongLyricsList.get(selectedSongIndex));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bengali, menu);
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

    void getSongList() {
        indexList.add(0);
        SongTitleList.add("Mon Majhi Re - Boss - Arijit Singh");
        SongLyricsList.add("Mone Megh Jomte  Thake \n" +
                "POre jai durbipake \n" +
                "\n" +
                "Mone Megh Jomte  Thake \n" +
                "POre jai durbipake \n" +
                "\n" +
                "Chinta Te Tor,Katche Prohor\n" +
                "Santi  Nai  A jontro nar\n" +
                "\n" +
                "\n" +
                "\n" +
                "Mon MAjhi Re Bol na KOthai \n" +
                "Mon MAjhi Re Ai Phire Ai......(2)\n" +
                "\n" +
                "Ai Phire Ai .......(3)\n" +
                "\n" +
                "\n" +
                "Eka RAt Baka Chand\n" +
                "Lagnea Valo RE r....o.......\n" +
                "\n" +
                "\n" +
                "nai ROdh NAi Rong\n" +
                "jani nai KIchue KOrar .. o.......\n" +
                "\n" +
                "Eka RAt Baka Chand\n" +
                "Lagnea Valo... RE r\n" +
                "\n" +
                "nai ROdh NAi Rong\n" +
                "jani nai KIchue KOrar....\n" +
                "\n" +
                "\n" +
                "POrche Mone Mukher Adol\n" +
                "Vange Bukh  Vangche PAhar\n" +
                "Mon MAjhi Re Bol na KOthai \n" +
                "Mon MAjhi Re..Ai Phire Ai\n" +
                "\n" +
                "Ai Phire Ai,..(7)");
        indexList.add(1);
        SongTitleList.add("Je Kotha Na Bola - Boss");
        SongLyricsList.add("je kotha na bola se kotha aj suno\n" +
                "ja kichu sunabo aj bolini kokhono\n" +
                "\n" +
                "icche joto uria debo hotat domka huate\n" +
                "dossu hoa tara vangbe je pahara\n" +
                "jagabe tomai ratre\n" +
                "\n" +
                "bolo na bolo  sunte ki chau\n" +
                "bolo na bolo  sunte ki pau\n" +
                "bolo na bolo aj ke amai\n" +
                "\n" +
                "\n" +
                "icche joto uria debo hotat domka huate\n" +
                "dossu hoa tara vangbe je pahara\n" +
                "jagabe tomai ratre\n" +
                "\n" +
                "bolo na bolo  sunte ki chau\n" +
                "bolo na bolo  sunte ki pau\n" +
                "bolo na bolo aj ke amai\n" +
                "\n" +
                "\n" +
                "tomai ghire akarone amar ei paglami\n" +
                "bujhia dai jokhon tokhon bodle gechi ami\n" +
                "\n" +
                "\n" +
                "\n" +
                "tomai chule  sorire jure seuli puthe othe\n" +
                "valobasar mukto dana choale a thote\n" +
                "\n" +
                "buke vange bar.. bali vase dheau pichote amai vasao\n" +
                "\n" +
                "\n" +
                "icche joto uria debo hotat domka huate\n" +
                "dossu hoa tara vangbe je pahara\n" +
                "jagabe tomai rate\n" +
                "\n" +
                "bolo na bolo  sunte ki chau\n" +
                "bolo na bolo  sunte ki pau\n" +
                "bolo na bolo aj ke amai");
        indexList.add(2);
        SongTitleList.add("Bandhu chol - Open Tee Bioscope (2015) - Anupam Roy");
        SongLyricsList.add("Jol chobi, rongmoshal, school chhutir hojmira\n" +
                "Rupkothar paayrader golpo bol\n" +
                "Bandhu chol\n" +
                "Ramdhanu, jhaalmuri, half ticket, abbulish\n" +
                "Bitnoon ar churmurer golpo bol\n" +
                "Bandhu chol\n" +
                "Bandhu chol... roddure...\n" +
                "Mon kemon... maathjure...\n" +
                "Khelbo aaj oi ghaase\n" +
                "Tor team e tor paashe\n" +
                "\n" +
                "Futkorai, antenna, half chithi, half paddle\n" +
                "Aayna ar jolporir golpo bol\n" +
                "Bandhu chol...\n" +
                "Saap ludo, chitrohaar, loadshedding, shuktaara\n" +
                "Paanchshiker dukkhoder golpo bol\n" +
                "Bandhu chol...\n" +
                "Bandhu chol... Bol ta le..\n" +
                "Rakhbo haath tor kaandhe\n" +
                "Golpera oi ghashe\n" +
                "Tor team e tor paashe\n" +
                "\n" +
                "Bhaara kora cycle racegulo\n" +
                "Chutchhe back paase\n" +
                "Dhonwa dhonwa noukar chhaigulo\n" +
                "Urchhe ekpaashe\n" +
                "Bhaara kora cycle racegulo\n" +
                "Chutchhe back paase\n" +
                "Dhonwa dhonwa noukar chhaigulo\n" +
                "Urchhe ekpaashe\n" +
                "Khaali gaaye noukor chaaigulo\n" +
                "Urchhe ekpaashe\n" +
                "Cellophane e mure raangta ra\n" +
                "Sadakalo album e\n" +
                "Sondhyer aaratir saankh baaje\n" +
                "Bondhur daaknaame\n" +
                "Bandhu chol...\n" +
                "Bandhu chol... Bol ta le..\n" +
                "Rakhbo haath tor kaandhe\n" +
                "Golpera ei ghashe\n" +
                "Tor team e tor paashe\n" +
                "\n" +
                "Ta ra ra re..\n" +
                "Ta ra ra re..\n" +
                "Ta ra ra re..\n" +
                "Ta ra ra re..\n" +
                "Jol chobi, rongmoshal, school chhutir hojmira\n" +
                "Rupkothar paayrader golpo bol\n" +
                "Bandhu chol\n" +
                "Ramdhanu, jhaalmuri, half ticket, abbulish\n" +
                "Bitnoon ar churmurer golpo bol\n" +
                "Mmm hmmm hmmm...\n" +
                "Bandhu chol\n" +
                "Bandhu chol... Bol ta le..\n" +
                "Rakhbo haath tor kaandhe\n" +
                "Golpera oi ghashe\n" +
                "Tor team e tor paashe\n" +
                "[Chorus]\n" +
                "Jol chobi, rongmoshal, school chhutir hojmira\n" +
                "Rupkothar paayrader golpo bol\n" +
                "Bandhu chol\n" +
                "Ramdhanu, jhaalmuri, half ticket, abbulish\n" +
                "Bitnoon ar churmurer golpo bol\n" +
                "Bandhu chol\n" +
                "Bandhu chol... roddure...\n" +
                "Mon kemon... maathjure...\n" +
                "Khelbo aaj oi ghaase\n" +
                "Tor team e tor paashe\n" +
                "[/Chorus]\n" +
                "Mmm hmmm hmmm hmmm\n" +
                "Tor paashe\n" +
                "Mmm hmmm hmmm hmmm\n" +
                "Tor paashe");
    }
}
