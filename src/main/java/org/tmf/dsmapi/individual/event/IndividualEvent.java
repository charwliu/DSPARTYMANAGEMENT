/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tmf.dsmapi.individual.event;



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
import org.tmf.dsmapi.individual.model.Individual;


@XmlRootElement
@Entity
@Table(name="Event_Individual")
<<<<<<< HEAD
//@JsonPropertyOrder(value = {"eventTime", "eventType", "event"})
=======
//@JsonPropertyOrder(value = {"eventTime", "eventType", "resource"})
>>>>>>> upstream/develop
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class IndividualEvent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    private Date eventTime;

    @Enumerated(value = EnumType.STRING)
    private IndividualEventTypeEnum eventType;

    
<<<<<<< HEAD
    private Individual event; //check for object
=======
    private Individual resource; //check for object
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

    public IndividualEventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(IndividualEventTypeEnum eventType) {
        this.eventType = eventType;
    }
    
    @JsonIgnore
<<<<<<< HEAD
    public Individual getEvent() {
        return event;
    }
 
    public void setEvent(Individual event) {
        this.event = event;
=======
    public Individual getResource() {
        return resource;
    }
 
    public void setResource(Individual resource) {
        this.resource = resource;
>>>>>>> upstream/develop
    }

    @Override
    public String toString() {
        return "IndividualEvent{" + "id=" + id + ", eventTime=" + eventTime + ", eventType=" + eventType + ", event=" + resource + '}';
    }
    
    @JsonAutoDetect(fieldVisibility = ANY)
    class EventBody {
        private Individual individual;
        public Individual getIndividual() {
            return individual;
        }
        public EventBody(Individual individual) { 
        this.individual = individual;
    }
    
       
    }
<<<<<<< HEAD
    
    @JsonAutoDetect(fieldVisibility = ANY)
    class EventBody {
        private Individual individual;
        public Individual getIndividual() {
            return individual;
        }
        public EventBody(Individual individual) { 
        this.individual = individual;
    }
    
       
    }
   @JsonProperty("event")
   public EventBody getEventBody() {
       
       return new EventBody(getEvent() );
=======
   @JsonProperty("event")
   public EventBody getEvent() {
       
       return new EventBody(getResource() );
>>>>>>> upstream/develop
   }

}
