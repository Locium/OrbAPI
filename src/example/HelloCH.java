package example;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.*;
import java.util.ArrayList;

@Path("/hello")
public class HelloCH {

    @GET
    @Path("schwiz") //path to the service
    @Produces(MediaType.TEXT_PLAIN)
    public String getclicheMessage(){
        String output = "code table: ";
        RetrieveData rd = new RetrieveData();
        ArrayList a = rd.listMethod();
        output = output + " rows: "+ a.size() + " - ";
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
            output= output+a.get(i)+',';
        }
        return output;//"Hello schwiz";
    }
}


