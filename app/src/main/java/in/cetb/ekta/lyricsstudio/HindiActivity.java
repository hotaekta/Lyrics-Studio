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

public class HindiActivity extends ActionBarActivity {

    public static final String HSONGINDEX = "in.cetb.ekta.lyricsstudio.HindiActivity.HSONGINDEX";
    static final String HSONGTITLE = "in.cetb.ekta.lyricsstudio.HindiActivity.HSONGTITLE";
    static final String HSONGLYRICS = "in.cetb.ekta.lyricsstudio.HindiActivity.HSONLYRICS";
    ListView lv;
    public ArrayList<String> SongTitleList;
    public ArrayList<String> SongLyricsList;
    public ArrayList<Integer> indexList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);

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
                Intent intent = new Intent(HindiActivity.this, HindiSongActivity.class);
                intent.putExtra(HSONGINDEX, selectedSongIndex);
                intent.putExtra(HSONGTITLE, SongTitleList.get(selectedSongIndex));
                intent.putExtra(HSONGLYRICS, SongLyricsList.get(selectedSongIndex));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hindi, menu);
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
        SongTitleList.add("Baatein Ye Kabhi Na - Arijit Singh");
        SongLyricsList.add("Baatein ye kabhi na tu bhoolna\n" +
                "Koi tere khatir hai jee raha\n" +
                "Jaaye tu kahin, bhi ye sochna\n" +
                "Koi tere khatir hai jee raha\n" +
                "Tu jahaan jaaye mehfooz ho\n" +
                "Tu jahaan jaaye mehfooz ho\n" +
                "Dil mera maange bas ye duaa\n" +
                "\n" +
                "Baatein ye kabhi na tu bhoolna\n" +
                "Koi tere khatir hai jee raha\n" +
                "Jaaye tu kahin, bhi ye sochna\n" +
                "Koi tere khatir hai jee raha\n" +
                "\n" +
                "Humdard hai, humdum bhi hai\n" +
                "Tu saath hai toh zindagi\n" +
                "Tu jo kabhi door rahe\n" +
                "Ye humse ho jaaye ajnabi\n" +
                "Tujhse mohabbat karte hain jo\n" +
                "Tujhse mohabbat karte hain jo\n" +
                "Kaise kare hum usko bayaan\n" +
                "\n" +
                "Baatein ye kabhi na tu bhulna\n" +
                "Koi tere khatir hai jee raha\n" +
                "Jaaye tu kahin, bhi ye sochna\n" +
                "Koi tere khatir hai jee rahaa\n" +
                "\n" +
                "Jaagi bhi hai royi bhi hai\n" +
                "Aankhein ye raaton mein mere\n" +
                "Kyun har ghadi milke tujhe\n" +
                "Lagti rahe bas teri kami\n" +
                "Hum toh na samjhe tum hi kaho\n" +
                "Hum toh na samjhe tum hi kaho\n" +
                "Kyun tumko paake tumse juda\n" +
                "\n" +
                "Baatein ye kabhi na tu bhoolna\n" +
                "Koi tere khatir hai jee rahaa\n" +
                "Jaaye tu kahin, bhi ye sochna\n" +
                "Koi tere khatir hai jee rahaa");
        indexList.add(1);
        SongTitleList.add("Tu Har Lamha - Arijit Singh");
        SongLyricsList.add("Waaqif toh huey tere dil ki baat se\n" +
                "Chhupaya jise tune qaaynaat se\n" +
                "Waaqif toh huey tere uss khayal se\n" +
                "Chhupaya jise tune apne aap se\n" +
                "Kahin na kahin teri aankhein,\n" +
                "teri baatein padh rahe hain hum\n" +
                "Kahin na kahin tere dil mein,\n" +
                "dhadkano mein dhal rahe hain hum\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paas rahaa\n" +
                "\n" +
                "Uss din tu haan udaas rahe\n" +
                "tujhe jis din hum na dikhe na miley\n" +
                "Uss din tu chup-chaap rahe\n" +
                "tujhe jis din kuch na kahe na suney\n" +
                "Main hoon bann chuka, jeene ki ik wajah\n" +
                "Iss baat ko khud se tu na chupaa..\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paas rahaa\n" +
                "\n" +
                "Lab se bhale tu kuch na kahe\n" +
                "Tere dil mein hum hi toh base yaa rahe\n" +
                "Saansein teri iqraar kare\n" +
                "Tera haath agar chhulein, pakde\n" +
                "Teri khwahishein kar bhi de tu bayaan\n" +
                "Yehi waqt hai inke izhaar ka..\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paasTu Har Lamha Lyrics\n" +
                "Waaqif toh huey tere dil ki baat se\n" +
                "Chhupaya jise tune qaaynaat se\n" +
                "Waaqif toh huey tere uss khayal se\n" +
                "Chhupaya jise tune apne aap se\n" +
                "Kahin na kahin teri aankhein,\n" +
                "teri baatein padh rahe hain hum\n" +
                "Kahin na kahin tere dil mein,\n" +
                "dhadkano mein dhal rahe hain hum\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paas rahaa\n" +
                "\n" +
                "Uss din tu haan udaas rahe\n" +
                "tujhe jis din hum na dikhe na miley\n" +
                "Uss din tu chup-chaap rahe\n" +
                "tujhe jis din kuch na kahe na suney\n" +
                "Main hoon bann chuka, jeene ki ik wajah\n" +
                "Iss baat ko khud se tu na chupaa..\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paas rahaa\n" +
                "\n" +
                "Lab se bhale tu kuch na kahe\n" +
                "Tere dil mein hum hi toh base yaa rahe\n" +
                "Saansein teri iqraar kare\n" +
                "Tera haath agar chhulein, pakde\n" +
                "Teri khwahishein kar bhi de tu bayaan\n" +
                "Yehi waqt hai inke izhaar ka..\n" +
                "Tu Har Lamha.. tha mujhse juda..\n" +
                "Chaahe door tha main.. yaa paas rahaa");
        indexList.add(2);
        SongTitleList.add("Saiyaan Superstar - Tulsi Kumar");
        SongLyricsList.add("Hai wo handsome sona sabse\n" +
                "Mere dil ko gaya le kar\n" +
                "Meri neend chura li usne\n" +
                "Aur khwab gaya dekar (x2)\n" +
                "\n" +
                "Ab ye naina bole yaar\n" +
                "Bole yehi lagataar\n" +
                "Koi chaahe kitna roke karungi pyar..\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar (x2)\n" +
                "\n" +
                "Haan jabse usne akhiyon se\n" +
                "dil pe autograph diya\n" +
                "Tabse everyday maine\n" +
                "bas usko hi yaad kiya (x2)\n" +
                "\n" +
                "Senti mere jazbaat o sunle mere dil ki baat\n" +
                "Saath mujhko le ke jaa main hoon taiyaar...\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar (x2)\n" +
                "\n" +
                "Filmy style se jab usne\n" +
                "kal raat mujhe propose kiya\n" +
                "Daayein na dekha, baayein na dekha\n" +
                "Usko dil ka rose diya (x2)\n" +
                "\n" +
                "Huve charche chaar hazaar\n" +
                "Photo chhap gayi in akhbaar\n" +
                "Mujhko parwah nahi koi I'm with the star..\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar \n" +
                "Hai wo handsome sona sabse\n" +
                "Mere dil ko gaya le kar\n" +
                "Meri neend chura li usne\n" +
                "Aur khwab gaya dekar (x2)\n" +
                "\n" +
                "Ab ye naina bole yaar\n" +
                "Bole yehi lagataar\n" +
                "Koi chaahe kitna roke karungi pyar..\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar (x2)\n" +
                "\n" +
                "Haan jabse usne akhiyon se\n" +
                "dil pe autograph diya\n" +
                "Tabse everyday maine\n" +
                "bas usko hi yaad kiya (x2)\n" +
                "\n" +
                "Senti mere jazbaat o sunle mere dil ki baat\n" +
                "Saath mujhko le ke jaa main hoon taiyaar...\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar (x2)\n" +
                "\n" +
                "Filmy style se jab usne\n" +
                "kal raat mujhe propose kiya\n" +
                "Daayein na dekha, baayein na dekha\n" +
                "Usko dil ka rose diya (x2)\n" +
                "\n" +
                "Huve charche chaar hazaar\n" +
                "Photo chhap gayi in akhbaar\n" +
                "Mujhko parwah nahi koi I'm with the star..\n" +
                "\n" +
                "Mere saiyaan superstar\n" +
                "O Mere saiyaan superstar\n" +
                "Main fan hui unki\n" +
                "O mere saiyaan superstar (x2)");
        indexList.add(3);
        SongTitleList.add("Char Kadam - P.K. - Shaan, Shreya Ghoshal");
        SongLyricsList.add("Mmmm..\n" +
                "\n" +
                "Bin puchhe mera naam aur pataa\n" +
                "Rasmon ko rakh ke pare\n" +
                "Chaar kadam bas chaar kadam\n" +
                "Chal do naa saath mere (x2)\n" +
                "\n" +
                "Bin kuch kahe, bin kuch sune\n" +
                "Haathon mein haath liye\n" +
                "Chaar kadam bas char kadam\n" +
                "Chal do na saath mere\n" +
                "\n" +
                "Hey.. bin kuch kahe, bin kuch sune\n" +
                "Haathon mein haath liye\n" +
                "Chaar kadam bas chaar kadam\n" +
                "Chal do na saath mere\n" +
                "\n" +
                "Raahon mein tumko jo dhoop sataye\n" +
                "Chaaon bicha denge hum\n" +
                "Andhere daraye to jaa kar falak pe\n" +
                "Chand sajaa denge hum\n" +
                "Chhaye udaasi latife suna kar\n" +
                "Tujhko hansa denge hum\n" +
                "\n" +
                "Hanste hansaate yunhi gungunaate\n" +
                "Chal denge chaar kadam\n" +
                "Yea yeah.. na na nana...\n" +
                "La ra la.. ra.\n" +
                "\n" +
                "Tumsa mile jo koi rehguzar\n" +
                "Duniya se kaun darey\n" +
                "Chaar kadam kya saari umar\n" +
                "Chal dungi saath tere\n" +
                "\n" +
                "Bin kuch kahe, bin kuch sune\n" +
                "Haathon mein haath liye\n" +
                "Char kadam bas char kadam\n" +
                "Chal do na saath mere (x2)");

        indexList.add(4);
        SongTitleList.add("Bhagwan Hai Kahan Re Tu - P.K. - Sonu Nigam");
        SongLyricsList.add("Hai suna ye poori dharti tu chalata hai\n" +
                "Meri bhi sun le araj mujhe ghar bulata hai\n" +
                "Bhagwan hai kahan re tu\n" +
                "Hey Khuda hai kahan re tu\n" +
                "\n" +
                "Hai suna tu bhatke mann ko raah dikhata hai\n" +
                "Main bhi khoya hun mujhe ghar bulata hai\n" +
                "Bhagwan hai kahan re tu\n" +
                "Hey Khuda hai kahan re tu\n" +
                "\n" +
                "Aa...\n" +
                "Main pooja karun ya namajein padhun\n" +
                "Ardaasein karun din rain\n" +
                "Na tu Mandir mile, na tu Girje mile\n" +
                "Tujhe dhoondein thake mere nain\n" +
                "Tujhe dhoondein thake mere nain\n" +
                "Tujhe dhoondein thake mere nain\n" +
                "\n" +
                "Jo bhi rasmein hain wo saari main nibhata hoon\n" +
                "In karodon ki tarah main sar jhukata hoon\n" +
                "Bhagwan hai kahan re tu\n" +
                "Aye Khuda hai kahan re tu\n" +
                "\n" +
                "Tere naam kayi, tere chehre kayi\n" +
                "Tujhe paane ki raahein kayi\n" +
                "Har raah chalaa par tu na mila\n" +
                "Tu kya chaahe main samjha nahin\n" +
                "Tu kya chaahe main samjha nahin\n" +
                "Tu kya chaahe main samjha nahin\n" +
                "\n" +
                "Soche bin samjhe jatan karta hi jaata hun\n" +
                "Teri zid sar aankhon par rakh ke nibhata hun\n" +
                "Bhagwan hai kahan re tu\n" +
                "Aye Khuda hai kahan re tu\n" +
                "\n" +
                "Hai suna ye poori dharti tu chalata hai\n" +
                "Meri bhi sun le araj mujhe ghar bulata hai\n" +
                "Bhagwan hai kahan re tu\n" +
                "Hey Khuda hai kahan re tu\n" +
                "Bhagwan hai kahan re tu\n" +
                "Hey Khuda hai kahan re tu..");
        indexList.add(5);
        SongTitleList.add("Love is Waste Of Time - P.K. - Sonu Nigam, Shreya Ghoshal");
        SongLyricsList.add("Tujhe tak tak tak takte rehna\n" +
                "Teri bak bak bak sunte rehna\n" +
                "Kaam-kaaj sab bhool bhula ke\n" +
                "tere piche piche chalte rehna\n" +
                "ee to hai waste of time\n" +
                "Love is a waste of time\n" +
                "Pyaar vyaar waste of time\n" +
                "Ee love is waste of time\n" +
                "\n" +
                "Aa aa aa...\n" +
                "\n" +
                "Phir bhi soch liya hun man maa\n" +
                "Ek baar toh iss jeevan maa\n" +
                "Kar le waste of time\n" +
                "Karna hai waste of time\n" +
                "I want to waste my time\n" +
                "I Love this bhaste of time..\n" +
                "\n" +
                "Aa aa aa...\n" +
                "\n" +
                "Poore 75 baar mirror'wa dekhe\n" +
                "32 baar hum apna baal banaaye\n" +
                "8 martaba kapda change kiye hum\n" +
                "Bhar bhar botal badhiya scent lagaaye\n" +
                "Sajte rahe, sanwarte rahe\n" +
                "Kiya na koi bhi kaam\n" +
                "Aaj samajh mein aa gaya bhaiya\n" +
                "Love is waste of time\n" +
                "\n" +
                "Phir bhi soch liya hun man maa\n" +
                "Ek baar toh iss jeevan maa\n" +
                "Kar le waste of time\n" +
                "Karna hai waste of time\n" +
                "I want to waste my time\n" +
                "I Love this bhaste of time..\n" +
                "\n" +
                "Aa aa-aa... \n" +
                "\n" +
                "Ajab ghajab si uthal hai man maa\n" +
                "Kaisi hai ye feeling kaise batayein\n" +
                "Baithe baithe bina baat muskaayein\n" +
                "Kya hai maajra kuch bhi samajh na aaye\n" +
                "Udne ka mann kare mann ki jor jor chillaye\n" +
                "Aaj samajh mein aa gaya bhaiya\n" +
                "Love is bhaste of time\n" +
                "\n" +
                "Phir bhi soch liya hoon man maa\n" +
                "Ek baar toh iss jeevan maa\n" +
                "Kar le waste of time..\n" +
                "Karna hai bhaste of time..\n" +
                "I want to bhaste my time..\n" +
                "I Love this bhaste of time..\n" +
                "\n" +
                "Aa aa-aa... ");
        indexList.add(6);
        SongTitleList.add("Khamoshiyan - Arijit Singh");
        SongLyricsList.add("Khamoshiyan aawaaz hain\n" +
                "Tum sun'ne to aao kabhi\n" +
                "Chhukar tumhe khill jaayengi\n" +
                "Ghar inko bulaao kabhi\n" +
                "Beqarar hain baat karne ko\n" +
                "Kehne do inko zaraa..\n" +
                "\n" +
                "Khamoshiyan.. teri meri khamoshiyan\n" +
                "Khamoshiyan.. lipti hui khamoshiyan\n" +
                "\n" +
                "Kya uss gali mein kabhi tera jaana hua\n" +
                "Jahaan se zamaane ko guzre zamaana hua\n" +
                "Mera samay toh wahin pe hai thehra hua\n" +
                "Bataaun tumhe kya mere sath kya kya hua\n" +
                "\n" +
                "Khamoshiyan ek saaz hai\n" +
                "Tum dhun koi laao zaraa\n" +
                "Khamoshiyan alfaaz hain\n" +
                "Kabhi aa gunguna le zara\n" +
                "Beqarar hain baat karne ko\n" +
                "Kehne do inko zaraa.. haa..\n" +
                "\n" +
                "Khamoshiyan.. teri meri khamoshiyan\n" +
                "Khamoshiyan.. lipti hui khamoshiyan\n" +
                "\n" +
                "Nadiya ka paani bhi khamosh behta yahaan\n" +
                "Khili chandani mein chhipi lakh khamoshiyan\n" +
                "Baarish ki boondon ki hoti kahaan hai zubaan\n" +
                "Sulagte dilon mein hai khamosh uthta dhuaan\n" +
                "\n" +
                "Khamoshiyan aakaash hai\n" +
                "Tum udne toh aao zara\n" +
                "Khamoshiyan ehsaas hai\n" +
                "Tumhe mehsoos hoti hai kya\n" +
                "Beqarar hain baat karne ko\n" +
                "Kehne do inko zara.. haa..\n" +
                "\n" +
                "Khamoshiyan.. teri meri khamoshiyan\n" +
                "Khamoshiyan.. lipti hui khamoshiyan");
        indexList.add(7);
        SongTitleList.add("Jee Karda - Divya Kumar");
        SongLyricsList.add("Chalni kar de seena mera\n" +
                "Chalni kar de seena mera\n" +
                "Chalni kar de seena mera\n" +
                "Daag saari goliyan ni ajj mera jee karda\n" +
                "Marjaneya ni aaj mera jee karda\n" +
                "Marjaneya ni mera jee karda\n" +
                "Marjaneya ni aaj mera jee karda\n" +
                "\n" +
                "Mushqil kar de jeena mera\n" +
                "Mushqil kar de jeena mera\n" +
                "Mushqil kar de jeena mera\n" +
                "Hanste hanste mit jaaneya ni mera jee karda\n" +
                "Marjaneya ni ajj mera jee karda\n" +
                "Marjaneya ni mera jee karda\n" +
                "Marjaneya ni ajj mera jee karda\n" +
                "\n" +
                "Rabba mere, mujhe ghar pe tere\n" +
                "kadi bula teri chaukhat pe\n" +
                "De de aur jo dard ho baaqi\n" +
                "Rula mujhe rajj rajj ke aaj mera jee karda\n" +
                "\n" +
                "Ki ajj mera jee karda\n" +
                "Ki ajj mera jee karda, jee karda, jee karda\n" +
                "Ho.. ik waari deedar ko tere\n" +
                "Ik waari deedar ko tere\n" +
                "Ik waari deedar ko tere\n" +
                "Lakh waari katt jaaniya ni ajj mera jee karda\n" +
                "Marjaneya ni ajj mera ji karda\n" +
                "Marjaneya ni mera ji karda\n" +
                "Marjaneya ni ajj mera ji karda\n" +
                "\n" +
                "Le loon balaayein, balaayein teri\n" +
                "De doon duaayein, duaayein...\n" +
                "Le ja, le ja tu abki baari\n" +
                "Saansein ab hain haari...\n" +
                "Ki aaj mera jee karda\n" +
                "Marjaneya ni ajj mera jee karda\n" +
                "Marjaneya ni mera jee karda\n" +
                "Marjaneya ni ajj mera jee karda\n" +
                "\n" +
                "Chhalni karde seena mera\n" +
                "Mushqil karde jeena mera\n" +
                "Chalni kar de seena mera...\n" +
                "Hmm... hmm...");
        indexList.add(8);
        SongTitleList.add("Chittiyaan Kalaiyaan - Meet Bros. Anjjan & Kanika Kapoor");
        SongLyricsList.add("Kalaiyaan... Kalaiyaan...\n" +
                "\n" +
                "Tu leya de meinu golden jhumke..\n" +
                "Main kanna vich paavan chum chum ke (x3)\n" +
                "\n" +
                "Mann jaa ve... mainu shopping kara de\n" +
                "Mann jaa ve... romantic picture dikha de\n" +
                "Requestaan paayiaan ve..\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri white kalaiyaan ve (ho..)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri teri hisse aayiaan ve (ok ok!)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve.. (ho..) (x2)\n" +
                "(chittiyaan kalaiyan means: white wrists)\n" +
                "\n" +
                "Yeah \n" +
                "You're my darling angel baby\n" +
                "White kalaiyan drives me crazy\n" +
                "Shiney eyes say glitt glitt glittery\n" +
                "You're the light that makes me go hazy (x2)\n" +
                "\n" +
                "Oh mainu chadhiya hai rang rang\n" +
                "Main khwabaan de sang sang aaj ud'di phiran\n" +
                "Main saari raat ud'di phiran\n" +
                "Oh badle jindadi de rang dhang\n" +
                "Meri neendein bhi tang tang, aaj ud'di phiran\n" +
                "Main saari raat ud'di phiran\n" +
                "\n" +
                "Mann jaa ve... gulabi chunni diva de\n" +
                "Mann jaa ve... colourful chudi pavaa de\n" +
                "Requestaan paayiaan ve..\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri white kalaiyaan ve (ho..)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri teri hisse aayiaan ve (ok ok!)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve.. (ho)\n" +
                "\n" +
                "Ghumde phirde saare chitiyaan milgiyan\n" +
                "Chittiyaan kalaaiyan ve (kalaaiyan ve..)\n" +
                "Tere hathaan nu chumda rehnda\n" +
                "Kam tu lai laiyaan, oh chittiyaan ve\n" +
                "(oh chittiyaan ve!)\n" +
                "\n" +
                "Mann jaa ve... mainu shopping kara de\n" +
                "Mann jaa ve... romantic picture dikha de\n" +
                "Requestaan paayiaan ve..\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri white kalaiyaan ve (ho..)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri teri hisse aayiaan ve (ok ok!)\n" +
                "Chittiyaan kalaiyaan ve\n" +
                "Oh baby meri chittiyan kalaiyan ve.. (ho)");
    }
}
