package com.example.newsreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recycleView;

    public String category;

    ArrayList<NewsItem> newsItems;

    NewsAdapter adapter;

    TextView category1,category2,category3,category4,category5,category6,textView1;

    GetNews instance;

    ArrayList<String> data;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        category1=findViewById(R.id.category1);
        category2=findViewById(R.id.category2);
        category3=findViewById(R.id.category3);
        category4=findViewById(R.id.category4);
        category5=findViewById(R.id.category5);
        category6=findViewById(R.id.category6);

        category1.setOnClickListener(this);
        category2.setOnClickListener(this);
        category3.setOnClickListener(this);
        category4.setOnClickListener(this);
        category5.setOnClickListener(this);
        category6.setOnClickListener(this);

        category1.setTextColor(ContextCompat.getColor(this, R.color.color2));
        category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
        category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
        category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
        category5.setTextColor(ContextCompat.getColor(this, R.color.color4));
        category6.setTextColor(ContextCompat.getColor(this, R.color.color4));
        textView1=findViewById(R.id.textView1);

        recycleView=findViewById(R.id.recycleView);
        adapter=new NewsAdapter(this);

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        newsItems=new ArrayList<>();

        Intent intent=getIntent();

        data=(ArrayList<String>) getIntent().getSerializableExtra("key_name");

        category= data.get(7);
        textView1.setText(data.get(0));
        category1.setText(data.get(1));
        category2.setText(data.get(2));
        category3.setText(data.get(3));
        category4.setText(data.get(4));
        category5.setText(data.get(5));
        category6.setText(data.get(6));

        instance=new GetNews();
        instance.execute();
    }

    @SuppressLint({"ResourceAsColor", "NonConstantResourceId"})
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.category1:
                if(category1.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(7);
                    Toast.makeText(this,"opening Opinion news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }
                break;
            case R.id.category2:
                if(category2.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(8);
                    Toast.makeText(this,"opening World news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }
                break;
            case R.id.category3:
                if(category3.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(9);
                    Toast.makeText(this,"opening US Business news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }
                break;
            case R.id.category4:
                if(category4.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(10);
                    Toast.makeText(this,"opening Markets news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }

                break;
            case R.id.category5:
                if(category5.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(11);
                    Toast.makeText(this,"opening Technology news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }

                break;
            case R.id.category6:
                if(category6.getCurrentTextColor() == ContextCompat.getColor(this,R.color.color4))
                {
                    category6.setTextColor(ContextCompat.getColor(this, R.color.color2));
                    category1.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category2.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category3.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category4.setTextColor(ContextCompat.getColor(this, R.color.color4));
                    category5.setTextColor(ContextCompat.getColor(this, R.color.color4));

                    category=data.get(12);
                    Toast.makeText(this,"opening Life Style news",Toast.LENGTH_SHORT).show();
                    newsItems.clear();
                    instance=new GetNews();
                    instance.execute();
                }
                break;
            default:
                break;
        }

    }



    @SuppressLint("StaticFieldLeak")
    public class GetNews extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected Void doInBackground(Void... voids)
        {
                InputStream inputStream=getInputStream(category);
                if(null != inputStream)
                {
                    try
                    {
                        initXMLPullParser(inputStream);
                    }
                    catch (IOException | XmlPullParserException e)
                    {
                        e.printStackTrace();
                    }
                }
            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            adapter.setNewsItem(newsItems);
        }

        private InputStream getInputStream(String category)
        {
            try
            {
                URL url=new URL(category);
                HttpURLConnection connection=(HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoInput(true);
                return connection.getInputStream();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return null;
        }
        private void initXMLPullParser(InputStream inputStream) throws XmlPullParserException, IOException
        {

            XmlPullParser parser= Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES,false);
            parser.setInput(inputStream,null);
            parser.next();
            parser.require(XmlPullParser.START_TAG,null,"rss");
            while(parser.next() != XmlPullParser.END_TAG)
            {
                if(parser.getEventType() != XmlPullParser.START_TAG)
                {
                    continue;
                }
                parser.require(XmlPullParser.START_TAG,null,"channel");
                while(parser.next() != XmlPullParser.END_TAG)
                {
                    if(parser.getEventType() != XmlPullParser.START_TAG)
                    {
                        continue;
                    }
                    String tagName1=parser.getName();
                    if(tagName1.equals("item"))
                    {
                        parser.require(XmlPullParser.START_TAG,null,"item");
                        String title="";
                        String description="";
                        String link="";
                        String pubDate="";
                        while(parser.next() != XmlPullParser.END_TAG)
                        {
                            if(parser.getEventType() != XmlPullParser.START_TAG)
                            {
                                continue;
                            }
                            String tagName2=parser.getName();
                            if(tagName2.equals("title"))
                            {
                               title=getContent(parser,"title");
                            }
                            else if(tagName2.equals("description"))
                            {
                                description=getContent(parser,"description");
                            }
                            else if(tagName2.equals("link"))
                            {
                                link=getContent(parser,"link");
                            }
                            else if(tagName2.equals("pubDate"))
                            {
                                pubDate=getContent(parser,"pubDate");
                            }
                            else
                            {
                                skipTag(parser);
                            }
                        }
                        NewsItem item=new NewsItem(title,description,link,pubDate);
                        newsItems.add(item);
                    }
                    else
                    {
                        skipTag(parser);
                    }
                }
            }

        }
        private String getContent(XmlPullParser parser,String tagName) throws XmlPullParserException, IOException
        {
            String content="";
            parser.require(XmlPullParser.START_TAG,null,tagName);
            if(parser.next() == XmlPullParser.TEXT)
            {
                content=parser.getText();
                parser.next();
            }
            return content;
        }
        private void skipTag(XmlPullParser parser) throws XmlPullParserException, IOException {
            if(parser.getEventType() != XmlPullParser.START_TAG)
            {
                throw  new IllegalStateException();
            }
            int number=1;
            while(number != 0)
            {
                switch (parser.next())
                {
                    case XmlPullParser.START_TAG:
                        number++;
                        break;
                    case XmlPullParser.END_TAG:
                        number--;
                        break;
                    default:
                        break;
                }
            }
        }


    }

    /*
    @Override
    public void onBackPressed()
    {
        Intent intent=new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

     */

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if(instance !=null && !instance.isCancelled())
        {
            instance.cancel(true);
        }
    }
}