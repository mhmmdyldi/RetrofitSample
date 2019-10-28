package com.mhmmdyldi.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FoodCalorieItemDto implements Serializable {
	@SerializedName("ID")
	public Integer id;
	@SerializedName("FoodID")
	public Integer foodID;
	@SerializedName("FoodUnitID")
	public Integer foodUnitID;
	@SerializedName("Colorie")
	public double colorie;

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	public Integer getFoodID() {
		return foodID;
	}

	public void setFoodID(Integer foodID) {
		this.foodID = foodID;
	}

	public Integer getFoodUnitID() {
		return foodUnitID;
	}

	public void setFoodUnitID(Integer foodUnitID) {
		this.foodUnitID = foodUnitID;
	}

	public double getColorie() {
		return colorie;
	}

	public void setColorie(double colorie) {
		this.colorie = colorie;
	}
}
