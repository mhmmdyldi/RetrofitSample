package com.mhmmdyldi.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FoodItemDto implements Serializable {
	@SerializedName("ID")
	public Integer id;
	@SerializedName("Title")
	public String title;
	@SerializedName("VitaminA")
	public double vitaminA;
	@SerializedName("VitaminC")
	public double vitaminC;
	@SerializedName("Fat")
	public double fat;

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

	public double getVitaminA() {
		return vitaminA;
	}

	public void setVitaminA(double vitaminA) {
		this.vitaminA = vitaminA;
	}

	public double getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(double vitaminC) {
		this.vitaminC = vitaminC;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}
}
