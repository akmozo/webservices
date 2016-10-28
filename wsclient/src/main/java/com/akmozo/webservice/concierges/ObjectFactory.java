
package com.akmozo.webservice.concierges;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akmozo.webservice.concierges package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReserverAgent_QNAME = new QName("http://concierges.webservice.akmozo.com/", "reserverAgent");
    private final static QName _RechercherAgentsResponse_QNAME = new QName("http://concierges.webservice.akmozo.com/", "rechercherAgentsResponse");
    private final static QName _RechercherAgents_QNAME = new QName("http://concierges.webservice.akmozo.com/", "rechercherAgents");
    private final static QName _ReserverAgentResponse_QNAME = new QName("http://concierges.webservice.akmozo.com/", "reserverAgentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akmozo.webservice.concierges
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserverAgent }
     * 
     */
    public ReserverAgent createReserverAgent() {
        return new ReserverAgent();
    }

    /**
     * Create an instance of {@link RechercherAgentsResponse }
     * 
     */
    public RechercherAgentsResponse createRechercherAgentsResponse() {
        return new RechercherAgentsResponse();
    }

    /**
     * Create an instance of {@link RechercherAgents }
     * 
     */
    public RechercherAgents createRechercherAgents() {
        return new RechercherAgents();
    }

    /**
     * Create an instance of {@link ReserverAgentResponse }
     * 
     */
    public ReserverAgentResponse createReserverAgentResponse() {
        return new ReserverAgentResponse();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link DetailsReservation }
     * 
     */
    public DetailsReservation createDetailsReservation() {
        return new DetailsReservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://concierges.webservice.akmozo.com/", name = "reserverAgent")
    public JAXBElement<ReserverAgent> createReserverAgent(ReserverAgent value) {
        return new JAXBElement<ReserverAgent>(_ReserverAgent_QNAME, ReserverAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAgentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://concierges.webservice.akmozo.com/", name = "rechercherAgentsResponse")
    public JAXBElement<RechercherAgentsResponse> createRechercherAgentsResponse(RechercherAgentsResponse value) {
        return new JAXBElement<RechercherAgentsResponse>(_RechercherAgentsResponse_QNAME, RechercherAgentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAgents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://concierges.webservice.akmozo.com/", name = "rechercherAgents")
    public JAXBElement<RechercherAgents> createRechercherAgents(RechercherAgents value) {
        return new JAXBElement<RechercherAgents>(_RechercherAgents_QNAME, RechercherAgents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://concierges.webservice.akmozo.com/", name = "reserverAgentResponse")
    public JAXBElement<ReserverAgentResponse> createReserverAgentResponse(ReserverAgentResponse value) {
        return new JAXBElement<ReserverAgentResponse>(_ReserverAgentResponse_QNAME, ReserverAgentResponse.class, null, value);
    }

}
