package com.mhmmdyldi.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FoodUnitItemDto implements Serializable {
	@SerializedName("ID")
	public Integer id;
	@SerializedName("Title")
	public String title;

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
