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


public class TeluguActivity extends ActionBarActivity {

    public static final String TSONGINDEX = "in.cetb.ekta.lyricsstudio.TeluguActivity.TSONGINDEX";
    static final String TSONGTITLE = "in.cetb.ekta.lyricsstudio.TeluguActivity.TSONGTITLE";
    static final String TSONGLYRICS = "in.cetb.ekta.lyricsstudio.TeluguActivity.TSONLYRICS";
    ListView lv;
    public ArrayList<String> SongTitleList;
    public ArrayList<String> SongLyricsList;
    public ArrayList<Integer> indexList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu);

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
                Intent intent = new Intent(TeluguActivity.this, TeluguSongActivity.class);
                intent.putExtra(TSONGINDEX, selectedSongIndex);
                intent.putExtra(TSONGTITLE, SongTitleList.get(selectedSongIndex));
                intent.putExtra(TSONGLYRICS, SongLyricsList.get(selectedSongIndex));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_telugu, menu);
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
        SongTitleList.add("Ittage Rechipodam -Anoop Rubens");
        SongLyricsList.add("Nela Bench mass ki\n" +
                "Balcony lo class ki\n" +
                "Item song-ye vachindante\n" +
                "Dance dance dance dance\n" +
                "Hero gari pakkana\n" +
                "Aade item papa ki\n" +
                "cheppalante chana mande\n" +
                "Fans fans fans fans\n" +
                "\n" +
                "Arey seetilu kodathare\n" +
                "Gallo paperllu jalluthare\n" +
                "Punakalu vachinattu pora gallu\n" +
                "Voogipora item song ante\n" +
                "\n" +
                "Hoy ittage rechipodam\n" +
                "Pilla ittage rechipodham\n" +
                "Ilage rechipodam\n" +
                "Pilla rojantha rechipodam\n" +
                "\n" +
                "Aa chumma chumma arey chumma\n" +
                "Ho chumma chumma lele chumma\n" +
                "Ho tama tama tama tantan tana\n" +
                "Ho aa linga linga ling\n" +
                "Aa linga linga ling\n" +
                "\n" +
                "Yaa ippatikinka ante\n" +
                "Arey Gutakalu Mingesthare\n" +
                "Le Le raja ante\n" +
                "lungile Eggedathare\n" +
                "Ringa ringa ante hall adhurse\n" +
                "Poovai poovai full whistle-ye\n" +
                "Vompu sompu leni bomma\n" +
                "Neeru leni chepa lekka\n" +
                "Gilla gilla kottukuntade\n" +
                "Arey ittage Arey ittage\n" +
                "Hoi ittage Rechipona\n" +
                "Ho ho ho ho hoi\n" +
                "\n" +
                "Ittage rechipodam\n" +
                "pilla ittage rechipodham\n" +
                "Ittage Rechipodam\n" +
                "Pilla Rojantha Rechipodam\n" +
                "\n" +
                "Yaa Jayamalini Jyothilakshmi\n" +
                "Anuradha Disco shanthi\n" +
                "Silk mumaith khan\n" +
                "Sari kothaga Sunny leone\n" +
                "Potti potti battale kattukosthe\n" +
                "kathi lanti figure step lesthe\n" +
                "kurrakaru gunde jallu\n" +
                "All shows house full\n" +
                "Junction lo pedda jathare\n" +
                "\n" +
                "Arey ittage Arey Ittage\n" +
                "Hoi ittage Rechipona\n" +
                "Ho ho ho ho hoi\n" +
                "\n" +
                "Ittage rechipodam\n" +
                "Pilla ittage rechipodham\n" +
                "Ittage rechipodam\n" +
                "Pilla rojantha rechipodam");

        indexList.add(1);
        SongTitleList.add("One More Time - Anoop Rubens");
        SongLyricsList.add("Ninnu chusi padipoya On the spot\n" +
                "\n" +
                "\n" +
                "Nannu nenu marchipoya on the spot\n" +
                "Ha ninnu chusi padipoya on the spot\n" +
                "Nannu nenu marchipoya on the spot\n" +
                "Magic yedi chesinattu on the spot\n" +
                "Nee matalaku padipoya on the spot\n" +
                "\n" +
                "Nanu em chesavo inthaki\n" +
                "Adi ardam kade enthaki\n" +
                "Na gunde patti\n" +
                "laagi laagi champesavu\n" +
                "Gilli gilli preminchesela\n" +
                "\n" +
                "Oooo one more time baby\n" +
                "One more time\n" +
                "Malli malli cheppu aamata\n" +
                "One more time\n" +
                "One more time baby\n" +
                "One more time\n" +
                "Malli malli cheppu aamata\n" +
                "One more time\n" +
                "Oh one more time\n" +
                "\n" +
                "On the spot\n" +
                "One more time\n" +
                "\n" +
                "Kalla thoti navve\n" +
                "Nannu gayaparichave\n" +
                "\n" +
                "Pedavi thoti saiga chesi\n" +
                "Nidra cheripave\n" +
                "\n" +
                "Madi ugesi uyyala\n" +
                "Neetho aadindi jampala\n" +
                "\n" +
                "Naku nanarakala\n" +
                "Nachave bala raaaaaa\n" +
                "\n" +
                "Ninnu chusi padipoya On the spot\n" +
                "Nannu nenu marchipoya on the spot\n" +
                "\n" +
                "Ahh ento emo edanu mottam mayachesave\n" +
                "Gundeloki gundu sudi-la guchukunnave\n" +
                "Naku isthava andhala Natho vasthava khandala\n" +
                "Nanu mithayi-laaga mingesi pora raaaaa\n" +
                "\n" +
                "Ha Ninnu chusi padipoya On the spot\n" +
                "Nannu nenu marchipoya on the spot\n" +
                "Magic yedi chesinattu on the spot\n" +
                "Nee matalaku padipoya on the spot\n" +
                "Nanu em chesavo inthaki\n" +
                "Adi ardam kade enthaki\n" +
                "Na gunde patti\n" +
                "laagi laagi champesavu\n" +
                "Gilli gilli preminchesela\n" +
                "\n" +
                "Oooo one more time baby\n" +
                "One more time\n" +
                "Malli malli cheppu aamata\n" +
                "One more time\n" +
                "One more time baby\n" +
                "One more time\n" +
                "Malli malli cheppu aamata\n" +
                "One more time\n" +
                "Oh one more time");

        indexList.add(2);
        SongTitleList.add("Devuda Devuda - Anoop Rubens ");
        SongLyricsList.add(
                "Devuda Devuda\n" +
                        "Devuda Devuda\n" +
                        "Devuda Devuda\n" +
                        "Devuda\n" +
                        "He Bhagavan\n" +
                        "Ne panikimalina yedava\n" +
                        "He bhagavan\n" +
                        "Ne cheyyani thappu ledeh\n" +
                        "Bhagavan\n" +
                        "\n" +
                        "Ho cheyyi jaripoyindi Mantagalisipoyindi\n" +
                        "Ee naa jeevitham Devudaa\n" +
                        "Devuda Devuda\n" +
                        "Ho Inkosari ivvava\n" +
                        "Na jeevithanni .. naa-kivvava\n" +
                        "Repairu Repairu.. Kar loonga (2 Times )\n" +
                        "O Devuda .. O devuda\n" +
                        "Devuda..\n" +
                        "O Devuda .. O devuda\n" +
                        "\n" +
                        "Ne thappu chesthe thittetodu\n" +
                        "Filtu pattu adigetodu\n" +
                        "Mundu yenaka lede\n" +
                        "yevadu devudaa\n" +
                        "ye dikkuleni vallaki\n" +
                        "Devudaa..\n" +
                        "Nuvvu pedda dikki kadara\n" +
                        "Devudaa..\n" +
                        "Ne addadaari thokkuthunte Peekodda\n" +
                        "Nannu Devuda Devuda Devuda Devuda\n" +
                        "Repairu Repairu.. Kar loonga (2 Times )\n" +
                        "\n" +
                        "Oh Devuda .. Devuda\n" +
                        "Deva deva Deva\n" +
                        "Deva deva Deva\n" +
                        "Oh devudaa\n" +
                        "O Deva Deva\n" +
                        "\n" +
                        "Oka Thappu jarigithe emavthado\n" +
                        "Enni bathukulu buggavthayo\n" +
                        "Neeku thappa inkevadiki Thelusura\n" +
                        "Devudaa..\n" +
                        "Mem devullam kadu kada\n" +
                        "Devudaa\n" +
                        "Mem burra thakkuva vallam\n" +
                        "Devudaa\n" +
                        "Nuvvu chusi kuda aapakunte thittodda\n" +
                        "Ninnu devuda Devuda Devuda Devudaaaaa\n" +
                        "Repairu Repairu.. Kar loonga (2 Times )\n" +
                        "\n" +
                        "Oh Devuda\n" +
                        "Oh Devudaaa\n" +
                        "Oh Devudaaa\n" +
                        "He Bhagavan\n");

        indexList.add(3);
        SongTitleList.add("Madana Mohana - Hari");
        SongLyricsList.add("Gaalitho venuve parichayam pondene hoo\n" +
                "Chinukutho pundamike senhame kudhirene hoo\n" +
                "\n" +
                "Madana Mohana madhava madhi virise madhuraa\n" +
                "Ee raadhane aardhinchaga modalee kathagaa\n" +
                "Madana Mohana madhava madhi virise madhuraa\n" +
                "Ee raadhane aardhinchaga modalee kathagaa\n" +
                "\n" +
                "Kalayike chelimay kalaike nijamaye\n" +
                "Krishna yamunaa thiramayee\n" +
                "Ruthuvule swaramulai swaramule eniminai\n" +
                "Krishna geethika paadenulee?\n" +
                "\n" +
                "Madana Mohana madhava madhi virise madhuraa\n" +
                "Ee raadhane aardhinchaga modalee kathagaa\n" +
                "\n" +
                "Palakarinchenu choopule parithapinchenu aashale\n" +
                "Tholakarinchina navvule vini tarinchenu gaalule\n" +
                "Kondagaalulalo?..panduvennelane?.\n" +
                "Vendi vaanalalo?unde pandugane\n" +
                "\n" +
                "Vale vale egasinaa kalavale kariginaa\n" +
                "Ninnu kalise samayaanaa\n" +
                "Ruthuvule swaramulai eniminai\n" +
                "Krishna geethika paadenulee?\n" +
                "\n" +
                "Manasilaa nee vasham cheyani kalavaram hoo\n" +
                "Eduruchoopul aaamani edurupadene premani\n" +
                "Yedaloyallo edagani edigi vochina tarunini\n" +
                "Alaala aavirile meghamaalayele\n" +
                "Kadathi chaarunile kadali chinukuvale\n" +
                "Kalavaram manasuke nincheni priyasakhe\n" +
                "Mohanudu ee radhikakee\n" +
                "Valapane korike telipeni tarake\n" +
                "Mohanudu ee radhikakee\n" +
                "\n" +
                "Madana Mohana madhava madhi virise madhuraa\n" +
                "Ee raadhane aardhinchaga modalee kathagaa?.\n" +
                "------------------------------------------\n" +
                "Arey Neeli neeli kalladana\n" +
                "malli malli ninnu chusthe manasu jarele\n" +
                "valu kalla vagulona chepalaga chindulesa\n" +
                "antha nachave\n" +
                "\n" +
                "oh ososi rakasi ilaga\n" +
                "tipinchukovadam\n" +
                "\n" +
                "oh ososi rakasi ilaga\n" +
                "tipinchukovadam\n" +
                "neekemaina bagunda\n" +
                "\n" +
                "na gundello dhinthanana dhinthanana\n" +
                "Nuv moginchav dhinthanana dhinthanana\n" +
                "nannu padagottav dhinthanana dhinthanana\n" +
                "nee maikamlo dinchesave niluvella\n" +
                "\n" +
                "na gundello dhinthanana dhinthanana\n" +
                "Nuv moginchav dhinthanana dhinthanana\n" +
                "\n" +
                "Arey dora jampandu laga\n" +
                "joru unna vayasulone love cheyale\n" +
                "Arey chethulloki chidathalochhi\n" +
                "face meeda mudatalosthe\n" +
                "evadu chustade\n" +
                "\n" +
                "Hey nikantu manasunte icheyave paddaka\n" +
                "natho velakolam endamma\n" +
                "preminchatam mottamodati purushalakshanam\n" +
                "chi kottadam aadavalla sahajalakshanam\n" +
                "em chesina kalasipovadam manch lakshanam\n" +
                "ika chustavante lovely lovey follow me\n" +
                "\n" +
                "na gundello dhinthanana dhinthanana\n" +
                "Nuv moginchav dhinthanana dhinthanana\n" +
                "\n" +
                "na gundello dhinthanana dhinthanana\n" +
                "Nuv moginchav dhinthanana dhinthanana\n" +
                "mathi pogatteve dhinthanana dhinthanana\n" +
                "nee maikamlo dinchesave niluvellass\n" +
                "Ne panikimalina yedava\n" +
                "He bhagavan");

        indexList.add(4);
        SongTitleList.add("Nandu I Love You- Mani Sharma ");
        SongLyricsList.add(
                "Nandu I love You Song lyrics\n" +
                        "\n" +
                        "Nandini i love you\n" +
                        "nandu nandu nandu\n" +
                        "nandu i love you antunnadi chandu\n" +
                        "My dear nandu i love you antunnadi chandu\n" +
                        "nuvve naa uhalanandu\n" +
                        "nuvve naa oopirinandu\n" +
                        "nuvve naa kannulanandu\n" +
                        "nuvve prati kadalikanandu\n" +
                        "nuvve naa devathavanta\n" +
                        "hrudayapu kovelanandu\n" +
                        "\n" +
                        "nandu i love you antunnadi chandu\n" +
                        "My dear nandu i love you antunnadi chandu\n" +
                        "\n" +
                        "nanne egarestunnave aanandapu anchulanandu\n" +
                        "nanne chuttesthunnave nee navvula ratnamnandu\n" +
                        "cheliya tholivekuva nuvve\n" +
                        "naa thalapula toorupunandu\n" +
                        "virise harivilluvu nuvve\n" +
                        "naa asala gaganamnandu\n" +
                        "niddaranandu melakuvanandu nuvve nandu\n" +
                        "nee cheyi vadalanu nenu ededu janmalanandu\n" +
                        "\n" +
                        "My dear nandu i love you antunnadi chandu\n" +
                        "nuvve naa uhalanandu\n" +
                        "nuvve naa oopirinandu\n" +
                        "nuvve naa kannulanandu\n" +
                        "nuvve prati kadalikanandu\n" +
                        "nuvve naa devathavanta\n" +
                        "hrudayapu kovelanandu\n" +
                        "\n" +
                        "nandu i love you antunnadi chandu\n" +
                        "My dear nandu i love you antunnadi chandu");
    }
}
