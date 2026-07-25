import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {
    
    @Test
    void testVerifyInteraction()
    {
        //Arrange
        ExternalApi externalApi=mock(ExternalApi.class);
        Service service=new Service(externalApi);
        //Act
        service.fetchData();
        //Assert
        verify(externalApi).getData();

        // verify(externalApi, times(n)).getData(); -- exactly n times
        // verify(externalApi,never()).getData; -- getData() should never be called
        // atLeastOnce()
    }
}
