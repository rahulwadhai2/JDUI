package com.jg.jg.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Trust on 30-06-2016.
 */
public class DashBoardModel implements Parcelable {


    String ref;
    String customerName;
    String zipCode;
    String dateSold;
    String customerId;
    String jobPacket;
    String category;
    String status;
    String notes;

    public DashBoardModel() {}

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDateSold() {
        return dateSold;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getJobPacket() {
        return jobPacket;
    }

    public void setJobPacket(String jobPacket) {
        this.jobPacket = jobPacket;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public DashBoardModel(Parcel in) {
        setRef(in.readString());
        setCustomerName(in.readString());
        setZipCode(in.readString());
        setDateSold(in.readString());
        setCustomerId(in.readString());
        setJobPacket(in.readString());
        setCategory(in.readString());
        setStatus(in.readString());
        setNotes(in.readString());
    }

    public static final Creator<DashBoardModel> CREATOR = new Creator<DashBoardModel>() {
        @Override
        public DashBoardModel createFromParcel(Parcel in) {
            return new DashBoardModel(in);
        }

        @Override
        public DashBoardModel[] newArray(int size) {
            return new DashBoardModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(ref);
      dest.writeString(customerName);
      dest.writeString(zipCode);
      dest.writeString(dateSold);
      dest.writeString(customerId);
      dest.writeString(jobPacket);
      dest.writeString(category);
      dest.writeString(status);
      dest.writeString(notes);
    }
}
