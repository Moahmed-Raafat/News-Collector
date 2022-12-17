package com.example.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4,button5,button6,button7,button8;
    ArrayList<String> theWallStreetJournal;
    ArrayList<String> cnbc;
    ArrayList<String> foxNews;
    ArrayList<String> polotico;
    ArrayList<String> unitedNations;
    ArrayList<String> skyNews;
    ArrayList<String> cbsNews;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        addData();


    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        switch (view.getId())
        {
            case R.id.button1:
                intent.putExtra("key_name",theWallStreetJournal);
                this.startActivity(intent);

                break;

            case R.id.button2:
                intent.putExtra("key_name",cnbc);
                this.startActivity(intent);

                break;

            case R.id.button3:
                intent.putExtra("key_name",foxNews);
                this.startActivity(intent);

                break;

            case R.id.button4:
                intent.putExtra("key_name",polotico);
                this.startActivity(intent);

                break;

            case R.id.button5:
                intent.putExtra("key_name",unitedNations);
                this.startActivity(intent);

                break;

            case R.id.button6:
                intent.putExtra("key_name",skyNews);
                this.startActivity(intent);

                break;

            case R.id.button7:
                intent.putExtra("key_name",cbsNews);
                this.startActivity(intent);

                break;

            case R.id.button8:
                Intent intent2=new Intent(this,AboutActivity.class);
                this.startActivity(intent2);

                break;

            default:
                break;
        }

    }

    public void addData()
    {
        theWallStreetJournal=new ArrayList<>();
        cnbc=new ArrayList<>();
        foxNews=new ArrayList<>();
        polotico=new ArrayList<>();
        unitedNations=new ArrayList<>();
        skyNews=new ArrayList<>();
        cbsNews=new ArrayList<>();
        //////////////////////////////////////////////////////////////////////////
        theWallStreetJournal.add("from THE WALL STREET JOURNAL");
        theWallStreetJournal.add("Opinion");
        theWallStreetJournal.add("World News");
        theWallStreetJournal.add("US Business");
        theWallStreetJournal.add("Markets News");
        theWallStreetJournal.add("Technology");
        theWallStreetJournal.add("Life style");

        theWallStreetJournal.add(" https://feeds.a.dj.com/rss/RSSOpinion.xml");
        theWallStreetJournal.add("https://feeds.a.dj.com/rss/RSSWorldNews.xml");
        theWallStreetJournal.add("https://feeds.a.dj.com/rss/WSJcomUSBusiness.xml");
        theWallStreetJournal.add("https://feeds.a.dj.com/rss/RSSMarketsMain.xml");
        theWallStreetJournal.add("https://feeds.a.dj.com/rss/RSSWSJD.xml");
        theWallStreetJournal.add("https://feeds.a.dj.com/rss/RSSLifestyle.xml");
        //////////////////////////////////////////////////////////////////////////
        cnbc.add("from CNBC");
        cnbc.add("Health");
        cnbc.add("Business");
        cnbc.add("World");
        cnbc.add("Technology");
        cnbc.add("US News");
        cnbc.add("Politics");

        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=10000108");
        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=10001147");
        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=100727362");
        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=19854910");
        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=15837362");
        cnbc.add("https://search.cnbc.com/rs/search/combinedcms/view.xml?partnerId=wrss01&id=10000113");
        //////////////////////////////////////////////////////////////////////////
        foxNews.add("from FOX NEWS");
        foxNews.add("World");
        foxNews.add("Politics");
        foxNews.add("Science");
        foxNews.add("Health");
        foxNews.add("Sports");
        foxNews.add("Technology");

        foxNews.add("https://moxie.foxnews.com/google-publisher/world.xml");
        foxNews.add("https://moxie.foxnews.com/google-publisher/politics.xml");
        foxNews.add("https://moxie.foxnews.com/google-publisher/science.xml");
        foxNews.add("https://moxie.foxnews.com/google-publisher/health.xml");
        foxNews.add("https://moxie.foxnews.com/google-publisher/sports.xml");
        foxNews.add("https://moxie.foxnews.com/google-publisher/tech.xml");
        //////////////////////////////////////////////////////////////////////////
        polotico.add("from POLOTICO");
        polotico.add("Congress");
        polotico.add("Health");
        polotico.add("Defense");
        polotico.add("Economy");
        polotico.add("Energy");
        polotico.add("Politics");

        polotico.add("https://rss.politico.com/congress.xml");
        polotico.add("https://rss.politico.com/healthcare.xml");
        polotico.add("https://rss.politico.com/defense.xml");
        polotico.add("https://rss.politico.com/economy.xml");
        polotico.add("https://rss.politico.com/energy.xml");
        polotico.add("https://rss.politico.com/politics-news.xml");
        //////////////////////////////////////////////////////////////////////////
        unitedNations.add("from UNITED NATIONS");
        unitedNations.add("Health");
        unitedNations.add("UN Affairs");
        unitedNations.add("Law & Crime Prevention");
        unitedNations.add("Human Rights");
        unitedNations.add("Humanitarian Aids");
        unitedNations.add("Climate Change");

        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/health/feed/rss.xml");
        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/un-affairs/feed/rss.xml");
        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/law-and-crime-prevention/feed/rss.xml");
        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/human-rights/feed/rss.xml");
        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/humanitarian-aid/feed/rss.xml");
        unitedNations.add("https://news.un.org/feed/subscribe/en/news/topic/climate-change/feed/rss.xml");
        //////////////////////////////////////////////////////////////////////////
        skyNews.add("from SKY NEWS");
        skyNews.add("UK");
        skyNews.add("World");
        skyNews.add("US");
        skyNews.add("Business");
        skyNews.add("Politics");
        skyNews.add("Technology");

        skyNews.add("https://feeds.skynews.com/feeds/rss/uk.xml");
        skyNews.add("https://feeds.skynews.com/feeds/rss/world.xml");
        skyNews.add("https://feeds.skynews.com/feeds/rss/us.xml");
        skyNews.add("https://feeds.skynews.com/feeds/rss/business.xml");
        skyNews.add("https://feeds.skynews.com/feeds/rss/politics.xml");
        skyNews.add(" https://feeds.skynews.com/feeds/rss/technology.xml");
        //////////////////////////////////////////////////////////////////////////
        cbsNews.add("from CBS NEWS");
        cbsNews.add("US");
        cbsNews.add("Politics");
        cbsNews.add("World");
        cbsNews.add("Health");
        cbsNews.add("Money Watch");
        cbsNews.add("Science");

        cbsNews.add("https://www.cbsnews.com/latest/rss/us");
        cbsNews.add("https://www.cbsnews.com/latest/rss/politics");
        cbsNews.add("https://www.cbsnews.com/latest/rss/world");
        cbsNews.add("https://www.cbsnews.com/latest/rss/health");
        cbsNews.add("https://www.cbsnews.com/latest/rss/moneywatch");
        cbsNews.add("https://www.cbsnews.com/latest/rss/science");

    }

    @Override
    public void onBackPressed()
    {
        Intent intent=new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }


}