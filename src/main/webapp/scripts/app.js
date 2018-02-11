/**
 * Created by Sebastian on 2/10/2018.
 */

var headlineResults, titles, sentiment, song;

$(document).ready(function () {
    $.ajax({
               url: 'https://newsapi.org/v2/top-headlines?country=us&apiKey=02bf1846383545c1ac73cb362917ec99',
               type: 'GET',
               async: false,
               success: function (data) {
                   headlineResults = data;
               }
           });

    $.ajax({
               url: '/generateTitles',
               type: 'POST',
               contentType: 'application/json; charset=UTF-8',
               dataType   : 'json',
               data: JSON.stringify(headlineResults),
               async: false,
               success: function (data) {
                   titles = data;
               }
           });

    $.ajax({
               url: 'https://apiv2.indico.io/sentimenthq',
               type: 'POST',
               dataType: 'json',
               async: false,
               data: JSON.stringify({
                                        'api_key': "2e3b119cad349277d0f365a9b051c0f5",
                                        'data': "" + titles
                                    }),
               success: function (result) {
                   sentiment = result.results;
               }
           });

    $.ajax({
               url: '/generateSong?sentiment=' + sentiment,
               type: 'GET',
               async: false,
               success: function (data) {
                   song = data;
                   $( ".results" ).append( data );

               }
           });
});