package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";
    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldHandleNullInput() {
    String result = greeter.greet(null);
    assertThat(result, is("Hello, stranger!"));
  }

  @Test
  public void greetShouldHandleEmptyInput() {
    String result = greeter.greet("   ");
    assertThat(result, is("Hello, stranger!"));
  }

  @Test
  public void greetWithTimeShouldIncludeGreetingAndName() {
    String someone = "Alice";
    String result = greeter.greetWithTime(someone);
    assertThat(result, containsString("Alice"));
    assertThat(result, anyOf(
        containsString("Good morning"),
        containsString("Good afternoon"),
        containsString("Good evening")
    ));
  }

  @Test
  public void greetWithTimeShouldHandleNull() {
    String result = greeter.greetWithTime(null);
    assertThat(result, containsString("friend"));
  }

  @Test
  public void farewellShouldReturnProperMessage() {
    String result = greeter.farewell("Bob");
    assertThat(result, is("Goodbye, Bob. Take care!"));
  }

  @Test
  public void farewellShouldHandleNull() {
    String result = greeter.farewell(null);
    assertThat(result, is("Goodbye, friend. Take care!"));
  }

  @Test
  public void greetingHistoryShouldTrackMessages() {
    greeter.greet("Alice");
    greeter.farewell("Alice");
    List<String> history = greeter.getGreetingHistory();

    assertThat(history.size(), is(2));
    assertThat(history.get(0), containsString("Hello, Alice"));
    assertThat(history.get(1), containsString("Goodbye, Alice"));
  }

  @Test
  public void clearGreetingHistoryShouldRemoveAllMessages() {
    greeter.greet("Alice");
    greeter.farewell("Bob");
    greeter.clearGreetingHistory();
    List<String> history = greeter.getGreetingHistory();

    assertThat(history.size(), is(0));
  }
}
