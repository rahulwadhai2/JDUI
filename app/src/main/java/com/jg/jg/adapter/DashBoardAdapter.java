package com.jg.jg.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jg.jg.R;
import com.jg.jg.model.DashBoardModel;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoardHolders> {

    Context mContext;
    ArrayList<DashBoardModel> mDashBoardModels;
    public DashBoardAdapter(Context context, ArrayList<DashBoardModel> dashBoardModels) {

        this.mContext = context;
        this.mDashBoardModels = dashBoardModels;

    }

    @Override
    public DashBoardHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_dashboard, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        return new DashBoardHolders(layoutView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final DashBoardHolders holder, final int position) {


        if (mDashBoardModels.get(position).getRef()!=null){
        holder.textViewRef.setText(mDashBoardModels.get(position).getRef());

        }else {
            holder.textViewRef.setText("");
        }


        if (mDashBoardModels.get(position).getCustomerName()!=null){
            holder.textViewCustomerName.setText(mDashBoardModels.get(position).getCustomerName());

        }else {
            holder.textViewCustomerName.setText("");
        }


        if (mDashBoardModels.get(position).getZipCode()!=null){
            holder.textViewZipCode.setText(mDashBoardModels.get(position).getZipCode());

        }else {
            holder.textViewZipCode.setText("");
        }


        if (mDashBoardModels.get(position).getDateSold()!=null){
            holder.textViewDateSold.setText(mDashBoardModels.get(position).getDateSold());

        }else {
            holder.textViewZipCode.setText("");
        }


        if (mDashBoardModels.get(position).getCustomerId()!=null){
            holder.textViewCustomerIdJob.setText(mDashBoardModels.get(position).getCustomerId());

        }else {
            holder.textViewCustomerIdJob.setText("");
        }

        if (mDashBoardModels.get(position).getJobPacket()!=null){
            holder.textViewJobPacket.setText(mDashBoardModels.get(position).getJobPacket());

        }else {
            holder.textViewJobPacket.setText("");
        }

        if (mDashBoardModels.get(position).getCategory()!=null){
            holder.textViewCategory.setText(mDashBoardModels.get(position).getCategory());

        }else {
            holder.textViewCategory.setText("");
        }

        if (mDashBoardModels.get(position).getStatus()!=null){
            holder.textViewStatus.setText(mDashBoardModels.get(position).getStatus());

        }else {
            holder.textViewStatus.setText("");
        }

        if (mDashBoardModels.get(position).getNotes()!=null){
            holder.textViewNotes.setText(mDashBoardModels.get(position).getNotes());

        }else {
            holder.textViewNotes.setText("");
        }

    }

    @Override
    public int getItemCount() {
        return mDashBoardModels.size();
    }

    public static final class DashBoardHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewRef;
        TextView textViewCustomerName;
        TextView textViewZipCode;
        TextView textViewDateSold;
        TextView textViewCustomerIdJob;
        TextView textViewJobPacket;
        TextView textViewCategory;
        TextView textViewStatus;
        TextView textViewNotes;

        public DashBoardHolders(View itemView) {
            super(itemView);

            textViewRef = (TextView) itemView.findViewById(R.id.textViewRef_Id);
            textViewCustomerName = (TextView) itemView.findViewById(R.id.textViewCustomerName_Id);
            textViewZipCode = (TextView) itemView.findViewById(R.id.textViewZipCode_Id);
            textViewDateSold = (TextView) itemView.findViewById(R.id.textViewDateSold_Id);
            textViewCustomerIdJob = (TextView) itemView.findViewById(R.id.textViewCustomerIdJob_Id);
            textViewJobPacket = (TextView) itemView.findViewById(R.id.textViewJobPacket_Id);
            textViewCategory = (TextView) itemView.findViewById(R.id.textViewCategory_Id);
            textViewStatus = (TextView) itemView.findViewById(R.id.textViewStatus_Id);
            textViewNotes = (TextView) itemView.findViewById(R.id.textViewNotes_Id);

        }
        @Override
        public void onClick(final View view) {}
    }
}
