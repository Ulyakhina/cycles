import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.service.RestService;

public class RestServiceTest {

    @ParameterizedTest
   // @CsvSource({
    //        "3,10000,3000,20000",
     //       "2,100000,60000,150000"
   // })
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void shouldCalcMonth(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

  //  @Test
   // public void shouldCalcAnotherMonth() {
    //    RestService service = new RestService();
    //
    //    int expected = 2;
     //   int actual = service.calculate(100_000, 60_000, 150_000);

     //   Assertions.assertEquals(expected, actual);
  //  }
}
