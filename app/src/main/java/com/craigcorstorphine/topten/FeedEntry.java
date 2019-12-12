package com.craigcorstorphine.topten;

public class FeedEntry {

    private String title;
    private String link;
    private String description;
    private String summery;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "name='" + title + '\n' +
                ", artist='" + link + '\n' +
                ", releaseDate='" + description + '\n' +

                ", imageUrl=" + imageUrl + '\n';

    }
}
