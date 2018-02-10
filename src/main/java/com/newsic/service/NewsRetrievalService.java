package com.newsic.service;

import com.newsic.facade.NewsApiFacade;

/**
 * Created by Sebastian on 2/10/2018.
 */
public class NewsRetrievalService {
  public String retrieveNews(NewsApiFacade newsApiFacade) {
    String firstTitle = newsApiFacade.getArticles().get(0).getTitle();
    return firstTitle;
  }
}
