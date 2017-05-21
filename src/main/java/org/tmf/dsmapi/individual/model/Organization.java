//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.21 时间 01:29:00 PM CST 
//


package org.tmf.dsmapi.individual.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Organization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLegalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existsDuring" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}ExistsDuring" minOccurs="0"/&gt;
 *         &lt;element name="tradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherName" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}OtherName" minOccurs="0"/&gt;
 *         &lt;element name="characteristic" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}Characteristic" minOccurs="0"/&gt;
 *         &lt;element name="organizationIdentification" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}OrganizationIdentification" minOccurs="0"/&gt;
 *         &lt;element name="externalReference" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}ExternalReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedParty" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}RelatedParty" minOccurs="0"/&gt;
 *         &lt;element name="organizationParentRelationship" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}OrganizationParentRelationship" minOccurs="0"/&gt;
 *         &lt;element name="organizationChildRelationship" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}OrganizationChildRelationship" minOccurs="0"/&gt;
 *         &lt;element name="contactMedium" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}ContactMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "id",
    "href",
    "isLegalEntity",
    "type",
    "existsDuring",
    "tradingName",
    "nameType",
    "status",
    "otherName",
    "characteristic",
    "organizationIdentification",
    "externalReference",
    "relatedParty",
    "organizationParentRelationship",
    "organizationChildRelationship",
    "contactMedium"
})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Entity(name = "Organization")
@Table(name = "ORGANIZATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Organization
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String id;
    protected String href;
    protected String isLegalEntity;
    protected String type;
    protected ExistsDuring existsDuring;
    protected String tradingName;
    protected String nameType;
    protected String status;
    protected OtherName otherName;
    protected Characteristic characteristic;
    protected OrganizationIdentification organizationIdentification;
    protected List<ExternalReference> externalReference;
    protected RelatedParty relatedParty;
    protected OrganizationParentRelationship organizationParentRelationship;
    protected OrganizationChildRelationship organizationChildRelationship;
    protected List<ContactMedium> contactMedium;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ID", scale = 0)
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取href属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HREF", length = 255)
    public String getHref() {
        return href;
    }

    /**
     * 设置href属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * 获取isLegalEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "IS_LEGAL_ENTITY", length = 255)
    public String getIsLegalEntity() {
        return isLegalEntity;
    }

    /**
     * 设置isLegalEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLegalEntity(String value) {
        this.isLegalEntity = value;
    }

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
     * 获取existsDuring属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExistsDuring }
     *     
     */
    @ManyToOne(targetEntity = ExistsDuring.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXISTS_DURING_ORGANIZATION_H_0")
    public ExistsDuring getExistsDuring() {
        return existsDuring;
    }

    /**
     * 设置existsDuring属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExistsDuring }
     *     
     */
    public void setExistsDuring(ExistsDuring value) {
        this.existsDuring = value;
    }

    /**
     * 获取tradingName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TRADING_NAME", length = 255)
    public String getTradingName() {
        return tradingName;
    }

    /**
     * 设置tradingName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * 获取nameType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_TYPE", length = 255)
    public String getNameType() {
        return nameType;
    }

    /**
     * 设置nameType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATUS", length = 255)
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取otherName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OtherName }
     *     
     */
    @ManyToOne(targetEntity = OtherName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OTHER_NAME_ORGANIZATION_HJID")
    public OtherName getOtherName() {
        return otherName;
    }

    /**
     * 设置otherName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OtherName }
     *     
     */
    public void setOtherName(OtherName value) {
        this.otherName = value;
    }

    /**
     * 获取characteristic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Characteristic }
     *     
     */
    @ManyToOne(targetEntity = Characteristic.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CHARACTERISTIC_ORGANIZATION__0")
    public Characteristic getCharacteristic() {
        return characteristic;
    }

    /**
     * 设置characteristic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristic }
     *     
     */
    public void setCharacteristic(Characteristic value) {
        this.characteristic = value;
    }

    /**
     * 获取organizationIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentification }
     *     
     */
    @ManyToOne(targetEntity = OrganizationIdentification.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGANIZATION_IDENTIFICATION__0")
    public OrganizationIdentification getOrganizationIdentification() {
        return organizationIdentification;
    }

    /**
     * 设置organizationIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentification }
     *     
     */
    public void setOrganizationIdentification(OrganizationIdentification value) {
        this.organizationIdentification = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ExternalReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXTERNAL_REFERENCE_ORGANIZAT_0")
    public List<ExternalReference> getExternalReference() {
        if (externalReference == null) {
            externalReference = new ArrayList<ExternalReference>();
        }
        return this.externalReference;
    }

    /**
     * 
     * 
     */
    public void setExternalReference(List<ExternalReference> externalReference) {
        this.externalReference = externalReference;
    }

    /**
     * 获取relatedParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelatedParty }
     *     
     */
    @ManyToOne(targetEntity = RelatedParty.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATED_PARTY_ORGANIZATION_H_0")
    public RelatedParty getRelatedParty() {
        return relatedParty;
    }

    /**
     * 设置relatedParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedParty }
     *     
     */
    public void setRelatedParty(RelatedParty value) {
        this.relatedParty = value;
    }

    /**
     * 获取organizationParentRelationship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizationParentRelationship }
     *     
     */
    @ManyToOne(targetEntity = OrganizationParentRelationship.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGANIZATION_PARENT_RELATION_1")
    public OrganizationParentRelationship getOrganizationParentRelationship() {
        return organizationParentRelationship;
    }

    /**
     * 设置organizationParentRelationship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationParentRelationship }
     *     
     */
    public void setOrganizationParentRelationship(OrganizationParentRelationship value) {
        this.organizationParentRelationship = value;
    }

    /**
     * 获取organizationChildRelationship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizationChildRelationship }
     *     
     */
    @ManyToOne(targetEntity = OrganizationChildRelationship.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGANIZATION_CHILD_RELATIONS_1")
    public OrganizationChildRelationship getOrganizationChildRelationship() {
        return organizationChildRelationship;
    }

    /**
     * 设置organizationChildRelationship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationChildRelationship }
     *     
     */
    public void setOrganizationChildRelationship(OrganizationChildRelationship value) {
        this.organizationChildRelationship = value;
    }

    /**
     * Gets the value of the contactMedium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMedium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMedium }
     * 
     * 
     */
    @OneToMany(targetEntity = ContactMedium.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTACT_MEDIUM_ORGANIZATION__0")
    public List<ContactMedium> getContactMedium() {
        if (contactMedium == null) {
            contactMedium = new ArrayList<ContactMedium>();
        }
        return this.contactMedium;
    }

    /**
     * 
     * 
     */
    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }

}
