//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.21 时间 01:29:00 PM CST 
//


package org.tmf.dsmapi.individual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;


/**
 * <p>Individual complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Individual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formattedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disability" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}Disability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="characteristic" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}Characteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherName" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}OtherName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="individualIdentification" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}IndividualIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalReference" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}ExternalReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedParty" type="{http://orange.com/api/partyManagement/tmf/v2/model/business}RelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Individual", propOrder = {
    "id",
    "href",
    "gender",
    "placeOfBirth",
    "countryOfBirth",
    "nationality",
    "maritalStatus",
    "birthDate",
    "title",
    "givenName",
    "familyName",
    "middleName",
    "fullName",
    "formattedName",
    "location",
    "status",
    "disability",
    "characteristic",
    "otherName",
    "individualIdentification",
    "externalReference",
    "relatedParty",
    "contactMedium"
})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Entity(name = "Individual")
@Table(name = "INDIVIDUAL")
@Inheritance(strategy = InheritanceType.JOINED)
public class Individual
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String id;
    protected String href;
    protected String gender;
    protected String placeOfBirth;
    protected String countryOfBirth;
    protected String nationality;
    protected String maritalStatus;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthDate;
    protected String title;
    protected String givenName;
    protected String familyName;
    protected String middleName;
    protected String fullName;
    protected String formattedName;
    protected String location;
    protected String status;
    protected List<Disability> disability;
    protected List<Characteristic> characteristic;
    protected List<OtherName> otherName;
    protected List<IndividualIdentification> individualIdentification;
    protected List<ExternalReference> externalReference;
    protected List<RelatedParty> relatedParty;
    protected List<ContactMedium> contactMedium;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GENDER", length = 255)
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * 获取placeOfBirth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PLACE_OF_BIRTH", length = 255)
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * 设置placeOfBirth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * 获取countryOfBirth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COUNTRY_OF_BIRTH", length = 255)
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * 设置countryOfBirth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * 获取nationality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NATIONALITY", length = 255)
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置nationality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * 获取maritalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MARITAL_STATUS", length = 255)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置maritalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * 获取birthDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 设置birthDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TITLE", length = 255)
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取givenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GIVEN_NAME", length = 255)
    public String getGivenName() {
        return givenName;
    }

    /**
     * 设置givenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * 获取familyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FAMILY_NAME", length = 255)
    public String getFamilyName() {
        return familyName;
    }

    /**
     * 设置familyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * 获取middleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MIDDLE_NAME", length = 255)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * 设置middleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * 获取fullName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FULL_NAME", length = 255)
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置fullName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * 获取formattedName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FORMATTED_NAME", length = 255)
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * 设置formattedName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedName(String value) {
        this.formattedName = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LOCATION_", length = 255)
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the disability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disability }
     * 
     * 
     */
    @OneToMany(targetEntity = Disability.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISABILITY_INDIVIDUAL_ID")
    public List<Disability> getDisability() {
        if (disability == null) {
            disability = new ArrayList<Disability>();
        }
        return this.disability;
    }

    /**
     * 
     * 
     */
    public void setDisability(List<Disability> disability) {
        this.disability = disability;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    @OneToMany(targetEntity = Characteristic.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CHARACTERISTIC_INDIVIDUAL_ID")
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * 
     * 
     */
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherName }
     * 
     * 
     */
    @OneToMany(targetEntity = OtherName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OTHER_NAME_INDIVIDUAL_ID")
    public List<OtherName> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<OtherName>();
        }
        return this.otherName;
    }

    /**
     * 
     * 
     */
    public void setOtherName(List<OtherName> otherName) {
        this.otherName = otherName;
    }

    /**
     * Gets the value of the individualIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualIdentification }
     * 
     * 
     */
    @OneToMany(targetEntity = IndividualIdentification.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INDIVIDUAL_IDENTIFICATION_IN_0")
    public List<IndividualIdentification> getIndividualIdentification() {
        if (individualIdentification == null) {
            individualIdentification = new ArrayList<IndividualIdentification>();
        }
        return this.individualIdentification;
    }

    /**
     * 
     * 
     */
    public void setIndividualIdentification(List<IndividualIdentification> individualIdentification) {
        this.individualIdentification = individualIdentification;
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
    @JoinColumn(name = "EXTERNAL_REFERENCE_INDIVIDUA_0")
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
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    @OneToMany(targetEntity = RelatedParty.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATED_PARTY_INDIVIDUAL_ID")
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * 
     * 
     */
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
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
    @JoinColumn(name = "CONTACT_MEDIUM_INDIVIDUAL_ID")
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
