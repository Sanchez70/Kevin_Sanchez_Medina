
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _BuscarProducto_QNAME = new QName("http://sw/", "buscarProducto");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://sw/", "buscarProductoResponse");
    private final static QName _NuvoProducto_QNAME = new QName("http://sw/", "nuvoProducto");
    private final static QName _NuvoProductoResponse_QNAME = new QName("http://sw/", "nuvoProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link NuvoProducto }
     * 
     */
    public NuvoProducto createNuvoProducto() {
        return new NuvoProducto();
    }

    /**
     * Create an instance of {@link NuvoProductoResponse }
     * 
     */
    public NuvoProductoResponse createNuvoProductoResponse() {
        return new NuvoProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Distribuidor }
     * 
     */
    public Distribuidor createDistribuidor() {
        return new Distribuidor();
    }

    /**
     * Create an instance of {@link Farmacia }
     * 
     */
    public Farmacia createFarmacia() {
        return new Farmacia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "buscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "buscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuvoProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NuvoProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "nuvoProducto")
    public JAXBElement<NuvoProducto> createNuvoProducto(NuvoProducto value) {
        return new JAXBElement<NuvoProducto>(_NuvoProducto_QNAME, NuvoProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuvoProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NuvoProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "nuvoProductoResponse")
    public JAXBElement<NuvoProductoResponse> createNuvoProductoResponse(NuvoProductoResponse value) {
        return new JAXBElement<NuvoProductoResponse>(_NuvoProductoResponse_QNAME, NuvoProductoResponse.class, null, value);
    }

}
