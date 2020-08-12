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

function buttonControl(options) {
    var control = document.createElement('DIV');
    control.innerHTML = options.name;
    control.className = 'button';
    control.index = 1;

    // Add the control to the map
    options.gmap.controls[options.position].push(control);

    // When the button is clicked pan to sydney
    google.maps.event.addDomListener(control, 'click', options.action);
    return control;
}

//set up custom buttons
var buttonOptions = {
    gmap: map,
    name: 'Sydney',
    position: google.maps.ControlPosition.TOP_RIGHT,
    action: function () {
        map.panTo(new google.maps.LatLng(-33.9, 151.2));
    }
}
var button1 = new buttonControl(buttonOptions);

google.maps.event.addDomListener(window, 'load', initialize);

// // Create a div to hold the control.
// var controlDiv = document.createElement('div');
//
// // Set CSS for the control border
// var controlUI = document.createElement('div');
// controlUI.style.backgroundColor = '#fff';
// controlUI.style.border = '2px solid #fff';
// controlUI.style.cursor = 'pointer';
// controlUI.style.marginBottom = '22px';
// controlUI.style.textAlign = 'center';
// controlUI.title = 'Click to recenter the map';
// controlDiv.appendChild(controlUI);
//
// // Set CSS for the control interior
// var controlText = document.createElement('div');
// controlText.style.color = 'rgb(25,25,25)';
// controlText.style.fontFamily = 'Roboto,Arial,sans-serif';
// controlText.style.fontSize = '16px';
// controlText.style.lineHeight = '38px';
// controlText.style.paddingLeft = '5px';
// controlText.style.paddingRight = '5px';
// controlText.innerHTML = 'Center Map';
// controlUI.appendChild(controlText);

/************
 Classes to set up the drop-down control
 ************/
//
// function optionDiv(options){
//     var control = document.createElement('DIV');
//     control.className = "dropDownItemDiv";
//     control.title = options.title;
//     control.id = options.id;
//     control.innerHTML = options.name;
//     google.maps.event.addDomListener(control,'click',options.action);
//     return control;
// }
//
// function checkBox(options){
//     //first make the outer container
//     var container = document.createElement('DIV');
//     container.className = "checkboxContainer";
//     container.title = options.title;
//
//     var span = document.createElement('SPAN');
//     span.role = "checkbox";
//     span.className = "checkboxSpan";
//
//     var bDiv = document.createElement('DIV');
//     bDiv.className = "blankDiv";
//     bDiv.id = options.id;
//
//     var image = document.createElement('IMG');
//     image.className = "blankImg";
//     image.src = "http://maps.gstatic.com/mapfiles/mv/imgs8.png";
//
//     var label = document.createElement('LABEL');
//     label.className = "checkboxLabel";
//     label.innerHTML = options.label;
//
//     bDiv.appendChild(image);
//     span.appendChild(bDiv);
//     container.appendChild(span);
//     container.appendChild(label);
//
//     google.maps.event.addDomListener(container,'click',function(){
//         (document.getElementById(bDiv.id).style.display == 'block') ? document.getElementById(bDiv.id).style.display = 'none' : document.getElementById(bDiv.id).style.display = 'block';
//         options.action();
//     })
//     return container;
// }
// function separator(){
//     var sep = document.createElement('DIV');
//     sep.className = "separatorDiv";
//     return sep;
// }
//
// function dropDownOptionsDiv(options){
//     //alert(options.items[1]);
//     var container = document.createElement('DIV');
//     container.className = "dropDownOptionsDiv";
//     container.id = options.id;
//
//
//     for(i=0; i<options.items.length; i++){
//         //alert(options.items[i]);
//         container.appendChild(options.items[i]);
//     }
//
//     //for(item in options.items){
//     //container.appendChild(item);
//     //alert(item);
//     //}
//     return container;
// }
//
// function dropDownControl(options){
//     var container = document.createElement('DIV');
//     container.className = 'container';
//
//     var control = document.createElement('DIV');
//     control.className = 'dropDownControl';
//     control.innerHTML = options.name;
//     control.id = options.name;
//     var arrow = document.createElement('IMG');
//     arrow.src = "http://maps.gstatic.com/mapfiles/arrow-down.png";
//     arrow.className = 'dropDownArrow';
//     control.appendChild(arrow);
//     container.appendChild(control);
//     container.appendChild(options.dropDown);
//
//     options.map.controls[options.position].push(container);
//     google.maps.event.addDomListener(container,'click',function(){
//         (document.getElementById('myddOptsDiv').style.display == 'block') ? document.getElementById('myddOptsDiv').style.display = 'none' : document.getElementById('myddOptsDiv').style.display = 'block';
//         setTimeout( function(){
//             document.getElementById('myddOptsDiv').style.display = 'none';
//         }, 1500);
//     })
// }
//
// function buttonControl(options) {
//     var control = document.createElement('DIV');
//     control.innerHTML = options.name;
//     control.className = 'button';
//     control.index = 1;
//
//     // Add the control to the map
//     options.map.controls[options.position].push(control);
//
//     // When the button is clicked pan to sydney
//     google.maps.event.addDomListener(control, 'click', options.action);
//     return control;
}