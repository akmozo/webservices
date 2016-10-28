
package com.akmozo.webservice.orchestrateur;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akmozo.webservice.orchestrateur package. 
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

    private final static QName _PayerEtReserverAgent_QNAME = new QName("http://orchestrateur.webservice.akmozo.com/", "payerEtReserverAgent");
    private final static QName _PayerEtReserverAgentResponse_QNAME = new QName("http://orchestrateur.webservice.akmozo.com/", "payerEtReserverAgentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akmozo.webservice.orchestrateur
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayerEtReserverAgentResponse }
     * 
     */
    public PayerEtReserverAgentResponse createPayerEtReserverAgentResponse() {
        return new PayerEtReserverAgentResponse();
    }

    /**
     * Create an instance of {@link PayerEtReserverAgent }
     * 
     */
    public PayerEtReserverAgent createPayerEtReserverAgent() {
        return new PayerEtReserverAgent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerEtReserverAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orchestrateur.webservice.akmozo.com/", name = "payerEtReserverAgent")
    public JAXBElement<PayerEtReserverAgent> createPayerEtReserverAgent(PayerEtReserverAgent value) {
        return new JAXBElement<PayerEtReserverAgent>(_PayerEtReserverAgent_QNAME, PayerEtReserverAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerEtReserverAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orchestrateur.webservice.akmozo.com/", name = "payerEtReserverAgentResponse")
    public JAXBElement<PayerEtReserverAgentResponse> createPayerEtReserverAgentResponse(PayerEtReserverAgentResponse value) {
        return new JAXBElement<PayerEtReserverAgentResponse>(_PayerEtReserverAgentResponse_QNAME, PayerEtReserverAgentResponse.class, null, value);
    }

}
