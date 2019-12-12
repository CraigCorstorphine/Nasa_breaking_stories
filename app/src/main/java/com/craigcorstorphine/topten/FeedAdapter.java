package com.craigcorstorphine.topten;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FeedAdapter extends ArrayAdapter {
    private static final String TAG = "FeedAdapter";
    private final int layoutReasource;
    private final LayoutInflater layoutInflater;
    private List<FeedEntry> application;

    public FeedAdapter(Context context, int resource, List<FeedEntry> application) {
        super(context, resource);
        this.layoutReasource = resource;
        this.layoutInflater = LayoutInflater.from(context);
        this.application = application;
    }

    @Override
    public int getCount() {
        return application.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(layoutReasource, parent, false);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

//        TextView tvName =  convertView.findViewById(R.id.tvName);
//        TextView tvArtist =  convertView.findViewById(R.id.tvArtist);
//        TextView tvSummary =  convertView.findViewById(R.id.tvSummary);

        FeedEntry currentApp = application.get(position);

        viewHolder.tvTitle.setText(currentApp.getTitle());
        viewHolder.tvLink.setText(currentApp.getLink());
        viewHolder.tvDescrition.setText(currentApp.getSummery());


        return convertView;
    }

    private class ViewHolder {
        final TextView tvTitle;
        final TextView tvLink;
        final TextView tvDescrition;


        ViewHolder(View v) {
            this.tvTitle = v.findViewById(R.id.tvTitle);
            this.tvLink = v.findViewById(R.id.tvLink);
            this.tvDescrition = v.findViewById(R.id.tvDescrition);

        }
    }

}



