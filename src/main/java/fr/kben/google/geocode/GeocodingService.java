package fr.kben.google.geocode;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import fr.kben.google.geocode.response.GeocodeResponse;


@Stateless
public class GeocodingService {
	
	private Client client;
	private WebResource webResource;

	public GeocodingService(){
		client = Client.create();
		webResource = client.resource("http://maps.googleapis.com/maps/api/geocode/").path("xml").queryParam("sensor","false").queryParam("region","fr");
		webResource.accept(MediaType.APPLICATION_XML_TYPE);
	}
	
	public GeocodeResponse geocode(String addressQuery){
		return webResource.queryParam("address",addressQuery).get(GeocodeResponse.class);
	}
	
		
	
}
