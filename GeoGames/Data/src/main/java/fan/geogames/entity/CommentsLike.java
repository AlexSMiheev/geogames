package fan.geogames.entity;

import javax.persistence.*;

@Entity
@Table(name = "comments_like", schema = "geogames", catalog = "")
@IdClass(CommentsLikePK.class)
public class CommentsLike {
    private int userId;
    private int commentId;
    private Integer likeDontLike;

    public CommentsLike() {
    }

    public CommentsLike(int userId, int commentId, Integer likeDontLike) {
        this.userId = userId;
        this.commentId = commentId;
        this.likeDontLike = likeDontLike;
    }

    @Id
    @Column(name = "user_Id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "comment_Id")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "like_dont_like")
    public Integer getLikeDontLike() {
        return likeDontLike;
    }

    public void setLikeDontLike(Integer likeDontLike) {
        this.likeDontLike = likeDontLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsLike that = (CommentsLike) o;

        if (userId != that.userId) return false;
        if (commentId != that.commentId) return false;
        if (likeDontLike != null ? !likeDontLike.equals(that.likeDontLike) : that.likeDontLike != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + commentId;
        result = 31 * result + (likeDontLike != null ? likeDontLike.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommentsLike{" +
                "userId=" + userId +
                ", commentId=" + commentId +
                ", likeDontLike=" + likeDontLike +
                '}';
    }
}
