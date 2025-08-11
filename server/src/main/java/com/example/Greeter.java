package com.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to generate greetings and farewells.
 */
public class Greeter {

  private List<String> greetingHistory;

  /**
   * Constructor.
   */
  public Greeter() {
    this.greetingHistory = new ArrayList<>();
  }

  /**
   * Greets someone with a basic message.
   *
   * @param someone the name of the person
   * @return greeting message
   */
  public String greet(String someone) {
    String name = (someone == null || someone.trim().isEmpty()) ? "stranger" : someone;
    String message = String.format("Hello, %s!", name);
    greetingHistory.add(message);
    return message;
  }

  /**
   * Greets someone based on the time of day.
   *
   * @param someone the name of the person
   * @return time-based greeting
   */
  public String greetWithTime(String someone) {
    String name = (someone == null || someone.trim().isEmpty()) ? "friend" : someone;
    int hour = LocalTime.now().getHour();
    String timeGreeting;

    if (hour < 12) {
      timeGreeting = "Good morning";
    } else if (hour < 18) {
      timeGreeting = "Good afternoon";
    } else {
      timeGreeting = "Good evening";
    }

    String message = String.format("%s, %s!", timeGreeting, name);
    greetingHistory.add(message);
    return message;
  }

  /**
   * Returns a personalized farewell message.
   *
   * @param someone the name of the person
   * @return farewell message
   */
  public String farewell(String someone) {
    String name = (someone == null || someone.trim().isEmpty()) ? "friend" : someone;
    String message = String.format("Goodbye, %s. Take care!", name);
    greetingHistory.add(message);
    return message;
  }

  /**
   * Returns the greeting history.
   *
   * @return list of all greetings and farewells
   */
  public List<String> getGreetingHistory() {
    return new ArrayList<>(greetingHistory); // Return a copy to protect internal list
  }

  /**
   * Clears the greeting history.
   */
  public void clearGreetingHistory() {
    greetingHistory.clear();
  }
}
