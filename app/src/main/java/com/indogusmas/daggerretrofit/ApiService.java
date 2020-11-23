package com.indogusmas.daggerretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("posts")
    Call<List<ResponsePost>> getPost(
            @Query("userId") int id
    );
}
