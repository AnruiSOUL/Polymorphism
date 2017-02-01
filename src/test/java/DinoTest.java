import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class DinoTest {
    Dino pet;

    @Before
    public void setUp(){
        pet = new Dino("Ham");
    }

    @Test
    public void speakTest(){
        String expected = "You could lose everything if you push git right";
        String actual = pet.speak();
        Assert.assertEquals("Expected 'You could lose everything if you push git right' to return", expected,actual);
    }
}
