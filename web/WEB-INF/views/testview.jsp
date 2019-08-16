<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: 김일환
  Date: 2019-07-24
  Time: 오후 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.11.3.min.js"></script>
    <title>Title</title>
    <style>
        header {
            background-color: darkgray;
            height: 50px;
        }

        .div-testview {
            background-color: gainsboro;
            height: 500px;
        }

        footer {
            background-color: slategray;
            height: 50px;
        }

        .div-testview-left {
            display: inline;
            background-color: white;
            border: 1px solid black;
            width: 45%;
            float: left;
            margin: 10px 10px;
        }

        .div-testview-right {
            display: inline;
            background-color: white;
            border: 1px solid black;
            width: 45%;
            float: right;
            margin: 10px 10px;
        }

        .test_list {
            color: black;
        }

        .test_list:hover {
            color: blue;
            text-decoration-line: underline;
            cursor: pointer;
        }


    </style>
</head>
<body>
<header>헤더영역</header>
<div class="div-testview">콘텐츠 영역
    <p>
        <button type="button" class="btn-testlistView">문제 보이기</button>
    </p>
    <div class="div-testview-left">문제 리스트 영역
        <ul>
        </ul>
    </div>
    <div class="div-testview-right">문제 프리뷰 영역


    </div>
</div>
<footer>푸터영역</footer>

</body>


<script type="text/javascript">
    $(document).ready(function () {

        $(".btn-testlistView").click(function () {
            $.ajax({
                url: "${pageContext.request.contextPath}/listview",
                type: "POST",
                dataType: "JSON",
                success: function (data) {
                    for (var i = 0; i < data.length; i++) {
                        var test_no = data[i]["test_no"];
                        var test_content = data[i]["test_cate_name"] + " " + data[i]["test_title"];
                        var createInput = document.createElement('input');
                        createInput.setAttribute('type', 'hidden');
                        createInput.setAttribute('class', 'input-test-no');
                        createInput.setAttribute('value', test_no);
                        var $test_list = $('<li class="test_list">').append(createInput).append(test_content).append($('</li>'));

                        $('.div-testview-left > ul').append($test_list);
                    }
                }
            });
        });

        $(document).on("click", ".test_list", function () {
            var test_no = $(this).find('.input-test-no').val();
            $.ajax({
                url: "${pageContext.request.contextPath}/testContentView?find_test_no=" + test_no,
                type: "POST",
                success: function () {
                    console.log(test_no);
                }
            })
        });
    });
</script>
</html>
