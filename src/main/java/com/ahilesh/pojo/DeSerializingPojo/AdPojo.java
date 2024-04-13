package com.ahilesh.pojo.DeSerializingPojo;

public class AdPojo {

    private String company;
    private String url;
    private String text;

    @Override
    public String toString() {
        return "AdPojo{" +
                "company='" + company + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
