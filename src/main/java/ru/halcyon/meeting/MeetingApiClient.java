package ru.halcyon;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class MeetingApiClient {
    private static final String BASE_URL = "http://127.0.0.1:8080";
    private static MeetingApi meetingApi;

    public static MeetingApi getMeetingApi() {
        if (meetingApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            meetingApi = retrofit.create(MeetingApi.class);
        }

        return meetingApi;
    }

    public MeetingInfo createMeeting(CreateMeetingRequest request) {
        try {
            Response<MeetingInfo> response = getMeetingApi().createMeeting(request).execute();
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MeetingInfo getMeetingById(Long meetingId) {
        try {
            Response<MeetingInfo> response = getMeetingApi().getMeetingById(meetingId).execute();
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
