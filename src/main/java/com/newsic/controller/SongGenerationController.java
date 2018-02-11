package com.newsic.controller;

import com.newsic.facade.NewsApiFacade;
import com.newsic.service.SongGenerationService;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sebastian on 2/10/2018.
 */
@RestController
public class SongGenerationController {

  SongGenerationService songGenerationService = new SongGenerationService();

  @RequestMapping(value = "/generateTitles", method = RequestMethod.POST)
  public @ResponseBody String generateTitles(@RequestBody NewsApiFacade newsApiFacade,
                                           HttpServletRequest request) throws Exception {
    return songGenerationService.generateTitles(newsApiFacade);
  }

  @RequestMapping(value = "/generateSong", method = RequestMethod.GET)
  public @ResponseBody String generateSong(@RequestParam("sentiment") String sentimentString) {
    return songGenerationService.generateSong(sentimentString);
  }

}
