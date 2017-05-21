//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.21 时间 01:29:00 PM CST 
//


package org.tmf.dsmapi.individual.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>ContactMedium complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactMedium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validFor" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}ValidFor" minOccurs="0"/&gt;
 *         &lt;element name="medium" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}Medium" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMedium", propOrder = {
    "type",
    "validFor",
    "medium",
    "preferred"
})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Entity(name = "ContactMedium")
@Table(name = "CONTACT_MEDIUM")
@Inheritance(strategy = InheritanceType.JOINED)
public class ContactMedium
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String type;
    protected ValidFor validFor;
    protected Medium medium;
    protected String preferred;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取validFor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ValidFor }
     *     
     */
    @ManyToOne(targetEntity = ValidFor.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALID_FOR_CONTACT_MEDIUM_HJID")
    public ValidFor getValidFor() {
        return validFor;
    }

    /**
     * 设置validFor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFor }
     *     
     */
    public void setValidFor(ValidFor value) {
        this.validFor = value;
    }

    /**
     * 获取medium属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Medium }
     *     
     */
    @ManyToOne(targetEntity = Medium.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEDIUM_CONTACT_MEDIUM_HJID")
    public Medium getMedium() {
        return medium;
    }

    /**
     * 设置medium属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Medium }
     *     
     */
    public void setMedium(Medium value) {
        this.medium = value;
    }

    /**
     * 获取preferred属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PREFERRED", length = 255)
    public String getPreferred() {
        return preferred;
    }

    /**
     * 设置preferred属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred(String value) {
        this.preferred = value;
    }

    /**
     * 获取hjid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @org.codehaus.jackson.annotate.JsonIgnore
    public Long getHjid() {
        return hjid;
    }

    /**
     * 设置hjid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
