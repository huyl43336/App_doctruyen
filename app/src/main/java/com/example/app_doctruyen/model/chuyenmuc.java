package com.example.app_doctruyen.model;

public class chuyenmuc {
    private String tenchuyenmuc;

    public chuyenmuc(String tenchuyenmuc, int hinhanhchuyenmuc) {
        this.tenchuyenmuc = tenchuyenmuc;
        this.hinhanhchuyenmuc = hinhanhchuyenmuc;
    }

    public String getTenchuyenmuc() {
        return tenchuyenmuc;
    }

    public void setTenchuyenmuc(String tenchuyenmuc) {
        this.tenchuyenmuc = tenchuyenmuc;
    }

    public int getHinhanhchuyenmuc() {
        return hinhanhchuyenmuc;
    }

    public void setHinhanhchuyenmuc(int hinhanhchuyenmuc) {
        this.hinhanhchuyenmuc = hinhanhchuyenmuc;
    }

    private int hinhanhchuyenmuc;


}