package com.mhmmdyldi.retrofitsample;

import com.mhmmdyldi.retrofitsample.dataTwitter.OAuthToken;
import com.mhmmdyldi.retrofitsample.dataTwitter.UserDetails;
import com.mhmmdyldi.retrofitsample.model.CalorieDto;
import com.mhmmdyldi.retrofitsample.model.GetCaloriesRequestDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TwitterApi {

//    String baseUrl = "https://api.twitter.com/";
    String baseUrl = "http://calorie.tannour-app.com/api/";
//    String baseUrl = "http://ws.e-tapesh.com/api/";

    @FormUrlEncoded
    @POST("oauth2/token")
    Call<OAuthToken> postCredentials(@Field("grant_type") String grantType);

    @GET("/1.1/users/show.json")
    Call<UserDetails> getUserDetails(@Query("screen_name") String name);

    @POST("calorie")
    Call<CalorieDto> getCalorie(@Body GetCaloriesRequestDto requestDto);
}
