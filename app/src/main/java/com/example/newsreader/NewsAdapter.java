package com.example.newsreader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    Context context;
    ArrayList<NewsItem> newsItem=new ArrayList<>();

    public void setNewsItem(ArrayList<NewsItem> newsItem) {
        this.newsItem = newsItem;
        notifyDataSetChanged();
    }

    public NewsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.news_item,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView2.setText(newsItem.get(position).getTitle());
        holder.textView3.setText(newsItem.get(position).getDescription());
        holder.textView4.setText(newsItem.get(position).getPubDate());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"opening the website",Toast.LENGTH_SHORT).show();
                String link=newsItem.get(position).getLink();
                if(link!=null)
                {
                    Intent intent=new Intent(context,WebSiteActivity.class);
                    intent.putExtra("link",link);
                    context.startActivity(intent);
                }
                else
                {
                    Toast.makeText(context,"something went wrong with the link",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public int getItemCount()
    {
        return newsItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView2,textView3;
        TextView textView4;
        CardView parent;
        RelativeLayout parent2;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView2= itemView.findViewById(R.id.textView2);
            textView3= itemView.findViewById(R.id.textView3);
            textView4= itemView.findViewById(R.id.textView4);
            parent=itemView.findViewById(R.id.parent);
            parent2=itemView.findViewById(R.id.parent2);
        }
    }

}
