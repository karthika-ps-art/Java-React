public class Service {
    
    private ExternalApi externalApi;

    public Service(ExternalApi externalApi)
    {
        this.externalApi=externalApi;
    }

    public void fetchData()
    {
        externalApi.getData();
    }
}
