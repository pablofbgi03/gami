var map;
var contador=0;


function initMap() {
  var myLatLng = {lat: 40.39603, lng: -3.550693};
      map = new google.maps.Map(document.getElementById('map'), {
      center: myLatLng ,
      zoom: 5
  });
 map.addListener('click',function(e) {
          placeMarkerAndPanTo(e.latLng, map);
 });
function placeMarkerAndPanTo(latLng, map) {
    if(contador>0){
        marker.setPosition(null)
        contador=0;
    }
    var coordenadas = latLng;
    var marker = new google.maps.Marker({position: latLng,map: map});  
    map.panTo(latLng);
    contador++;
    document.getElementById("ubicacion").value = coordenadas; 
  }	
}

google.maps.event.addDomListener(window, 'load', initMap);