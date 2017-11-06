import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NewTest {
 // @Test
  public void test_NumberOfCircuitsFor2017Season01() {
	  given().
	  when().
	  get("http://ergast.com/api/f1/2017/circuits.json").
	  then().
	  assertThat().statusCode(200).and().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
	  
  }
  
 // @Test
  public void test_NumberOfCircuitsFor2017Season02() {
	  given().
	  when().
	  get("http://ergast.com/api/f1/2017/circuits.json").
	  then().
	  assertThat().statusCode(200).and().assertThat().body("MRData.CircuitTable.Circuits.circuitId[0]", equalTo("albert_park") );
	  
  }
  
  @Test
  public void test_NumberOfCircuitsFor2017Season03() {
	  given().
	  when().
	  get("http://ergast.com/api/f1/2017/circuits.json").
	  then().
	  assertThat().statusCode(200).and().assertThat().body("MRData.CircuitTable.Circuits.circuitName[2]", equalTo("Bahrain International Circuit") );
	  
  }
}
