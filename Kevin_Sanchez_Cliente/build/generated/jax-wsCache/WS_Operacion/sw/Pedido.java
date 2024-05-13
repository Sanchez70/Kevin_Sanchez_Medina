
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iddistribuidor" type="{http://sw/}distribuidor" minOccurs="0"/&gt;
 *         &lt;element name="idfarmacia" type="{http://sw/}farmacia" minOccurs="0"/&gt;
 *         &lt;element name="idproducto" type="{http://sw/}producto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedido", propOrder = {
    "cantidad",
    "iddistribuidor",
    "idfarmacia",
    "idproducto"
})
public class Pedido {

    protected int cantidad;
    protected Distribuidor iddistribuidor;
    protected Farmacia idfarmacia;
    protected Producto idproducto;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad iddistribuidor.
     * 
     * @return
     *     possible object is
     *     {@link Distribuidor }
     *     
     */
    public Distribuidor getIddistribuidor() {
        return iddistribuidor;
    }

    /**
     * Define el valor de la propiedad iddistribuidor.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribuidor }
     *     
     */
    public void setIddistribuidor(Distribuidor value) {
        this.iddistribuidor = value;
    }

    /**
     * Obtiene el valor de la propiedad idfarmacia.
     * 
     * @return
     *     possible object is
     *     {@link Farmacia }
     *     
     */
    public Farmacia getIdfarmacia() {
        return idfarmacia;
    }

    /**
     * Define el valor de la propiedad idfarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link Farmacia }
     *     
     */
    public void setIdfarmacia(Farmacia value) {
        this.idfarmacia = value;
    }

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getIdproducto() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setIdproducto(Producto value) {
        this.idproducto = value;
    }

}
