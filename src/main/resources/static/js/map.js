let map;

function initialize() {

    let mapOptions = {
        center: new google.maps.LatLng(42.415104, 23.192694),
        zoom: 4,
        // maxZoom: 20,
        // minZoom: 10
    };

    map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);

}

google.maps.event.addDomListener(window, 'load', initialize);

//### Add a button on Google Maps ...
var controlMarkerUI = document.createElement('DIV');
controlMarkerUI.style.cursor = 'pointer';
// controlMarkerUI.style.backgroundImage = "url(http://localhost:8080/map/marker.png)";
controlMarkerUI.style.backgroundImage = "url('../img/social.png')";
controlMarkerUI.style.height = '28px';
controlMarkerUI.style.width = '25px';
controlMarkerUI.style.top = '11px';
controlMarkerUI.style.left = '120px';
controlMarkerUI.title = 'Click to set the map to Home';

//map.controls[google.maps.ControlPosition.LEFT_TOP].push(controlMarkerUI);
map.controls[google.maps.ControlPosition.TOP_CENTER].push(controlMarkerUI);

