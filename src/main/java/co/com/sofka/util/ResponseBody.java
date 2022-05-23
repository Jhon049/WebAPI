package co.com.sofka.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseBody {
    private String id;
    private String title;
    private String author;
    private String content;
    private String contentShort;
    private String publisher;
    private String publisherDate;
    private String pages;
    private String language;
    private String urlDetails;
    private String urlDownload;
    private String cover;
    private String thumbnail;
    private String numComments;
    private List<Category> categories = null;
    private List<Tag> tags = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("content_short")
    public String getContentShort() {
        return contentShort;
    }

    @JsonProperty("content_short")
    public void setContentShort(String contentShort) {
        this.contentShort = contentShort;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("publisher_date")
    public String getPublisherDate() {
        return publisherDate;
    }

    @JsonProperty("publisher_date")
    public void setPublisherDate(String publisherDate) {
        this.publisherDate = publisherDate;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("url_details")
    public String getUrlDetails() {
        return urlDetails;
    }

    @JsonProperty("url_details")
    public void setUrlDetails(String urlDetails) {
        this.urlDetails = urlDetails;
    }

    @JsonProperty("url_download")
    public String getUrlDownload() {
        return urlDownload;
    }

    @JsonProperty("url_download")
    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("num_comments")
    public String getNumComments() {
        return numComments;
    }

    @JsonProperty("num_comments")
    public void setNumComments(String numComments) {
        this.numComments = numComments;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
