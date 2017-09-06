package fan.geogames.entity;

import javax.persistence.*;

@Entity
@Table(name = "event_like", schema = "geogames", catalog = "")
@IdClass(EventLikePK.class)
public class EventLike {
    private int userId;
    private int eventId;
    private int likeNotLike;

    public EventLike() {
    }

    public EventLike(int userId, int eventId, int likeNotLike) {
        this.userId = userId;
        this.eventId = eventId;
        this.likeNotLike = likeNotLike;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "event_id")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "like_not_like")
    public int getLikeNotLike() {
        return likeNotLike;
    }

    public void setLikeNotLike(int likeNotLike) {
        this.likeNotLike = likeNotLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventLike eventLike = (EventLike) o;

        if (userId != eventLike.userId) return false;
        if (eventId != eventLike.eventId) return false;
        if (likeNotLike != eventLike.likeNotLike) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + eventId;
        result = 31 * result + likeNotLike;
        return result;
    }

    @Override
    public String toString() {
        return "EventLike{" +
                "userId=" + userId +
                ", eventId=" + eventId +
                ", likeNotLike=" + likeNotLike +
                '}';
    }
}
