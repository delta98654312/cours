const map = L.map('map').setView([49.244, 4.063], 17);
const marker = L.marker([49.2445, 4.0625]).addTo(map);
marker.bindPopup("Le texte");

const circle = L.circle([49.2445, 4.0625], {
    color: 'red',
    fillColor: '#f03',
    fillOpacity: 0.5,
    radius: 100
}).addTo(map);

const tiles = L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
		maxZoom: 19,
		attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
	}).addTo(map);marker.bindPopup("Le texte");