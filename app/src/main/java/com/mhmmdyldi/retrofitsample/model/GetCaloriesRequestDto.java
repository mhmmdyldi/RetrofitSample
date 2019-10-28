package com.mhmmdyldi.retrofitsample.model;

public class GetCaloriesRequestDto {
	private int Version;

	public GetCaloriesRequestDto(int version){
		this.Version = version;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		this.Version = version;
	}
}
