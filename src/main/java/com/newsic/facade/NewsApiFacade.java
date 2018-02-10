package com.newsic.facade;

import java.util.List;

/**
 * Created by Sebastian on 2/10/2018.
 */
public class NewsApiFacade {
  private String status;
  private Integer totalResults;
  private List<ArticleFacade> articles;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public List<ArticleFacade> getArticles() {
    return articles;
  }

  public void setArticles(List<ArticleFacade> articles) {
    this.articles = articles;
  }
}
