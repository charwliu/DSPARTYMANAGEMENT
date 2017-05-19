/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tmf.dsmapi.organization.event;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import static org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.ANY;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;
import org.tmf.dsmapi.individual.model.Organization;

@XmlRootElement
@Entity
<<<<<<< HEAD
@Table(name="Event_Organization")
//@JsonPropertyOrder(value = {"id", "eventTime", "eventType", "event"})
=======
@Table(name = "Event_Organization")
//@JsonPropertyOrder(value = {"id", "eventTime", "eventType", "resource"})
>>>>>>> upstream/develop
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class OrganizationEvent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    @JsonIgnore
=======
    //@JsonIgnore
>>>>>>> upstream/develop
    private String id;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    private Date eventTime;
    @Enumerated(value = EnumType.STRING)
    private OrganizationEventTypeEnum eventType;
    private Organization resource; //check for object

<<<<<<< HEAD
    private Organization event; //check for object

=======
>>>>>>> upstream/develop
    @JsonProperty("eventId")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public OrganizationEventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(OrganizationEventTypeEnum eventType) {
        this.eventType = eventType;
    }

    @JsonIgnore
<<<<<<< HEAD
    public Organization getEvent() {
        return event;
=======
    public Organization getResource() {
        return resource;
>>>>>>> upstream/develop
    }

    public void setResource(Organization resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "OrganizationEvent{" + "id=" + id + ", eventTime=" + eventTime + ", eventType=" + eventType + ", event=" + resource + '}';
    }

    @JsonAutoDetect(fieldVisibility = ANY)
    class EventBody {

        private Organization organization;

        public Organization getOrganization() {
            return organization;
        }

        public EventBody(Organization organization) {
            this.organization = organization;
        }
    }

<<<<<<< HEAD
    @JsonAutoDetect(fieldVisibility = ANY)
    class EventBody {
        private Organization organization;
        public Organization getIndividual() {
            return organization;
        }
        public EventBody(Organization organization) { 
        this.organization = organization;
    }
    
       
    }
   @JsonProperty("event")
   public OrganizationEvent.EventBody getEventBody() {
       
       return new OrganizationEvent.EventBody(getEvent() );
   }

=======
    @JsonProperty("event")
    public EventBody getEvent() {

        return new EventBody(getResource());
    }
>>>>>>> upstream/develop
}
