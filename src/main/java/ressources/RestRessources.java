package ressources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("hello")
public class RestRessources {
    @GET
    public String HelloSecure(){
        return "Hello there";
    }

    @GET
    @Path("/NonSecure")
    public String HelloNonSecure(){
        return "Hello from Non Secure";
    }

}
