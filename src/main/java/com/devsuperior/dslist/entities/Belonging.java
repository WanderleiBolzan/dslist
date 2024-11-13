package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPk id = new BelongingPk(); 

	private Integer position;
	
	public Belonging() {	
	}

	public Belonging(Game game, GameList list, Integer postion) {
		id.setGame(game);
		id.setList(list);
		this.position = postion;
	}

	public BelongingPk getId() {
		return id;
	}

	public void setId(BelongingPk id) {
		this.id = id;
	}

	public Integer getPostion() {
		return position;
	}

	public void setPostion(Integer postion) {
		this.position = postion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
