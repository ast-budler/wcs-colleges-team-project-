<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script>
        function getUserLocation() {
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(function(position) {
                    let result = {position.coords.latitude, position.coords.longitude};
                    return result;
                }, function(error) {
                    console.error(error);
                }, {
                    //고정밀 위치 수신 비활성화, 제한 시간 없음
                    enableHighAccuracy: false,
                    maximumAge: 0,
                    timeout: Infinity
                });
            } else {
                return false;
            }
        }
    </script>
</head>
<body>

</body>
</html>