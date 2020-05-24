package ru.itis.users.entries;

import lombok.Data;

import java.util.List;

@Data
public class InfoUsersResponse {
    private List<InfoUsersRecord> items;
}
