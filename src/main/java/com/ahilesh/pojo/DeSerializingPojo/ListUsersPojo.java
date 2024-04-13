package com.ahilesh.pojo.DeSerializingPojo;

import java.util.List;

public class ListUsersPojo {



    private String page;

    private String Per_page;
    private String total;

    private String total_pages;

    private List<DataPojo> data;

    private AdPojo ad;

    private SupportPojo support;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return Per_page;
    }

    public void setPer_page(String per_page) {
        Per_page = per_page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public List<DataPojo> getData() {
        return data;
    }

    public void setData(List<DataPojo> data) {
        this.data = data;
    }

    public AdPojo getAd() {
        return ad;
    }

    public void setAd(AdPojo ad) {
        this.ad = ad;
    }

    public SupportPojo getSupport() {
        return support;
    }

    public void setsupport(SupportPojo support) {
        this.support = support;
    }


    @Override
    public String toString() {
        return "ListUsersPojo{" +
                "page='" + page + '\'' +
                ", Per_page='" + Per_page + '\'' +
                ", total='" + total + '\'' +
                ", total_pages='" + total_pages + '\'' +
                ", data=" + data +
                ", ad=" + ad +
                '}';
    }
}
