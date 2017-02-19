package com.pranshudave.recyclerviewtutorials.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pranshudave.recyclerviewtutorials.R;
import com.pranshudave.recyclerviewtutorials.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranshu on 18/2/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    public ItemClickCallback itemClickCallback;
    private List<ListItem> listData;
    private LayoutInflater inflater;

    public DerpAdapter(List<ListItem> listData, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.listData = listData;
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubtitle());
        if (item.isFavourite()) {
            holder.secondayicon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondayicon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }
    }

    public void setListData(ArrayList<ListItem> exerciseList) {
        this.listData.clear(); //empties the arrayList
        this.listData.addAll(exerciseList); //copies the content of exerciseList to listData
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public interface ItemClickCallback {
        void onItemClick(int p);

        void onSecondaryIconClick(int p);
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView subTitle;
        private ImageView thumbnail;
        private ImageView secondayicon;
        private View container; //For LinearLayout

        public DerpHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.ibl_item_text);
            subTitle = (TextView) itemView.findViewById(R.id.ibl_item_sub_title);
            thumbnail = (ImageView) itemView.findViewById(R.id.im_item_icon);
            secondayicon = (ImageView) itemView.findViewById(R.id.im_item_icon_secondary);
            secondayicon.setOnClickListener(this); //please elaborate on passing this as a parameter
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cont_item_root) {
                itemClickCallback.onItemClick(getAdapterPosition());
            } else {
                itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }

    }
}
