package com.abc.notification3admin;

import static com.abc.notification3admin.constant.CONTENT_TYPE;
import static com.abc.notification3admin.constant.SERVER_KEY;

import com.abc.notification3admin.modal.PushNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @Headers({"Authorization: key=" + SERVER_KEY, "Content-Type:" + CONTENT_TYPE})
    @POST("fcm/send")
    Call<PushNotification> sendNotification(@Body PushNotification notification);
}
