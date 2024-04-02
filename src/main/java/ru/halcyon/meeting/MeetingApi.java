package ru.halcyon;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MeetingApi {
    @POST("/api/v1/meetings/create")
    Call<MeetingInfo> createMeeting(@Body CreateMeetingRequest request);

    @GET("/api/v1/meetings/get/{meetingId}")
    Call<MeetingInfo> getMeetingById(@Path("meetingId") Long meetingId);
}
