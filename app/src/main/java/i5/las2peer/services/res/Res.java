package i5.las2peer.services.res;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * 276
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("res")
@ManualDeployment
public class Res extends RESTService {





  public Res() {
	super();
    // read and set properties values
    setFieldValues();
    
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "276", version = "0.0.0",
          description = "",
          termsOfService = "",
          contact = @Contact(name = "", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/GHProjectsTest/microservice-276/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final Res service = (Res) Context.getCurrent().getService();

      /**
   * 
   * gettest
   *
   * 
   *
   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/test")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "res")
  })
  @ApiOperation(value = "gettest", notes = " ")
  public Response gettest() {




     
    // service method invocations

     




    // res
    boolean res_condition = true;
    if(res_condition) {
      JSONObject res = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_OK).entity(res.toJSONString()).build();
    }
    return null;
  }

  /**
   * 
   * postDishRating
   *
   * 
   * @param body  a JSONObject
   * @param id  a String

   * 
   * @return Response 
   * 
   */
  @POST
  @Path("/dishes/{id}/ratings2")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "not_found"),
       @ApiResponse(code = HttpURLConnection.HTTP_CREATED, message = "created"),
       @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "bad_request")
  })
  @ApiOperation(value = "postDishRating", notes = " ")
  public Response postDishRating(String body, @PathParam("id") String id) {
    JSONObject body_JSON = (JSONObject) JSONValue.parse(body);




     
    // service method invocations

     




    // not_found
    boolean not_found_condition = true;
    if(not_found_condition) {
      JSONObject not_found = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(not_found.toJSONString()).build();
    }
    // created
    boolean created_condition = true;
    if(created_condition) {
      JSONObject created = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_CREATED).entity(created.toJSONString()).build();
    }
    // bad_request
    boolean bad_request_condition = true;
    if(bad_request_condition) {
      JSONObject bad_request = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity(bad_request.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}
