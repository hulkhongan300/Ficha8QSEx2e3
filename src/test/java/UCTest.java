import org.example.UC;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UCTest {
    UC uc=new UC("Qualidade de Software");
    @ParameterizedTest
    @CsvSource({"569,10","4213,7","1323,5.6","5563,20","4524,12"})
    public void testinsertMarkUC(int numAluno,double nota){
        uc.insertMarkUC(numAluno,nota);
    }
    @Test
    public void testaverageUC(){
        assertNotEquals(0,uc.averageUC());
    }
    @ParameterizedTest
    @ValueSource(ints={234,4343,234,4213,4343})
    public void testSearchStudent(int numberoaluno){
        assertNotEquals(-1,uc.searchStudent(numberoaluno));
    }
    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    public void testISaproved(int numAluno){
        assertFalse(uc.isApproved(numAluno));
    }
}
