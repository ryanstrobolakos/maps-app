package com.techtalentsouth.MapsApp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
	private List<Geocoding> results;

}
