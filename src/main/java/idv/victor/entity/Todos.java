package idv.victor.entity;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todos {
    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Long _id;

    @Column(name="title")
    private String title;

    @Column(name="item")
    private String item;

    @OneToOne
    @JoinColumn(name="author_id")
    private Users users;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
