function getUserLocation() {
	if (navigator.geolocation) {
    	navigator.geolocation.getCurrentPosition(function(position) {
            return [position.coords.latitude, position.coords.longitude];
    	}, function(error) {
    		return null;
    	}, {
      		enableHighAccuracy: false,
      		maximumAge: 0,
      		timeout: Infinity
    	});
  	}else{
          return null;
      }
}
	
function kakaoLogin(){
        location.href="https://kauth.kakao.com/oauth/authorize\
	?client_id=19e32d6463b15fa9f4949b1c7ca58bef\
	&redirect_uri=http://localhost:8090/login\
	&response_type=code"
}