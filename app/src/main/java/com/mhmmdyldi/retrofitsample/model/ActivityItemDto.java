package com.mhmmdyldi.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ActivityItemDto implements Serializable {
	@SerializedName("ID")
	public Integer id;
	@SerializedName("Title")
	public String title;
	@SerializedName("Calorie")
	public Integer calorie;
	@SerializedName("Minutes")
	public Integer minutes;

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

	public Integer getCalorie() {
		return calorie;
	}

	public void setCalorie(Integer calorie) {
		this.calorie = calorie;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
}
