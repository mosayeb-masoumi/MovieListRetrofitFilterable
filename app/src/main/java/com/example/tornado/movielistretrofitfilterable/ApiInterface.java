package com.example.tornado.movielistretrofitfilterable;

/**
 * Created by Tornado on 6/29/2018.
 */
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("volley_array.json")
    Call<List<Movie>> getMovies();
}

