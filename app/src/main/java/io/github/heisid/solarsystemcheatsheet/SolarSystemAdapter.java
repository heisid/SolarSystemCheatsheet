package io.github.heisid.solarsystemcheatsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class SolarSystemAdapter extends RecyclerView.Adapter<SolarSystemAdapter.ListViewHolder> {
    private ArrayList<SolarSystemObject> list;

    public SolarSystemAdapter(ArrayList<SolarSystemObject> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_solarsystem, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        SolarSystemObject ssobj = list.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ssobj.getPic())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPic);
        holder.tvName.setText(ssobj.getName());
        holder.tvShortDetail.setText(ssobj.getShortDetail());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPic;
        TextView tvName, tvShortDetail;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPic = itemView.findViewById(R.id.img_pic);
            tvName = itemView.findViewById(R.id.tv_name);
            tvShortDetail = itemView.findViewById(R.id.tv_short_detail);
        }
    }
}
