/**
 * Created by Sebastian on 2/10/2018.
 */

var headlineResults;

$(document).ready(function () {
    $.ajax({
               url: 'https://newsapi.org/v2/top-headlines?country=us&apiKey=02bf1846383545c1ac73cb362917ec99',
               type: 'GET',
               success: function (data) {
                   headlineResults = data;
               }
           });

  /*  $.ajax({
               url: '/retrieveNews',
               type: 'POST',
               contentType: 'application/json',
               dataType   : 'json',
               data: headlineResults,
               success: function (data) {
                   alert(data);
               }
           });*/
});