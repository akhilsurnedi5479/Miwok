package com.example.akhil.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by akhil on 4/3/18.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId=colorResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord =getItem(position);

        /**
         * To add the miwok translation
         */
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());


        /**
         * To add the Default translation
         */


        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        /**
         * To add the image
         */

        ImageView imageView =(ImageView)listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        /**
         * To add the background color
         */
        //set the theme color for the list item
        View textContainer =listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        /**
         * return the whole item layout so that it can be shown in the list view
         */
        return listItemView;

    }
}
