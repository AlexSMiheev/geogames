package fan.geogames.entity;

import javax.persistence.*;

@Entity
@Table(name = "visited-event", schema = "geogames", catalog = "")
public class VisitedEvent {
    private int visitedEventId;
    private int eventId;

    public VisitedEvent() {
    }

    public VisitedEvent(int visitedEventId, int eventId) {
        this.visitedEventId = visitedEventId;
        this.eventId = eventId;
    }

    @Id
    @Column(name = "visited-event_Id")
    public int getVisitedEventId() {
        return visitedEventId;
    }

    public void setVisitedEventId(int visitedEventId) {
        this.visitedEventId = visitedEventId;
    }

    @Basic
    @Column(name = "event_Id")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisitedEvent that = (VisitedEvent) o;

        if (visitedEventId != that.visitedEventId) return false;
        if (eventId != that.eventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = visitedEventId;
        result = 31 * result + eventId;
        return result;
    }

    @Override
    public String toString() {
        return "VisitedEvent{" +
                "visitedEventId=" + visitedEventId +
                ", eventId=" + eventId +
                '}';
    }
}
