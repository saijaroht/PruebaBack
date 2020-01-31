package com.solidus.profile.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "portfolio", schema = "zemoga_test_db")
public class Portfolio {

    @Id
    @Column(name = "idportfolio")
    private int idPortfolio;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "twitter_user_name")
    private String twitterUserName;

    @Column(name = "title")
    private String title;

    public int getIdPortfolio() {
        return idPortfolio;
    }

    public void setIdPortfolio(int idportfolio) {
        this.idPortfolio = idportfolio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTwitterUserName() {
        return twitterUserName;
    }

    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portfolio that = (Portfolio) o;
        return idPortfolio == that.idPortfolio &&
                Objects.equals(description, that.description) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(twitterUserName, that.twitterUserName) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPortfolio, description, imageUrl, twitterUserName, title);
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "idPortfolio=" + idPortfolio +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", twitterUserName='" + twitterUserName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
