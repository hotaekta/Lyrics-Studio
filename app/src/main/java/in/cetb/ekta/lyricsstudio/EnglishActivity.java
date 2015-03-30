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
import android.widget.Toast;

import java.util.ArrayList;

public class EnglishActivity extends ActionBarActivity {

    public static final String ESONGINDEX = "in.cetb.ekta.lyricsstudio.EnglishActivity.ESONGINDEX";
    static final String ESONGTITLE = "in.cetb.ekta.lyricsstudio.EnglishActivity.ESONGTITLE";
    static final String ESONGLYRICS = "in.cetb.ekta.lyricsstudio.EnglishActivity.ESONLYRICS";
    ListView lv;
    public ArrayList<String> SongTitleList;
    public ArrayList<String> SongLyricsList;
    public ArrayList<Integer> indexList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

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
                Intent intent = new Intent(EnglishActivity.this, EnglishSongActivity.class);
                intent.putExtra(ESONGINDEX, selectedSongIndex);
                intent.putExtra(ESONGTITLE, SongTitleList.get(selectedSongIndex));
                intent.putExtra(ESONGLYRICS, SongLyricsList.get(selectedSongIndex));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english, menu);
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
        SongTitleList.add("Chandelier - 40 Tubes Love [2015] - Sia");
        SongLyricsList.add("Party girls, don't get hurt\n" +
                "Can't feel anything, when will I learn?\n" +
                "I push it down, push it do-o-own\n" +
                "\n" +
                "I'm the one, for a good time call\n" +
                "Phone's blowing up, ringing my doorbell\n" +
                "I feel the love, feel the love\n" +
                "\n" +
                "1-2-3-1-2-3 drink\n" +
                "1-2-3-1-2-3 drink, 1-2-3-1-2-3 drink\n" +
                "Throw 'em back, 'till I lose count\n" +
                "\n" +
                "I'm, gonna swing, from the chandelier\n" +
                "From the chandelier\n" +
                "I'm, gonna live, like tomorrow doesn't exist\n" +
                "Like it doesn't exist\n" +
                "\n" +
                "I'm, gonna fly, like a bird in the night\n" +
                "Feel my tears as they dry\n" +
                "I'm, gonna swing, from the chandelier\n" +
                "From the chandelier\n" +
                "\n" +
                "But I'm holding on for dear life\n" +
                "Won't look down, won't open my eyes\n" +
                "Keep my glass full until morning light\n" +
                "'Cause I'm just holding on for tonight\n" +
                "\n" +
                "Help me I'm holding on for dear life\n" +
                "Won't look down, won't open my eyes\n" +
                "Keep my glass full until morning light\n" +
                "'Cause I'm just holding on for tonight, on for tonight\n" +
                "\n" +
                "Sun is up, I'm a mess\n" +
                "Gotta get out now, gotta run from this\n" +
                "Here comes the shame, here comes the shame (Oh-Oh-Oh)\n" +
                "\n" +
                "1-2-3-1-2-3 drink\n" +
                "1-2-3-1-2-3 drink, 1-2-3-1-2-3 drink\n" +
                "Throw 'em back, 'till I lose count\n" +
                "\n" +
                "I'm, gonna swing, from the chandelier\n" +
                "From the chandelier\n" +
                "I'm, gonna live, like tomorrow doesn't exist\n" +
                "Like it doesn't exist\n" +
                "\n" +
                "I'm, gonna fly, like a bird in the night\n" +
                "Feel my tears as they dry\n" +
                "I'm, gonna swing, from the chandelier\n" +
                "From the chandelier\n" +
                "\n" +
                "But I'm holding on for dear life\n" +
                "Won't look down, won't open my eyes\n" +
                "Keep my glass full until morning light\n" +
                "'Cause I'm just holding on for tonight\n" +
                "\n" +
                "Help me I'm holding on for dear life\n" +
                "Won't look down, won't open my eyes\n" +
                "Keep my glass full until morning light\n" +
                "'Cause I'm just holding on for tonight\n" +
                "\n" +
                "On for tonight, on for tonight\n" +
                "'Cause I'm just holding on for tonight\n" +
                "No I'm just holding on for tonight\n" +
                "On for tonight, on for tonight\n" +
                "\n" +
                "'Cause I'm just holding on for tonight\n" +
                "'Cause I'm just holding on for tonight\n" +
                "No I'm just holding on for tonight\n" +
                "On for tonight, on for tonight");

        indexList.add(1);
        SongTitleList.add("Just The Way You Are - Doo-wops and Hooligans [2014] - Bruno Mars");
        SongLyricsList.add("Oh, her eyes, her eyes\n" +
                "Make the stars look like they're not shining\n" +
                "Her hair, her hair\n" +
                "Falls perfectly without her trying\n" +
                "She's so beautiful, and I tell her everyday\n" +
                "\n" +
                "Yeah, I know, I know\n" +
                "When I compliment her she won't believe me\n" +
                "And it's so, it's so\n" +
                "Sad to think that she don't see what I see\n" +
                "But every time she asks me, \"Do I look okay?\"\n" +
                "I say\n" +
                "\n" +
                "When I see your face\n" +
                "There's not a thing that I would change\n" +
                "'Cause you're amazing\n" +
                "Just the way you are\n" +
                "And when you smile\n" +
                "The whole world stops and stares for a while\n" +
                "'Cause, girl, you're amazing\n" +
                "Just the way you are\n" +
                "\n" +
                "Her lips, her lips\n" +
                "I could kiss them all day if she let me\n" +
                "Her laugh, her laugh\n" +
                "She hates, but I think it's so sexy\n" +
                "She's so beautiful\n" +
                "And I tell her everyday\n" +
                "\n" +
                "Oh, you know, you know, you know\n" +
                "I'd never ask you to change\n" +
                "If perfect's what you're searching for\n" +
                "Then, just stay the same\n" +
                "So, don't even bother asking if you look okay\n" +
                "You know I'll say\n" +
                "\n" +
                "When I see your face\n" +
                "There's not a thing that I would change\n" +
                "'Cause you're amazing\n" +
                "Just the way you are\n" +
                "And when you smile\n" +
                "The whole world stops and stares for a while\n" +
                "'Cause, girl, you're amazing\n" +
                "Just the way you are\n" +
                "\n" +
                "The way you are\n" +
                "The way you are\n" +
                "Girl, you're amazing\n" +
                "Just the way you are\n" +
                "\n" +
                "When I see your face\n" +
                "There's not a thing that I would change\n" +
                "'Cause you're amazing\n" +
                "Just the way you are\n" +
                "And when you smile\n" +
                "The whole world stops and stares for a while\n" +
                "'Cause, girl, you're amazing\n" +
                "Just the way you are, yeah");

        indexList.add(2);
        SongTitleList.add("Let It Go - Frozen [2013] - Idina Menzel");
        SongLyricsList.add("The snow glows white on the mountain tonight\n" +
                "Not a footprint to be seen\n" +
                "A kingdom of isolation, and it looks like I'm the Queen\n" +
                "The wind is howling like this swirling storm inside\n" +
                "Couldn't keep it in; Heaven knows I've tried\n" +
                "\n" +
                "Don't let them in, don't let them see\n" +
                "Be the good girl you always have to be\n" +
                "Conceal, don't feel, don't let them know\n" +
                "Well now they know\n" +
                "\n" +
                "Let it go, let it go\n" +
                "Can't hold it back any more\n" +
                "Let it go, let it go\n" +
                "Turn away and slam the door\n" +
                "I don't care\n" +
                "What they're going to say\n" +
                "Let the storm rage on, the cold never bothered me anyway\n" +
                "\n" +
                "It's funny how some distance\n" +
                "Makes everything seem small\n" +
                "And the fears that once controlled me\n" +
                "Can't get to me at all\n" +
                "\n" +
                "It's time to see what I can do\n" +
                "To test the limits and break through\n" +
                "No right, no wrong, no rules for me\n" +
                "I'm free\n" +
                "\n" +
                "Let it go, let it go\n" +
                "I am one with the wind and sky\n" +
                "Let it go, let it go\n" +
                "You'll never see me cry\n" +
                "Here I stand\n" +
                "And here I stay\n" +
                "Let the storm rage on\n" +
                "\n" +
                "My power flurries through the air into the ground\n" +
                "My soul is spiraling in frozen fractals all around\n" +
                "And one thought crystalizes like an icy blast\n" +
                "I'm never going back,\n" +
                "The past is in the past\n" +
                "\n" +
                "Let it go, let it go\n" +
                "When I'll rise like the break of dawn\n" +
                "Let it go, let it go\n" +
                "That perfect girl is gone\n" +
                "Here I stand in the light of day\n" +
                "Let the storm rage on,\n" +
                "The cold never bothered me anyway\n");

        indexList.add(3);
        SongTitleList.add("Love Me Like You Do - Fifty Shades of Grey [2015] - Ellie Goulding");
        SongLyricsList.add("[Verse 1]\n" +
                "You're the light, you're the night\n" +
                "You're the colour of my blood\n" +
                "You're the cure, you're the pain\n" +
                "You're the only thing I wanna touch\n" +
                "Never knew that it could mean so much, so much\n" +
                "\n" +
                "[Verse 2]\n" +
                "You're the fear, I don't care\n" +
                "Cause I've never been so high\n" +
                "Follow me through the dark\n" +
                "Let me take you past the satellites\n" +
                "You can see the world you brought to life, to life\n" +
                "So\n" +
                "\n" +
                "[Chorus]\n" +
                "Love me like you do, la-la-love me like you do\n" +
                "Love me like you do, la-la-love me like you do\n" +
                "Touch me like you do, ta-ta-touch me like you do\n" +
                "What are you waiting for?\n" +
                "\n" +
                "[Verse 3]\n" +
                "Fading in, fading out\n" +
                "On the edge of paradise\n" +
                "Every inch of your skin is a Holy Grail I've got to find\n" +
                "Only you can set my heart on fire, on fire\n" +
                "Yeah\n" +
                "\n" +
                "[Bridge]\n" +
                "I'll let you set the pace\n" +
                "Cause I'm not thinking straight\n" +
                "My head's spinning around, I can't see clear no more\n" +
                "What are you waiting for?");

        indexList.add(4);
        SongTitleList.add("Blank Space - 1989 (Deluxe) [2014] - Taylor Swift ");
        SongLyricsList.add("Nice to meet you, where you been?\n" +
                "I could show you incredible things\n" +
                "Magic, madness, Heaven, sin\n" +
                "Saw you there and I thought\n" +
                "\n" +
                "\"Oh my God, look at that face\"\n" +
                "You look like my next mistake\n" +
                "Love's a game, wanna play?\n" +
                "\n" +
                "New money, suit and tie\n" +
                "I can read you like a magazine\n" +
                "Ain't it funny? Rumors fly\n" +
                "And I know you've heard about\n" +
                "\n" +
                "Me, so hey, let's be friends\n" +
                "I'm dying to see how this one ends\n" +
                "Grab your passport and my hand\n" +
                "I could make the bad guys good for a weekend\n" +
                "\n" +
                "So it's gonna be forever\n" +
                "Or it's gonna go down in flames\n" +
                "You can tell me when it's over, mm\n" +
                "If the high was worth the pain\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "'Cause you know I love the players\n" +
                "And you love the game\n" +
                "\n" +
                "'Cause we're young and we're reckless\n" +
                "We'll take this way too far\n" +
                "It'll leave you breathless, mm\n" +
                "Or with a nasty scar\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "But I got a blank space, baby\n" +
                "And I'll write your name\n" +
                "\n" +
                "Cherry lips, crystal skies\n" +
                "I could show you incredible things\n" +
                "Stolen kisses, pretty lies\n" +
                "You're the king, baby, I'm your\n" +
                "\n" +
                "Queen, find out what you want\n" +
                "Be that girl for a month\n" +
                "Wait, the worst is yet to come\n" +
                "Oh, no\n" +
                "\n" +
                "Screaming, crying, perfect storms\n" +
                "I can make all the tables turn\n" +
                "Rose garden filled with thorns\n" +
                "Keep you second-guessing, like\n" +
                "\n" +
                "\"Oh my God, who is she?\"\n" +
                "I get drunk on jealousy\n" +
                "But you'll come back each time you leave\n" +
                "'Cause, darling, I'm a nightmare dressed like a daydream\n" +
                "\n" +
                "So it's gonna be forever\n" +
                "Or it's gonna go down in flames\n" +
                "You can tell me when it's over, mm\n" +
                "If the high was worth the pain\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "'Cause you know I love the players\n" +
                "And you love the game\n" +
                "\n" +
                "'Cause we're young and we're reckless (Ohh)\n" +
                "We'll take this way too far\n" +
                "It'll leave you breathless, mm (Oh)\n" +
                "Or with a nasty scar\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane (Insane)\n" +
                "But I got a blank space, baby\n" +
                "And I'll write your name\n" +
                "\n" +
                "Boys only want love if it's torture\n" +
                "Don't say I didn't, say I didn't warn ya\n" +
                "Boys only want love if it's torture\n" +
                "Don't say I didn't, say I didn't warn ya\n" +
                "\n" +
                "So it's gonna be forever\n" +
                "Or it's gonna go down in flames\n" +
                "You can tell me when it's over, mm (Over)\n" +
                "If the high was worth the pain\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "'Cause you know I love the players\n" +
                "And you love the game\n" +
                "\n" +
                "'Cause we're young and we're reckless\n" +
                "We'll take this way too far\n" +
                "It'll leave you breathless, mm\n" +
                "Or with a nasty scar (With a nasty scar)\n" +
                "\n" +
                "Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "But I got a blank space, baby\n" +
                "And I'll write your name");
    }

    public void Toast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
