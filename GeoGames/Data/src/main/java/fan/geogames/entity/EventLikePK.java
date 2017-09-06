package fan.geogames.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EventLikePK implements Serializable {
    private int userId;
    private int eventId;

    public EventLikePK() {
    }

    public EventLikePK(int userId, int eventId) {
        this.userId = userId;
        this.eventId = eventId;
    }

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "event_id")
    @Id
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

        EventLikePK that = (EventLikePK) o;

        if (userId != that.userId) return false;
        if (eventId != that.eventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + eventId;
        return result;
    }

    @Override
    public String toString() {
        return "EventLikePK{" +
                "userId=" + userId +
                ", eventId=" + eventId +
                '}';
    }
}
