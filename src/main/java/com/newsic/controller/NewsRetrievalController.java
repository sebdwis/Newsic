package com.newsic.controller;

import com.newsic.facade.NewsApiFacade;
import com.newsic.service.NewsRetrievalService;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sebastian on 2/10/2018.
 */
@RestController
public class NewsRetrievalController {

  NewsRetrievalService newsRetrievalService = new NewsRetrievalService();

  @RequestMapping(value = "/retrieveNews", method = RequestMethod.POST)
  public @ResponseBody String retrieveNews(@RequestBody NewsApiFacade newsApiFacade, HttpServletRequest request) {
    return newsRetrievalService.retrieveNews(newsApiFacade);
  }

}
