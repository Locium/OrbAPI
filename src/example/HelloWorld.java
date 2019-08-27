package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;


@WebService()
public class HelloWorld {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
    public static void main(String[] argv) {
        Object implementor = new HelloWorld();
        String address = "http://localhost:9000/HelloWorld";
        Endpoint.publish(address, implementor);
        System.out.println("Main is starting here ");
        RetrieveData rd = new RetrieveData();
        ArrayList a = rd.listMethod();
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }

    }
}
