package lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class AutoGrade {

  @Test
  public void testConstructorExists() {
    try {
      Constructor<?> constructor = Scoreboard.class.getConstructor(String.class, String.class);
      assertNotNull(constructor);
    } catch(NoSuchMethodException ex) {
      fail("Constructor Scoreboard(String, String) not found");
    }
  }

  @Test
  public void testGetScoreMethodExists() {
    try {
      Method getScoreMethod = Scoreboard.class.getMethod("getScore");
      assertNotNull(getScoreMethod);
    } catch (NoSuchMethodException e) {
      fail("Method getScore() not found");
    }
  }

  @Test
  public void testRecordPlayMethodExists() {
    try {
      Method recordPlay = Scoreboard.class.getMethod("recordPlay", int.class);
      assertNotNull(recordPlay);
    } catch (NoSuchMethodException e) {
      fail("Method recordPlay(int) not found");
    }
  }

  @Test
  public void testFieldAllPrivate() {
    Field[] fields = Scoreboard.class.getDeclaredFields();
    for(Field field : fields) {
      if(!Modifier.isPrivate(field.getModifiers())) {
        fail("Field " + field.getName() + " is not private");
      }
    }
  }

  @Test
  public void testRecordPlay() {
    Scoreboard scoreboard = new Scoreboard("Team A", "Team B");
        
    // Test scoring for Team A
    scoreboard.recordPlay(3);
    assertEquals("3-0-Team A", scoreboard.getScore(), "recordPlay() funcitons wrong");
        
    // Test switching to Team B
    scoreboard.recordPlay(0);
    assertEquals("3-0-Team B", scoreboard.getScore(), "recordPlay() funcitons wrong");
        
    // Test scoring for Team B
    scoreboard.recordPlay(2);
    assertEquals("3-2-Team B", scoreboard.getScore(), "recordPlay() funcitons wrong");
        
    // Test switching back to Team A and scoring
    scoreboard.recordPlay(0);
    scoreboard.recordPlay(1);
    assertEquals("4-2-Team A", scoreboard.getScore(), "recordPlay() funcitons wrong");
  }

  @Test
  public void testGetMatchesMethodExists() {
    try {
      Method getMatches = Scoreboard.class.getMethod("getMatches");
      assertNotNull(getMatches);
    } catch (NoSuchMethodException e) {
      fail("Method getMatches() not found");
    }
  }

  @Test
  public void testStaticMatches() {
    Scoreboard scoreboard1 = new Scoreboard("Team A", "Team B");
    Scoreboard scoreboard2 = new Scoreboard("Team1", "Team2");

    for(int i = 0; i < 10; i++) {
      scoreboard1.recordPlay(i);
    }

    for(int i = 0; i < 5; i++) {
      scoreboard2.recordPlay(i);
    }

    assertEquals(15, scoreboard1.getMatches(), "getMatches() functions wrong");
    assertEquals(15, scoreboard2.getMatches(), "getMatches() functions wrong");
  }
  

  


}
