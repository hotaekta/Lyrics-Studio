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


public class OdiaActivity extends ActionBarActivity {

    public static final String OSONGINDEX = "in.cetb.ekta.lyricsstudio.OdiaActivity.OSONGINDEX";
    static final String OSONGTITLE = "in.cetb.ekta.lyricsstudio.OdiaActivity.OSONGTITLE";
    static final String OSONGLYRICS = "in.cetb.ekta.lyricsstudio.OdiaActivity.OSONGLYRICS";
    ListView lv;
    public ArrayList<String> SongTitleList;
    public ArrayList<String> SongLyricsList;
    public ArrayList<Integer> indexList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odia);

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
                Intent intent = new Intent(OdiaActivity.this, OdiaSongActivity.class);
                intent.putExtra(OSONGINDEX, selectedSongIndex);
                intent.putExtra(OSONGTITLE, SongTitleList.get(selectedSongIndex));
                intent.putExtra(OSONGLYRICS, SongLyricsList.get(selectedSongIndex));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_odia, menu);
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

    void getSongList(){
        indexList.add(0);
        SongTitleList.add("ishq tu hi tu - abhijeet majumdar ");
        SongLyricsList.add(
                "male ? Han jeba ishq hata thari dakiba \n " +
                        " Se jhadaku ke bhala rokiba (2) \n" +
                        " Maula, hai rama \n" +
                        "Lakhe chehera achhi aei duniyare \n " +
                        "    Hele akhi janaku hi khojiba \n" +
                        " Hele akhi janaku hi khojiba \n" +
                        " Maula oye rama \n" +

                        " Milanara chhuan re ishq ishq\"  \n " +
                        " Birahara niaan re ishq \n  " +
                        " Srbanara pritire ishq ishq \n " +
                        " Baisakhi tatire ishq \n" +
                        "Saburi hrudaye deichii bhari se \n " +
                        " Ishq hai khusboo \n " +

                        "Ishq hai maula maula \n  " +
                        " Ishq hai rama rama \n  " +
                        " Ishq se hoga rubaroo \n" +
                        "Ishq hai tu hi tu \n " +

                        " M ? Ishq hai maula maula \n" +

                        " Ishq hai rama rama \n   " +
                        "Ishq se hoga rubaroo \n"+
                        "  Ishq hai tu hi tu \n"+

                        " Chorus ? Ishq hai tu hi tu \n"+

                        "Female ? Ishq phulara haye pakhuda parika \n"+
                        " Kanla komala sate mahaka mahaka \n"+
                        "Ishq abhula se je smruti apasora \n"+
                        "  Sabuthu sundara aau sabuthu niara \n"+
                        " Indradhanu ra sata ranga re \n"+

                        "    Chorus ? Tu hi tu (2) \n"+

                        "  M ? Gita aau sangitara chhandare \n"+
                        " Chorus ? Tu hi tu (2) \n "+

                        "  F ? Bhaba aau bhabanara murchhana \n"+


                        "M ? Puja aradhana aau archana\n "+

                        " Nua meghara parasa ishq ishq\n"+
                        " Bhija matira sugandha ishq\n"+
                        " Akhi akhi milane ishq ishq\n"+
                        "Mrudu mrudu spandane ishq\n "+
                        "   Se ishq hei sabu dina pain\n"+
                        "  Mo bhitare rahichu tu\n "+

                        " M & F ? Ishq hai maula maula\n"+
                        " Ishq hai rama rama\n"+
                        "  Ishq se hoga rubaroo\n"+
                        "    Ishq hai tu hi tu\n"+


                        " Chorus ? Ishq hai tu hi tu (2)\n"+

                        "  M ? Ishq hai maula maula\n"+
                        " Ishq hai rama rama\n "+
                        " Ishq se hoga rubaroo\n"+
                        " Ishq hai tu hi tu\n "+
                        " Ishq hai ishq hai tu hi tu\n"+

                        "  F ? Ishq hai tu hi tu\n"+

                        "  M ? Ishq hai tu hi tu\n"+

                        " F ? Ishq hai tu hi tu");


        indexList.add(1);
        SongTitleList.add("dekhija priya tu - neeladri das ");
        SongLyricsList.add("Dekhija priya tu dekhija thare\n" +
                "Kemiti banchichhi tu gala pare\n" +
                "Emiti jinchhi mun\n" +
                "Jaluchhi hrudaya chhati bhitare\n" +
                "\n" +
                "Tu chali gala pare\n" +
                "Mun nahin mo bhitare\n" +
                "Chala bate eka hoi\n" +
                "Alaga chale mo chhai dehathu dure\n" +
                "\n" +
                "Dekhija priya tu dekhija thare\n" +
                "Kemiti banchichhi tu gala pare\n" +
                "\n" +
                "Bhabile pachha dina\n" +
                "Bhangi jaye mo mana\n" +
                "Kemiti hrudaya tora\n" +
                "Premaku mo kari para rahichhi dure\n" +
                "\n" +
                "Dekhija Priya Tu odia song\n" +
                "Dekhija priya tu dekhija thare\n" +
                "Kemiti banchichhi tu gala pare\n" +
                "Emiti jinchhi mun\n" +
                "Jaluchhi hrudaya chhati bhitare");



        indexList.add(2);
        SongTitleList.add("re mana tu bhala pauchu- mohd. irfan ");
        SongLyricsList.add( "Pakhare thile se sabu bhala lage\n" +
                "Dure thile kain khojuchu\n" +
                "Dukha rutu jebe tote chhuin jaye\n" +
                "Ta katha tu kahin bhabuchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Ran bhala pauchu\n" +
                "\n" +
                "Jitibaku chahin taku nija pakhe haruchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Han bhala pauchu\n" +
                "\n" +
                "Kahinki kaha adha ratire\n" +
                "Bhangi jaye to nida\n" +
                "Eka chalile ta gali bate\n" +
                "Kahin jaye to pada\n" +
                "Janha alua re nija chhai dekhi\n" +
                "Kahin tu chamaki chahunchu\n" +
                "Aau ka muhan re ta naan suni\n" +
                "Kahinki tu ete daruchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Han bhala pauchu\n" +
                "\n" +
                "Prema dhuli ghara jani bharasa tu karuchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Han bhala pauchu\n" +
                "\n" +
                "Mana emiti dami jinisha\n" +
                "Jaha pain ki haje\n" +
                "Ta pain michhe kandiba pain\n" +
                "Hajare karana khoje\n" +
                "Akuha kathaku chhatire luchei\n" +
                "Nija sathe kain kheluchu\n" +
                "Chhotia hrudaya bhari niridaya\n" +
                "Kahin ete asaa toluchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Han bhala pauchu\n" +
                "\n" +
                "Kie kale kahidaba deri kain karuchu\n" +
                "Re mana tu bhala pauchu\n" +
                "Han bhala pauchu");


        indexList.add(3);
        SongTitleList.add("hrudaya bichara - babusan ");
        SongLyricsList.add(
                "Hrudaya Bichara Khoje to Sahara\n" +
                        "Hrudaya Bichara Khoje to Sahara\n" +
                        "Eka Eka mu Adhura Kula ki kinara jale ratisara?\n" +
                        "Khoje Mun?.Khoje Mun?.\n" +
                        "Kouthi tu..Kouthi tu\n" +
                        "\n" +
                        "F ? Chhati Tale Tora, Karichhi mu Ghara\n" +
                        "Khojile Paibu, Hrudayare Tora\n" +
                        "Pakhe Pakhe Auchhi Mun?.\n" +
                        "\n" +
                        "M ? Khoje Mun?.Khoje Mun?.\n" +
                        "Kouthi tu..Kouthi tu\n" +
                        "\n" +
                        "Hrudaya Bichara Khoje to Sahara ??..\n" +
                        ".\n" +
                        ".\n" +
                        "Rakata Jharae Chala patha mora\n" +
                        "Kanta Khali Bata sara\n" +
                        "Rakata Jharae Chala patha mora\n" +
                        "Kanta Khali Bata sara hoo..\n" +
                        "Biraha Nian re kuhuli kuhuli\n" +
                        "Jaluchhi mu ratisara?\n" +
                        "Jaluchhi mu ratisara\n" +
                        "\n" +
                        "F ? Sanja Ase nain, Jahna ase Uin\n" +
                        "Kahibaku khali, tori pain\n" +
                        "Pakhe Pakhe auchhi Mun?\n" +
                        "\n" +
                        "M ? Khoje Mun?.Khoje Mun?.\n" +
                        "Kouthi tu..Kouthi tu\n" +
                        "\n" +
                        "Hrudaya Bichara Khoje to Sahara ??..\n" +
                        "\n" +
                        "Mana mo kahuchhi, eithi kouthi\n" +
                        "Pakhe pakhe achhu mora..\n" +
                        "Mana mo kahuchhi, eithi kouthi\n" +
                        "Pakhe pakhe achhu mora..\n" +
                        "Kemiti janibi, koubate gale\n" +
                        "Dekha heba puni tora\n" +
                        "Dekha heba puni tora\n" +
                        "\n" +
                        "F ?  Sapanara Pathe, chanhichhi mu tate\n" +
                        "Hata dhari mora, neijare mate\n" +
                        "Pakhe Pakhe auchhi Mun?\n" +
                        "\n" +
                        "M ? Khoje Mun?.Khoje Mun?.\n" +
                        "Kouthi tu..Kouthi tu\n" +
                        "\n" +
                        "Hrudaya Bichara Khoje to Sahara\n" +
                        "Hrudaya Bichara Khoje to Sahara???");

        indexList.add(4);
        SongTitleList.add("hata dhari chalutha - prem anand ");
        SongLyricsList.add("M ? Sabu janamare\n" +
                "Aei jibanare\n" +
                "Sathi hei asutha\n" +
                "\n" +
                "Mo hata dhari chalutha\n" +
                "Hata dhari chalutha (2)\n" +
                "\n" +
                "F ? Mo hasa sathire\n" +
                "To hasa misei\n" +
                "Sabu dina hasutha\n" +
                "\n" +
                "Mo hata dhari chalutha\n" +
                "Hata dhari chalutha (2)\n" +
                "\n" +
                "M ? A jibana bata tie\n" +
                "Batare hajare moda\n" +
                "\n" +
                "F ? Aaji kali se modare\n" +
                "Suneli sapana bhida\n" +
                "\n" +
                "M ? Sapanara ranga ude\n" +
                "Aaji a akasha sara\n" +
                "\n" +
                "F ? Akasare megha nahin\n" +
                "Heera pari pade khara\n" +
                "\n" +
                "M ? Khara tana hele\n" +
                "To odhani tale\n" +
                "Chhai kari rakhitha\n" +
                "\n" +
                "Mo hata dhari chalutha\n" +
                "Hata dhari chalutha (2)");


        indexList.add(5);
        SongTitleList.add("kehi jane bhala lage re -sonu niga,ira mohanty ");
        SongLyricsList.add("\n" +
                "M ? Thare thare jibanare\n" +
                "Megha hei mahu jhare\n" +
                "Thare thare sapanare\n" +
                "Bata sara basna jhare\n" +
                "\n" +
                "F ? Chalu chalu batare\n" +
                "Faguna ra hatare\n" +
                "Prema huye re thare thare\n" +
                "\n" +
                "M ? Ho ? Prema jebe hei jaye\n" +
                "Mana kehi nei jaye\n" +
                "Rati sara nida bhange re ? Ho ?\n" +
                "\n" +
                "Kehi jane bhala lagere\n" +
                "\n" +
                "F ? Ho ? Kehi jane bhala lagere\n" +
                "Thare Thare jibanare\n" +
                "Megha hei mahu jhare\n" +
                "\n" +
                "M ? Thare thare sapanare\n" +
                "Bata sara basna jhare\n" +
                "\n" +
                "Thare thare mana pakhi\n" +
                "Udi udi jaye thaki\n" +
                "Phoola gachha dale jaye basi ? O ..\n" +
                "\n" +
                "F ? Sukumari sei phoola\n" +
                "Pai jaye ete bhala\n" +
                "Gita tara sune hasi hasi\n" +
                "\n" +
                "M ? Gunu gunu gita re\n" +
                "Sunu sunu mita re\n" +
                "Mana nache re thare thare\n" +
                "\n" +
                "F ? Ho ? Mana chhota pila pari\n" +
                "Ali kari kali kari\n" +
                "Sabu bele gela mage re\n" +
                "\n" +
                "M ? Ho ? Kehi jane bhala lagere");
    }
}
