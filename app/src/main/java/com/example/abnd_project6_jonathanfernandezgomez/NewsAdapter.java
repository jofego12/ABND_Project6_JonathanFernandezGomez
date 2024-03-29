package com.example.abnd_project6_jonathanfernandezgomez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context mainContext, ArrayList<News> news) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(mainContext, 0, news);
    }

    public NewsAdapter(Context mainContext) {
        super(mainContext, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getSection());

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getTime());

        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());

        return listItemView;    }
}