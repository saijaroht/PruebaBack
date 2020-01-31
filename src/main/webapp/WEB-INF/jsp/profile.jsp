<%--
  Created by IntelliJ IDEA.
  User: fabianbareno
  Date: 1/26/20
  Time: 1:33 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Westeros profiles</title>
</head>
<body>
    <div class="container" style="padding: 40px">
        <div class="row">
            <div class="col">
                <div class="card" style="padding: 40px">
                    <img src="${portfolio.imageUrl}" class="card-img-top" alt="...">
                    <div class="card-body">
                        <ul class="list-group">
                            <li class="list-group-item">Just some elements to test this component</li>
                            <li class="list-group-item">This should be replaced by the tweets timeline</li>
                            <li class="list-group-item">I don't have an API-KEY and SECRET for twitter yet</li>
                            <li class="list-group-item">Already requested but still waiting for it</li>
                            <li class="list-group-item">This will be replaced soon</li>
                        </ul>
                    </div>
                </div>

            </div>
            <div class="col">
                <div class="card">
                    <h1 style="text-align: center">${portfolio.twitterUserName}</h1>
                    <div class="card-body">
                        <h5 class="card-title">${portfolio.title}</h5>
                        <p class="card-text">${portfolio.description}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
