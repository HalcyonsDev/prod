package ru.halcyon.meeting;

import java.util.List;

public class MeetingInfo {
    private String address;
    private Long agent_id;
    private String date;
    private String documents;
    private List<String> employees;

    @Override
    public String toString() {
        return "MeetingInfo{" +
                "address='" + address + '\'' +
                ", agent_id=" + agent_id +
                ", date='" + date + '\'' +
                ", documents='" + documents + '\'' +
                ", employees=" + employees +
                '}';
    }
}
