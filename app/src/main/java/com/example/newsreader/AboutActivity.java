package com.example.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    Button button9,button10;
    String androidPortfolio="https://github.com/moahmed-raafat ";
    String motionGraphicsPortfolio="https://www.youtube.com/channel/UChZDDMfMTl51G2TZl6atzKA/videos";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        button9=findViewById(R.id.button9);
        button10=findViewById(R.id.button10);

        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,WebSiteActivity.class);
        switch (view.getId())
        {
            case R.id.button9:

                Toast.makeText(this,"opening the website",Toast.LENGTH_SHORT).show();
                intent.putExtra("link",androidPortfolio);
                this.startActivity(intent);

                break;
            case R.id.button10:

                Toast.makeText(this,"opening the website",Toast.LENGTH_SHORT).show();
                intent.putExtra("link",motionGraphicsPortfolio);
                this.startActivity(intent);

                break;
            default:
                break;
        }

    }
}