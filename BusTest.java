import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus01;
  Person person;

  @Before
  public void before() {
    bus01 = new Bus(1);
  }

  @Test
  public void hasNumber() {
    assertEquals(1, bus01.getNumber());
  }

  @Test
  public void passengersStartEmpty() {
    assertEquals(0, bus01.passengerCount());
  }

  @Test
  public void canAddPassenger() {
    bus01.add(person);
    assertEquals(1, bus01.passengerCount());
  }


}