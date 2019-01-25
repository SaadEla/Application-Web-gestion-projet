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
        <link rel="stylesheet" type="text/css" href="style/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="style/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="style/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="style/jquery.gritter.css">
        <link rel="stylesheet" type="text/css" href="style/lineicons.css">
        <link rel="stylesheet" type="text/css" href="style/style.css">
        <link rel="stylesheet" type="text/css" href="style/style-responsive.css">
        <link rel="stylesheet" type="text/css" href="style/Accueil.css">
        <script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/4FEF4FD4-202B-164C-A9EF-E2CEBA04C76B/main.js" charset="UTF-8"></script><script src="assets/js/Chart.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <section id="container" >
            <header class="header black-bg" >
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <a href="accueilcollaborateur.jsp" class="logo" style="font-family: Times New Roman ,fantasy;font-size:200%;font-style: normal;font-weight: bolder; "><b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSTRATON</b></a>
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
                                <li> <a href="messagerieco">  <span class="subject"> <span class="from">${data.Source}</span> <span class="time"></span> </span> <span class="message"> ${data.contenu}</span> </a> </li>
                                </c:forEach>
                                <li> <a href="messagerieco">Voir tout.</a> </li>
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
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <ul class="sidebar-menu" id="nav-accordion">
                        <p class="centered"><a href="accueilcollaborateur.jsp"><img src="images/saad.png" alt="website template image" width="60" class="img-circle"></a></p>
                        <h5 class="centered">K.E Saad</h5>
                        <li class="mt"> <a  href="profile co.jsp"> <i class="fa fa-drivers-license-o"></i> <span>Page Personnelle</span> </a> </li>
                        <li class="mt"> <a  href="actualite"> <i class="fa fa-comments-o"></i> <span>Mur Actualite</span> </a> </li>
                        <li class="mt"> <a  href="modtache"> <i class="fa fa-user-plus"></i> <span>Tache</span> </a> </li>
                    </ul>
                </div>
            </aside>
            <section id="main-content">
                <!-- Main Contenu -->
                <section class="wrapper">
                    <div class="row">
                        <!--1er colonne-->
                        <div class="col-sm-3 col-md-6 col-lg-4">
                            <img src="images/profile.png" alt="profilepicture"></br></br></br>
                            <sql:setDataSource var="bd" scope="request" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" user="root" password="" />
                            <!--CDT sur le type Administrateur-->
                            <c:choose> 
                                <c:when test="<%=request.getParameter("fonction").equals("administrateur")%>">
                                    <sql:query var="resultat" dataSource="${bd}">select * from administrateur where Nom='<%= request.getParameter("Nom")%>' and Prenom='<%= request.getParameter("Prenom")%>'</sql:query> 
                                    <c:forEach items="${resultat.rows}" var="data">
                                        <c:choose> 
                                            <c:when test="<%=request.getParameter("Disponibilite").equals("Disponible")%>">
                                                <p>Disponibilité:<b style="color:#40FF00;"><c:out value='${data.Disponibilite}'/></b></p> 
                                            </div></br>
                                        </c:when>
                                        <c:otherwise>
                                            <p>Disponibilité:<b style="color:#FF0000;"><c:out value='${data.Disponibilite}'/></b></p> 
                                        </div></br>                                               
                                        </c:otherwise>
                                        </c:choose>
                                <!--2eme colonne-->
                                <div class="col-sm-9 col-md-6 col-lg-8">
                                    <center><h2>Informations Personnelles</h2></center>
                                    <ul>
                                        <li> <i class="fa fa-address-book" style="font-size:30px"></i><span style="font-size:20px"><b>Nom et Prenom:</b>&nbsp;&nbsp;<c:out value="${data.Nom}"/>&nbsp;<c:out value="${data.Prenom}"/></span></li>
                                        <li><i class="fa fa-calendar" style="font-size:30px"></i><span style="font-size:20px"><b>Date de Naissance:</b>&nbsp;&nbsp;<c:out value="${data.DateNaissance}"/></span></li>
                                        <li> <i  class="fa fa-home" style="font-size:30px"></i> <span style="font-size:20px"><b>Adresse:</b>&nbsp;&nbsp;<c:out value="${data.Adresse}"/></span> </li>
                                        <li> <i  class="fa fa-phone" style="font-size:30px"></i> <span style="font-size:20px"><b>Telephone:</b>&nbsp;&nbsp;<c:out value="${data.Telephone}"/></span> </li>
                                        <li> <i class="fa fa-envelope" style="font-size:30px"></i> <span style="font-size:20px"><b>Email:</b>&nbsp;&nbsp;<c:out value="${data.Email}"/></span> </li>
                                    </ul>
                                    <center><h2>Formation</h2></center>
                                    <span style="font-size: 25px;">Dernier Diplome:</span>
                                    <ul>
                                        <li style="font-size: 20px;"><b style="width: 50px;"><u>Intitulé:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.Diplome}"/></li>
                                        <li style="font-size: 20px;"><b><u>Année d'obtention:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.AnneeObtention}"/></li>
                                        <li style="font-size: 20px;"><b><u>Etablissement:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.Etablissement}"/></li>
                                    </ul>
                                    <center><h2>Competences</h2></center>
                                    <center style="font-size: 20px;"><c:out value="${data.Competence}"/></center></div>
                                    </c:forEach>
                                </c:when>

                            <c:when test="<%=request.getParameter("fonction").equals("chef de projet")%>">
                                <sql:query var="resultat" dataSource="${bd}">select * from chefdeprojet where NomPrenomChef='<%= request.getParameter("NomPrenom")%>'</sql:query> 
                                <c:forEach items="${resultat.rows}" var="data">
                                    <c:choose> 
                                        <c:when test="<%=request.getParameter("Disponibilite").equals("Disponible")%>">
                                            <p>Disponibilité:<b style="color:#40FF00;"><c:out value='${data.DisponibiliteChef}'/></b></p> 
                                        </div></br>
                                    </c:when>
                                    <c:otherwise>
                                        <p>Disponibilité:<b style="color:#FF0000;"><c:out value='${data.DisponibiliteChef}'/></b></p> 
                                        </div></br>                                               
                                    </c:otherwise>
                                </c:choose>

                                <!--2eme colonne test Chef-->
                                <div class="col-sm-9 col-md-6 col-lg-8">
                                    <center><h2>Informations Personnelles</h2></center>
                                    <ul>
                                        <li> <i class="fa fa-address-book" style="font-size:30px"></i><span style="font-size:20px"><b>Nom et Prenom:</b>&nbsp;&nbsp;<c:out value="${data.NomPrenomChef}"/></span></li>
                                        <li><i class="fa fa-calendar" style="font-size:30px"></i><span style="font-size:20px"><b>Date de Naissance:</b>&nbsp;&nbsp;<c:out value="${data.DateNaissanceChef}"/></span></li>
                                        <li> <i  class="fa fa-home" style="font-size:30px"></i> <span style="font-size:20px"><b>Adresse:</b>&nbsp;&nbsp;<c:out value="${data.AdresseChef}"/></span> </li>
                                        <li> <i  class="fa fa-phone" style="font-size:30px"></i> <span style="font-size:20px"><b>Telephone:</b>&nbsp;&nbsp;<c:out value="${data.TelephoneChef}"/></span> </li>
                                        <li> <i class="fa fa-envelope" style="font-size:30px"></i> <span style="font-size:20px"><b>Email:</b>&nbsp;&nbsp;<c:out value="${data.EmailChef}"/></span> </li>
                                    </ul>
                                    <center><h2>Formation</h2></center>
                                    <span style="font-size: 25px;">Dernier Diplome:</span>
                                    <ul>
                                        <li style="font-size: 20px;"><b style="width: 50px;"><u>Intitulé:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.DiplomeChef}"/></li>
                                        <li style="font-size: 20px;"><b><u>Année d'obtention:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.AnneeObtentionChef}"/></li>
                                        <li style="font-size: 20px;"><b><u>Etablissement:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.EtablissementChef}"/></li>
                                    </ul>
                                    <center><h2>Competences</h2></center>
                                    <center style="font-size: 20px;"><c:out value="${data.CompetencesChef}"/></center></div>
                                    </c:forEach>
                                </c:when>
                                <c:when test="<%=request.getParameter("fonction").equals("collaborateur")%>">
                                    <sql:query var="resultat" dataSource="${bd}">select * from collaborateur where NomPrenom='<%= request.getParameter("NomPrenom")%>'</sql:query> 
                                <c:forEach items="${resultat.rows}" var="data">
                                    <c:choose> 
                                        <c:when test="<%=request.getParameter("Disponibilite").equals("Disponible")%>">
                                            <p>Disponibilité:<b style="color:#40FF00;"><c:out value='${data.Disponibilite}'/></b></p> 
                                        </div></br>
                                    </c:when>
                                    <c:otherwise>
                                        <p>Disponibilité:<b style="color:#FF0000;"><c:out value='${data.Disponibilite}'/></b></p> 
                                        </div></br>                                               
                                    </c:otherwise>
                                </c:choose>

                                <!--2eme colonne test Collaborateur-->
                                <div class="col-sm-9 col-md-6 col-lg-8">
                                    <center><h2>Informations Personnelles</h2></center>
                                    <ul>
                                        <li> <i class="fa fa-address-book" style="font-size:30px"></i><span style="font-size:20px"><b>Nom et Prenom:</b>&nbsp;&nbsp;<c:out value="${data.NomPrenom}"/></span></li>
                                        <li><i class="fa fa-calendar" style="font-size:30px"></i><span style="font-size:20px"><b>Date de Naissance:</b>&nbsp;&nbsp;<c:out value="${data.DateNaissance}"/></span></li>
                                        <li> <i  class="fa fa-home" style="font-size:30px"></i> <span style="font-size:20px"><b>Adresse:</b>&nbsp;&nbsp;<c:out value="${data.Adresse}"/></span> </li>
                                        <li> <i  class="fa fa-phone" style="font-size:30px"></i> <span style="font-size:20px"><b>Telephone:</b>&nbsp;&nbsp;<c:out value="${data.Telephone}"/></span> </li>
                                        <li> <i class="fa fa-envelope" style="font-size:30px"></i> <span style="font-size:20px"><b>Email:</b>&nbsp;&nbsp;<c:out value="${data.Email}"/></span> </li>
                                    </ul>
                                    <center><h2>Formation</h2></center>
                                    <span style="font-size: 25px;">Dernier Diplome:</span>
                                    <ul>
                                        <li style="font-size: 20px;"><b style="width: 50px;"><u>Intitulé:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.Diplome}"/></li>
                                        <li style="font-size: 20px;"><b><u>Année d'obtention:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.AnneeObtention}"/></li>
                                        <li style="font-size: 20px;"><b><u>Etablissement:</u></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${data.Etablissement}"/></li>
                                    </ul>
                                    <center><h2>Competences</h2></center>
                                    <center style="font-size: 20px;"><c:out value="${data.CompetencesChef}"/></center></div>
                                    </c:forEach>
                                </c:when>
                            </c:choose>                                
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
<!-- 

</div>
<script type="text/javascript">
var gaProperty = 'UA-120201777-1';var disableStr = 'ga-disable-' + gaProperty;if (document.cookie.indexOf(disableStr + '=true') > -1) {window[disableStr] = true;}
function gaOptout(){document.cookie = disableStr + '=true; expires=Thu, 31 Dec 2045 23:59:59 UTC; path=/';window[disableStr] = true;alert('Google Tracking has been deactivated');}
(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-120201777-1', 'auto');ga('set', 'anonymizeIp', true);ga('send', 'pageview');
</script>
<script type="text/javascript">
(function(){
  var bsa = document.createElement('script');
     bsa.type = 'text/javascript';
     bsa.async = true;
     bsa.src = '//s3.buysellads.com/ac/bsa.js';
  (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);
})();
</script>
-->