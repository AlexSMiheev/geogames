package fan.geogames.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CommentsLikePK implements Serializable {
    private int userId;
    private int commentId;

    public CommentsLikePK() {
    }

    public CommentsLikePK(int userId, int commentId) {
        this.userId = userId;
        this.commentId = commentId;
    }

    @Column(name = "user_Id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "comment_Id")
    @Id
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsLikePK that = (CommentsLikePK) o;

        if (userId != that.userId) return false;
        if (commentId != that.commentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + commentId;
        return result;
    }

    @Override
    public String toString() {
        return "CommentsLikePK{" +
                "userId=" + userId +
                ", commentId=" + commentId +
                '}';
    }
}
