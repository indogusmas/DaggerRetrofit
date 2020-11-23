package com.indogusmas.daggerretrofit;

import android.util.Log;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@Singleton
public class Repository {

    private  ApiService apiService;
    private  List<ResponsePost> responsePostList = new ArrayList<>();


    @Inject
    public Repository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<ResponsePost> getAll(int id){
        apiService.getPost(id)
                .enqueue(new Callback<List<ResponsePost>>() {
                    @Override
                    public void onResponse(Call<List<ResponsePost>> call, Response<List<ResponsePost>> response) {
                        Log.e("Repository", "onResponse: "+ response.body().toString() );
                         responsePostList = response.body();
                    }

                    @Override
                    public void onFailure(Call<List<ResponsePost>> call, Throwable t) {
                        Log.e("csdbcs", "onFailure: "+ t.getMessage() );
                    }
                });
        return  responsePostList;
    }


}
