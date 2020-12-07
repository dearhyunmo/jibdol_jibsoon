<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!DOCTYPE html>
<html
  lang="ko-KR"
  class="html_stretched responsive av-preloader-disabled html_header_top html_logo_left html_main_nav_header html_menu_right html_custom html_header_sticky_disabled html_header_shrinking_disabled html_mobile_menu_tablet html_header_searchicon_disabled html_content_align_center html_header_unstick_top_disabled html_header_stretch_disabled html_minimal_header html_av-overlay-side html_av-overlay-side-classic html_av-submenu-noclone html_entry_id_2 av-no-preview html_text_menu_active"
>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="icon" href="/favicon.ico">
    <title>jibdol_jibsoon_vue</title>
    <script src="./js/jquery-2.2.4.min.js"></script>
    <script src="./js/owl.carousel.js"></script>
    <script src="./js/validcheck.js"></script>
    <script src="./js/main.js"></script>
    <script src="./js/pjax.js"></script>
    <script src="./js/jquery.pjax.js"></script>
    <link rel="stylesheet" type="text/css" href="./css/hway.css" />
    <script src="./js/animation.js"></script>
    <link rel="stylesheet" href="./css/animation.css" />
    <script src="./js/jquery.fullPage.js"></script>
    <script src="./js/TweenMax.min.js"></script>
    <script src="./js/cursor.js"></script>
    <script src="./js/highlight.js"></script>
    <script src="./js/jquery.form.min.js"></script>
    <link rel="stylesheet" href="./js/owl.carousel.css" />
    <style type="text/css">
      img.wp-smiley,
      img.emoji {
        display: inline !important;
        border: none !important;
        box-shadow: none !important;
        height: 1em !important;
        width: 1em !important;
        margin: 0 0.07em !important;
        vertical-align: -0.1em !important;
        background: none !important;
        padding: 0 !important;
      }
    </style>
    <link
      rel="stylesheet"
      id="contact-form-7-css"
      href="./css/style.css"
      type="text/css"
      media="all"
    />
    <link rel="stylesheet" id="avia-grid-css" href="./css/grid.css" type="text/css" media="all" />
    <link rel="stylesheet" id="avia-base-css" href="./css/base.css" type="text/css" media="all" />
    <link rel="stylesheet" id="avia-layout-css" href="./css/layout.css" type="text/css" media="all" />
    <link
      rel="stylesheet"
      id="avia-scs-css"
      href="./css/shortcodes.css"
      type="text/css"
      media="all"
    />
    <link rel="stylesheet" id="avia-print-css" href="./css/print.css" type="text/css" media="print" />
    <link rel="stylesheet" id="avia-custom-css" href="./css/custom.css" type="text/css" media="all" />
    <style type="text/css" media="screen">
      #top #header_main > .container,
      #top #header_main > .container .main_menu .av-main-nav > li > a,
      #top #header_main #menu-item-shop .cart_dropdown_link {
        height: 117px;
        line-height: 117px;
      }
      .html_top_nav_header .av-logo-container {
        height: 117px;
      }
      .html_header_top.html_header_sticky #top #wrap_all #main {
        padding-top: 115px;
      }
    </style>
    <style type="text/css">
      .recentcomments a {
        display: inline !important;
        padding: 0 !important;
        margin: 0 !important;
      }
    </style>
    <style type="text/css">
      @font-face {
        font-family: 'entypo-fontello';
        font-weight: normal;
        font-style: normal;
        src: url('./fonts/entypo-fontello30f4.eot');
        src: url('./fonts/entypo-fontello30f4.eot') format('embedded-opentype'),
          url('./fonts/entypo-fontello30f4.woff') format('woff'),
          url('./fonts/entypo-fontello30f4.ttf') format('truetype'),
          url('./fonts/entypo-fontello30f4.svg') format('svg');
      }
      #top .avia-font-entypo-fontello,
      body .avia-font-entypo-fontello,
      html body [data-av_iconfont='entypo-fontello']:before {
        font-family: 'entypo-fontello';
      }
    </style>
    <link href="./js/app.eef7d33b.js" rel="preload" as="script">
    <link href="./js/chunk-vendors.ddd9febf.js" rel="preload" as="script">
    
</head>

<body id="top" class="home page page-id-2 page-template-default stretched helvetica-neue-websave _helvetica_neue" itemscope itemtype="https://schema.org/WebPage"><noscript><strong>We're sorry but jibdol_jibsoon_vue doesn't work properly without JavaScript enabled. Please enable it to continue.</strong></noscript>

    <div id="app"></div>
    <script src="./js/chunk-vendors.ddd9febf.js"></script>
    <script src="./js/app.eef7d33b.js"></script>
	    <script>
		<% String sess = (String) session.getAttribute("user");

	if(sess == null){
		%>
		$(function(){
			$(window).load(function(){
					$('.no-login').show();
					$('.login').hide();
					$('.admin').hide();
					console.log("1");
			});
		});
			<%
}	else if(sess!=null){%>
		//$(function(){
		//	$('.no-login').hide();
		//	$('.login').show();
		//});
		<%if(sess.equals("admin")){%>
					$(function(){
						$(window).load(function(){
							$('.no-login').hide();
							$('.login').show();
							console.log("2");
							var test = $('table.admin');
							console.log(test);
								$('.admin').show();
								$('.no-admin').hide();
						});
					});
			<%} else {  %>
			$(function(){
				$(window).load(function(){
					$('.no-login').hide();
					$('.login').show();
					console.log("3");
					
					var userid = '<c:out value="${user}"/>';
					console.log(userid);
					$('.admin').hide();
					$('.no-admin').show();
					$('.user-infos').attr("href", "/jds/userinfo?userid="+userid);
				});
			});
		<%}
}%>
	    </script>
</body>

</html>