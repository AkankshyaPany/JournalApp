package irctc.Services;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.Ticket;
import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UserBookingService {

    private User user;

    private static final Object_Mapper=new objectMapper();

    private static final String USER_PATH= "";

    public UserBookingService userBookingService(User user1){
        this.user = user1;
        File users = new Files(USER_PATH);
        userList = ObjectMapper.readValue(users, new Typerefrence<>)

    }



}