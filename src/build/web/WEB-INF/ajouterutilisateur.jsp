<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <title>STRATON</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="style/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="style/animate.css">
	<link rel="stylesheet" type="text/css" href="style/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="style/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="style/select2.min.css">
	<link rel="stylesheet" type="text/css" href="style/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="style/util.css">
	<link rel="stylesheet" type="text/css" href="style/main.css">
        <link rel="stylesheet" type="text/css" href="style/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="style/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="style/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="style/jquery.gritter.css">
        <link rel="stylesheet" type="text/css" href="style/lineicons.css">
        <link rel="stylesheet" type="text/css" href="style/style.css">
        <link rel="stylesheet" type="text/css" href="style/style-responsive.css">
        <link rel="stylesheet" type="text/css" href="style/Accueil.css">
        <script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/4FEF4FD4-202B-164C-A9EF-E2CEBA04C76B/main.js" charset="UTF-8"></script>
        <script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/4FEF4FD4-202B-164C-A9EF-E2CEBA04C76B/main.js" charset="UTF-8"></script><script src="assets/js/Chart.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <section id="container" >
            <header class="header black-bg" >
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <a href="accueiladmin.jsp" class="logo" style="font-family: Times New Roman ,fantasy;font-size:200%;font-style: normal;font-weight: bolder; "><b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSTRATON</b></a>
                <div class="nav notify-row" id="top_menu">
                    <ul class="nav top-menu">
                        <li id="header_inbox_bar" class="dropdown" style="margin-left:800px"> <a data-toggle="dropdown"> <i class="fa fa-envelope" ></i> <span class="badge bg-theme">1</span> </a>
                            <ul class="dropdown-menu extended inbox">
                                <div class="notify-arrow notify-arrow-green"></div>
                                <li>
                                    <p class="green">Nouveaux messages !</p>
                                </li>
                                <sql:setDataSource var="bd" scope="request" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" user="root" password="" />
                                <sql:query var="resultat" dataSource="${bd}">select * from message where destination="${sessionUtilisateur}"</sql:query>
                                <c:forEach items="${resultat.rows}" var="data">
                                <li> <a href="messagerie">  <span class="subject"> <span class="from">${data.Source}</span> <span class="time"></span> </span> <span class="message"> ${data.contenu}</span> </a> </li>
                                </c:forEach>
                                <li> <a href="messagerie">Voir tout.</a> </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="Connexion">Déconnexion</a></li>
                    </ul>
                </div>
            </header>
    <!--ici commence le menu -->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <ul class="sidebar-menu" id="nav-accordion">
                        <p class="centered"><a href="accueiladmin.jsp"><img src="images/saad.png" alt="website template image" width="60" class="img-circle"></a></p>
                        <h5 class="centered">K.E Saad</h5>
                        <li class="mt"> <a  href="profile"> <i class="fa fa-drivers-license-o"></i> <span>Page Personnelle</span> </a> </li>
                        <li class="mt"> <a  href="utilisateur"> <i class="fa fa-user-plus"></i> <span>Utilisateur</span> </a> </li>
                        <li class="mt"> <a href="agenda"> <i class="fa fa-book"></i> <span>Projet</span> </a> </li>
                        <li class="mt"> <a  href="tachecolabadm"> <i class="fa fa-user-plus"></i> <span>Collaborateur</span> </a> </li>
                        <li class="mt"> <a  href="publicationadm"> <i class="fa fa-comments-o"></i> <span>Mur Actualite</span> </a> </li>
                        <li class="mt"> <a  href="messagerie"> <i class="fa fa-commenting-o"></i> <span>Messagerie</span> </a> </li>                 
                    </ul>
                </div>
            </aside>
    <!--ici se termine le menu -->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <!--ici commence le formulaire-->
                            <div class="container-contact100">
                                    <div class="wrap-contact100">
                                            <div class="contact100-form-title" style="background-image: url(images/bg-01.jpg);">
                                                    <span class="contact100-form-title-1">
                                                            Ajouter Un Utilisateur
                                                    </span>
                                            </div>

                                            <form class="contact100-form validate-form" method="post" action="ajouterutilisateur">
                                                    <div class="wrap-input100 validate-input">
                                                            <span class="label-input100">Nom et Prenom:</span>
                                                            <input class="input100" type="text" name="NomPrenom">
                                                            <span class="focus-input100"></span>
                                                    </div>

                                                    <div class="wrap-input100 validate-input">
                                                            <span class="label-input100">Email:</span>
                                                            <input class="input100" type="text" name="Email" >
                                                            <span class="focus-input100"></span>
                                                    </div>
                                                
                                                    <div class="wrap-input100 validate-input">
                                                            <span class="label-input100">Mot De Passe:</span>
                                                            <input class="input100" type="text" name="MotDePasse" >
                                                            <span class="focus-input100"></span>
                                                    </div>
                                                    <div class="wrap-input100 validate-input">
                                                            <span class="label-input100">Fonction:</span>
                                                            <input class="input100" type="text" name="Fonction" placeholder="Collaborateur ou Chef De Projet" >
                                                            <span class="focus-input100"></span>
                                                    </div>



                                                    <div class="container-contact100-form-btn">
                                                            <button type="submit" class="contact100-form-btn">
                                                                    <span>
                                                                            Valider
                                                                            <i class="fa fa-long-arrow-right m-l-7" aria-hidden="true"></i>
                                                                    </span>
                                                            </button>
                                                    </div>
                                            </form>
                                    </div>
                            </div>



                        </div>
    <!--colonne des utilisateurs-->
                        <div class="col-lg-3 ds">
   <!--Afficher admin-->
                            <h3>Administrateur</h3>
                            <div class="desc">
                                <sql:setDataSource var="bd" scope="request" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" user="root" password="" />
                                <sql:query var="admin" dataSource="${bd}">select * from administrateur</sql:query>
                                <c:forEach items="${admin.rows}" var="administrateur">
                                <div class="details">
                                    <p><a href="infopers.jsp"><c:out value="${administrateur.Nom}"/>&nbsp;<c:out value="${administrateur.Prenom}"/></a><br>
                                    <muted><c:out value="${administrateur.Disponibilite}"/></muted></p>
                                </div>
                                </c:forEach>
                            </div>
   <!--Afficher Chef de Projet-->
                            <h3>CHEF de PROJET</h3>
                            <div class="desc">
                                <sql:query var="chef" dataSource="${bd}">select * from chefdeprojet</sql:query>
                                <c:forEach items="${chef.rows}" var="chefprojet">
                                <div class="details">
                                    <p><a href="#"><c:out value="${chefprojet.NomPrenomChef}"/></a><br>
                                    <muted><c:out value="${chefprojet.DisponibiliteChef}"/></muted>
                                    </p>
                                </div>
                                </c:forEach>
                            </div>
    <!--Afficher Collaborateur-->
                            <h3>Collaborateurs</h3>
                            <div class="desc">
                                <sql:query var="coll" dataSource="${bd}">select * from collaborateur</sql:query>
                                <c:forEach items="${coll.rows}" var="collab">
                                <div class="details">
                                    <p><a href="#"><c:out value="${collab.NomPrenom}"/></a><br>
                                    <muted><c:out value="${collab.Disponibilite}"/></muted>
                                    </p>
                                </div>
                                </c:forEach>
                            </div>      
                        </div>
                    </div>
                </section>
            </section>
            <footer class="sticky-footer">
                <div class="container">
                    <div class="text-center">
                        <small>Copyright © K.E Saad</small>
                    </div>
                </div>
            </footer>
        </section>
        <div id="freecssfooter">
            <div id="fcssholder">
                <div id="bsap_2365" class="bsarocks bsap_b893e54e42ad5b76e7b252f59be18e67"></div>
                <div id="bsap_1635" class="bsarocks bsap_b893e54e42ad5b76e7b252f59be18e67"></div>
            </div>
    </body>
</html>
<script src="js/jquery.js"></script> 
<script src="js/jquery-1.8.3.min.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.dcjqaccordion.2.7.js" class="include"></script> 
<script src="js/jquery.scrollTo.min.js"></script> 
<script src="js/jquery.nicescroll.js"></script> 
<script src="js/jquery.sparkline.js"></script> 
<script src="js/common-scripts.js"></script> 
<script src="js/jquery.gritter.js"></script> 
<script src="js/gritter-conf.js"></script> 
<script src="js/sparkline-chart.js"></script> 
<script src="js/zabuto_calendar.js"></script> 
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAKFWBqlKAGCeS1rMVoaNlwyayu0e0YRes"></script>
	<script src="js/map-custom.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script>

