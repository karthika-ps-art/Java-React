import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServicesTest {
    
    @Test
    void testExternalApi()
    {
        //mock obj created
        ExternalApi externalApi=mock(ExternalApi.class);

        //Stub method
        when(externalApi.getData()).thenReturn("Mock Data");

        //Inject the mock into service
        MyServices service=new MyServices(externalApi);

        //call service
        String result=service.fetchData();

        //Verify
        assertEquals("Mock Data",result);
    }
}
