//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.24 at 04:31:58 PM CET 
//


package fr.kben.google.geocode.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.kben.org/google-geocode}ResultType"/>
 *         &lt;element name="formatted_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address_component" type="{http://www.kben.org/google-geocode}AddressComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.kben.org/google-geocode}Geometry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "type",
    "formattedAddress",
    "addressComponent",
    "geometry"
})
public class Result {

    @XmlElement(required = true)
    protected ResultType type;
    @XmlElement(name = "formatted_address", required = true)
    protected String formattedAddress;
    @XmlElement(name = "address_component")
    protected List<AddressComponent> addressComponent;
    @XmlElement(required = true)
    protected Geometry geometry;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setType(ResultType value) {
        this.type = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the addressComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressComponent }
     * 
     * 
     */
    public List<AddressComponent> getAddressComponent() {
        if (addressComponent == null) {
            addressComponent = new ArrayList<AddressComponent>();
        }
        return this.addressComponent;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

}
