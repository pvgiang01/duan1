package com.example.project1group3.model;

public class ThongBaoModel {
    private String maThongBao, tieuDe, noiDung;

    public ThongBaoModel() {
    }

    public ThongBaoModel(String maThongBao, String tieuDe, String noiDung) {
        this.maThongBao = maThongBao;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
    }

    public String getMaThongBao() {
        return maThongBao;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }
}
