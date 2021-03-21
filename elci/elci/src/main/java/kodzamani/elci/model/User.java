package kodzamani.elci.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="issue")
    private String issue;
    @Column(name = "comment")
    private String comment;
    private long status;

    public User(){

    }

    public User(String issue, String comment, long status) {
        this.issue = issue;
        this.comment = comment;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }

    public String getComment() {
        return comment;
    }

    public long getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStatus(long status) {
        this.status = status;
    }
}
