package com.cdk.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cdk.service.OpenStreetMapUtils;

@RestController
@RequestMapping(path = "latlong")
public class GetCoordinatesController {


  @GetMapping(path = "getCoordinate")
  public String getCoordinate(@RequestParam(required = true) String address) {
    Map<String, Double> coords;
    coords = OpenStreetMapUtils.getInstance().getCoordinates(address);
    Double latitude = coords.get("lat");
    Double longitude = coords.get("lon");
    String latLong = "Latitude: " + latitude.toString() + " Longitude: " + longitude.toString();
    return latLong;
  }
}
