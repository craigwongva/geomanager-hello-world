import it.geosolutions.geoserver.rest.GeoServerRESTReader
import it.geosolutions.geoserver.rest.GeoServerRESTPublisher

class Sacback {
 public static void main(String[] args) {
  String RESTURL  = "http://35.166.184.150/geoserver"
  //String RESTURL  = "http://localhost:8080/geoserver";
  String RESTUSER = "admin";
  String RESTPW   = "geoserver";
        
  GeoServerRESTReader reader = new GeoServerRESTReader(RESTURL, RESTUSER, RESTPW);
  GeoServerRESTPublisher publisher = new GeoServerRESTPublisher(RESTURL, RESTUSER, RESTPW);

  //boolean exists = reader.existsLayer("tiger", "giant_polygon");
  //println exists

  println "sacback 4"

  boolean created = publisher.createWorkspace("kaitWorkspace")
  println created
  println "sacback 99"
 }
}
