package com.italo.gamminglist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private int position;
    public Belonging(){

    }

    public Belonging(Game game, GameList list, int position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
