package org.springframework.ec;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author EricChen 2020/12/28 15:20
 */
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
