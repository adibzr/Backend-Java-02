package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

import java.io.File;
import java.util.List;

public class UserGenerator {

    private static String file = "src/main/resources/Users.json";

    public static List<User> generateUsers() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = null;
        try {
            users = objectMapper.readValue(new File(file), new TypeReference<List<User>>(){});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
