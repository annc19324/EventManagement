/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.Event;
import model.User;

/**
 *
 * @author annc1
 */
public class Session {
    private static User loggedInUser;
    private static final List<Event> registeredEvents = new ArrayList<>();

    private Session() {
        // Private constructor để ngăn tạo instance
    }

    //lam moi 
    public static void clear() {
        loggedInUser = null;
        registeredEvents.clear();
    }

    public static void setLoggedInUser(User user) {
        loggedInUser = user;
    }

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public static void addRegisteredEvent(Event event) {
        registeredEvents.add(event);
    }
    
    public static void removeRegisteredEventById(String eventId) {
    registeredEvents.removeIf(event -> event.getEventId().equals(eventId));
}

    //tra ve danh sachc da dang ky
    public static List<Event> getRegisteredEvents() {
        return registeredEvents;
    }
}
