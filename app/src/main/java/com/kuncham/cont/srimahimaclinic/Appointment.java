package com.kuncham.cont.srimahimaclinic;

/**
 * Created by abc on 2/27/2018.
 */

class Appointment {

    int reg_no;
    String date;
    String patient_name;
    String appoinment_time;
    String disease;

    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getAppoinment_time() {
        return appoinment_time;
    }

    public void setAppoinment_time(String appoinment_time) {
        this.appoinment_time = appoinment_time;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }


}
