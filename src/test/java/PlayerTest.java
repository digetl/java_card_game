import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
   private Player player;

   @Before
    public void before() {
       player = new Player("Iain");
   }

   @Test
    public void hasName() {
       assertEquals("Iain", player.getName());
   }

   @Test
    public void handStartsEmpty() {
       assertEquals(0, player.countHand());
   }
}
