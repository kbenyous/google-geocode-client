package fr.kben.google.geocode;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.kben.google.geocode.response.GeocodeResponse;

public class GeocodingServiceTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGeocode() {
			GeocodingService gs = new GeocodingService();
			GeocodeResponse gr =gs.geocode("Mairie de paris");
			JAXBContext ctx;
			try {
				ctx=JAXBContext.newInstance(GeocodeResponse.class);
				Marshaller m =ctx.createMarshaller();
				
				 m.marshal(gr,System.out);
			} catch (JAXBException e) {
//				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
	}

}
