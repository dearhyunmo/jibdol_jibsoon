<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<header
        id="header"
        class="all_colors header_color light_bg_color av_header_top av_logo_left av_main_nav_header av_menu_right av_custom av_header_sticky_disabled av_header_shrinking_disabled av_header_stretch_disabled av_mobile_menu_tablet av_header_searchicon_disabled av_header_unstick_top_disabled av_minimal_header av_bottom_nav_disabled av_alternate_logo_active av_header_border_disabled"
        role="banner"
        itemscope="itemscope"
        itemtype="https://schema.org/WPHeader"
      >
        <div id="header_main" class="container_wrap container_wrap_logo">
          <div class="container av-logo-container">
            <div class="inner-container">
              <span class="logo"
                ><a href="index"><img height="100" width="300" src="resources/img/logo.png" alt="MUSIGN" /></a
              ></span>
              <nav
                class="main_menu"
                data-selectname="Select a page"
                role="navigation"
              >
                <div class="avia-menu av-main-nav-wrap">
                  <ul id="avia-menu" class="menu av-main-nav">
                    <li
                      id="menu-item-11"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-1"
                    >
                      <a href="intro" 
                        ><span class="avia-bullet"></span
                        ><span class="avia-menu-text">집돌&집순</span
                        ><span class="avia-menu-fx"
                          ><span class="avia-arrow-wrap"
                            ><span class="avia-arrow"></span></span></span
                      ></a>
                    </li>
                    <li
                      id="menu-item-12"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-2"
                    >
                      <a href="houses" 
                        ><span class="avia-bullet"></span><span class="avia-menu-text">HH 매물</span
                        ><span class="avia-menu-fx"
                          ><span class="avia-arrow-wrap"
                            ><span class="avia-arrow"></span></span></span
                      ></a>
                    </li>
		     		 <c:if test="${empty user }">
	                    <li
	                      id="menu-item-14"
	                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-4"
	                    >
	                      <a href="login" 
	                        ><span class="avia-bullet"></span><span class="avia-menu-text">HH 상권</span
	                        ><span class="avia-menu-fx"
	                          ><span class="avia-arrow-wrap"
	                            ><span class="avia-arrow"></span></span></span
	                      ></a>
	                    </li>
	                    <li
	                      id="menu-item-14"
	                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-4"
	                    >
	                      <a href="login" 
	                        ><span class="avia-bullet"></span><span class="avia-menu-text">교통 상황</span
	                        ><span class="avia-menu-fx"
	                          ><span class="avia-arrow-wrap"
	                            ><span class="avia-arrow"></span></span></span
	                      ></a>
	                    </li>
		     		 </c:if>
		     		 <c:if test="${not empty user }">	
	                    <li
	                      id="menu-item-14"
	                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-4"
	                    >
	                      <a href="commercial" 
	                        ><span class="avia-bullet"></span><span class="avia-menu-text">HH 상권</span
	                        ><span class="avia-menu-fx"
	                          ><span class="avia-arrow-wrap"
	                            ><span class="avia-arrow"></span></span></span
	                      ></a>
	                    </li>
	                    <li
	                      id="menu-item-14"
	                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-4"
	                    >
	                      <a href="traffic" 
	                        ><span class="avia-bullet"></span><span class="avia-menu-text">교통 상황</span
	                        ><span class="avia-menu-fx"
	                          ><span class="avia-arrow-wrap"
	                            ><span class="avia-arrow"></span></span></span
	                      ></a>
	                    </li>
		     		 </c:if>
                    <li
                      id="menu-item-2221"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-6"
                    >
                      <a href="faq" 
                        ><span class="avia-bullet"></span><span class="avia-menu-text">FAQ</span
                        ><span class="avia-menu-fx"
                          ><span class="avia-arrow-wrap"
                            ><span class="avia-arrow"></span></span></span
                      ></a>
                    </li>
                    <li
                      id="menu-item-16"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-7"
                    >
                      <a href="/jds/resources/index.jsp" 
                        ><span class="avia-bullet"></span
                        ><span class="avia-menu-text">공지사항</span
                        ><span class="avia-menu-fx"
                          ><span class="avia-arrow-wrap"
                            ><span class="avia-arrow"></span></span></span
                      ></a>
                    </li>
                    <li
                      id="menu-item-16"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level menu-item-top-level-7"
                    >
                      <a href="contactus" 
                        ><span class="avia-bullet"></span
                        ><span class="avia-menu-text">Contact us</span
                        ><span class="avia-menu-fx"
                          ><span class="avia-arrow-wrap"
                            ><span class="avia-arrow"></span></span></span
                      ></a>
                    </li>
                  </ul>
                  <c:if test="${empty user}">
                  <ul id="avia-user" class="menu av-main-nav">
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                      <a href="login" class="menu-user">로그인</a>
                    </li>
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                      <a class="menu-text">/</a>
                    </li>
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                      <a href="signup" class="menu-user">회원가입</a>
                    </li>
                  </ul>
                  </c:if>
                  <c:if test="${not empty user }">
                  <ul id="avia-user" class="menu av-main-nav">
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                    <c:if test="${user != 'admin'}">
                      <a href="userinfo?userid=${user}">회원 정보</a>
                      </c:if>
                      <c:if test="${user eq 'admin'}">
                      <a href="userlist">회원 목록</a>
                      </c:if>
                    </li>
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                      <a class="menu-text">/</a>
                    </li>
                    <li
                      id="menu-item-818"
                      class="menu-item menu-item-type-custom menu-item-object-custom menu-item-top-level"
                    >
                      <a href="logout">로그아웃</a>
                    </li>
                  </ul>
                  </c:if>
                  
                </div>
              </nav>
            </div>
          </div>
          <!-- end container_wrap-->
        </div>

        <div class="header_bg"></div>

        <!-- end header -->
      </header>