package com.mhmmdyldi.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CalorieDto implements Serializable {

	@SerializedName("Version")
	private Integer version;
	@SerializedName("Activity")
	public List<ActivityItemDto> activity;
	@SerializedName("Food")
	public List<FoodItemDto> food;
	@SerializedName("FoodUnit")
	public List<FoodUnitItemDto> foodUnit;
	@SerializedName("FoodCalorie")
	public List<FoodCalorieItemDto> foodCalorie;


	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		version = version;
	}

	public List<ActivityItemDto> getActivity() {
		return activity;
	}

	public void setActivity(List<ActivityItemDto> activity) {
		activity = activity;
	}

	public List<FoodItemDto> getFood() {
		return food;
	}

	public void setFood(List<FoodItemDto> food) {
		food = food;
	}

	public List<FoodUnitItemDto> getFoodUnit() {
		return foodUnit;
	}

	public void setFoodUnit(List<FoodUnitItemDto> foodUnit) {
		foodUnit = foodUnit;
	}

	public List<FoodCalorieItemDto> getFoodCalorie() {
		return foodCalorie;
	}

	public void setFoodCalorie(List<FoodCalorieItemDto> foodCalorie) {
		foodCalorie = foodCalorie;
	}


}
