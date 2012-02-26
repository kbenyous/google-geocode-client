//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.24 at 04:31:58 PM CET 
//


package fr.kben.google.geocode.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.kben.org/google-geocode}Location"/>
 *         &lt;element name="location_type" type="{http://www.kben.org/google-geocode}LocationType"/>
 *         &lt;element name="viewport" type="{http://www.kben.org/google-geocode}Viewport"/>
 *         &lt;element name="bounds" type="{http://www.kben.org/google-geocode}Viewport"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometry", propOrder = {
    "location",
    "locationType",
    "viewport",
    "bounds"
})
public class Geometry {

    @XmlElement(required = true)
    protected Location location;
    @XmlElement(name = "location_type", required = true)
    protected LocationType locationType;
    @XmlElement(required = true)
    protected Viewport viewport;
    @XmlElement(required = true)
    protected Viewport bounds;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationType(LocationType value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the viewport property.
     * 
     * @return
     *     possible object is
     *     {@link Viewport }
     *     
     */
    public Viewport getViewport() {
        return viewport;
    }

    /**
     * Sets the value of the viewport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Viewport }
     *     
     */
    public void setViewport(Viewport value) {
        this.viewport = value;
    }

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link Viewport }
     *     
     */
    public Viewport getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Viewport }
     *     
     */
    public void setBounds(Viewport value) {
        this.bounds = value;
    }

}