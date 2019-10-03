package com.zensar.webservices.user;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserProfileService {
@POST
@Path("/add")
@Produces(MediaType.TEXT_HTML)
public Response addUser(@FormParam("clientName")String name,@FormParam("gender")String gender,@FormParam("age")int age)
{
	return Response.status(200).entity("<p>new user record is added.</p><br>Name: "+name+"<br>Age: "+age+"<br>Gender: "+gender).build();
}
	
}
