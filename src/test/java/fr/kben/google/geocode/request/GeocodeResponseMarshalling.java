package fr.kben.google.geocode.request;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.kben.google.geocode.response.GeocodeResponse;


public class GeocodeResponseMarshalling {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		JAXBContext ctx;
		try {
			ctx=JAXBContext.newInstance(GeocodeResponse.class);
			Unmarshaller m =ctx.createUnmarshaller();
			InputStream is=Thread.currentThread().getContextClassLoader().getResourceAsStream("geocodesample.xml");
			GeocodeResponse gr = (GeocodeResponse) m.unmarshal(is);
			gr.toString();
		} catch (JAXBException e) {
//			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
