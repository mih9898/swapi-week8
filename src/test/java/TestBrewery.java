import com.brewery.Brewery;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author mturchanov
 */
public class TestBrewery {
    @Test
    public void testOpenBreweryJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.openbrewerydb.org/breweries/5494");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Brewery brewery = mapper.readValue(response, Brewery.class);
        String expectedBreweryName = "MadTree Brewing";
        String expectedBreweryStreet = "3301 Madison Rd";
        String expectedBreweryCity = "Cincinnati";
        String expectedBreweryState = "Ohio";

        assertEquals(expectedBreweryName, brewery.getName());
        assertEquals(expectedBreweryStreet, brewery.getStreet());
        assertEquals(expectedBreweryCity, brewery.getCity());
        assertEquals(expectedBreweryState, brewery.getState());

    }
}
