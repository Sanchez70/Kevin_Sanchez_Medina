
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para farmacia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="farmacia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaPedidos" type="{http://sw/}pedido" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombreFarmacia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoFarmacia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmacia", propOrder = {
    "direccion",
    "listaPedidos",
    "nombreFarmacia",
    "tipoFarmacia"
})
public class Farmacia {

    protected String direccion;
    @XmlElement(nillable = true)
    protected List<Pedido> listaPedidos;
    protected String nombreFarmacia;
    protected String tipoFarmacia;

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the listaPedidos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPedidos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPedidos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pedido }
     * 
     * 
     */
    public List<Pedido> getListaPedidos() {
        if (listaPedidos == null) {
            listaPedidos = new ArrayList<Pedido>();
        }
        return this.listaPedidos;
    }

    /**
     * Obtiene el valor de la propiedad nombreFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    /**
     * Define el valor de la propiedad nombreFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFarmacia(String value) {
        this.nombreFarmacia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFarmacia() {
        return tipoFarmacia;
    }

    /**
     * Define el valor de la propiedad tipoFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFarmacia(String value) {
        this.tipoFarmacia = value;
    }

}