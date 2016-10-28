
package com.akmozo.webservice.paiement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akmozo.webservice.paiement package. 
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

    private final static QName _Payer_QNAME = new QName("http://paiement.webservice.akmozo.com/", "payer");
    private final static QName _PayerResponse_QNAME = new QName("http://paiement.webservice.akmozo.com/", "payerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akmozo.webservice.paiement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayerResponse }
     * 
     */
    public PayerResponse createPayerResponse() {
        return new PayerResponse();
    }

    /**
     * Create an instance of {@link Payer }
     * 
     */
    public Payer createPayer() {
        return new Payer();
    }

    /**
     * Create an instance of {@link DonneesPaiement }
     * 
     */
    public DonneesPaiement createDonneesPaiement() {
        return new DonneesPaiement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paiement.webservice.akmozo.com/", name = "payer")
    public JAXBElement<Payer> createPayer(Payer value) {
        return new JAXBElement<Payer>(_Payer_QNAME, Payer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paiement.webservice.akmozo.com/", name = "payerResponse")
    public JAXBElement<PayerResponse> createPayerResponse(PayerResponse value) {
        return new JAXBElement<PayerResponse>(_PayerResponse_QNAME, PayerResponse.class, null, value);
    }

}
