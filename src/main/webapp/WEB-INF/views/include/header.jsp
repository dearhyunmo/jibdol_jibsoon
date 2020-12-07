<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

   <div id="cursor">VIEW</div>

    <div class="black-bg"></div>
    <!-- 왼쪽 -->
    <div class="menu-left">
      <div class="ml-btn">
        <span></span>
        <span></span>
        <span></span>
      </div>

      <div class="menu-fullbg"></div>
      <div class="menu-full">
        <div class="en-txt clo-btn clo-btn01">close</div>
        <div class="cy-bg"></div>
        <div class="menu-fuwr">
          <div>
            <ul class="menu-ul">
              <li class="text-no"><a href="index">Home</a></li>
              <li class="m-li m-link"><a href="intro">집돌 집순</a></li>
              <li class="m-li m-link"><a href="houses">HH 매물</a></li>
		      <c:if test="${not empty user }">
	              <li class="m-li m-link"><a href="#">HH 상권</a></li>
	              <li class="m-li m-link"><a href="#">교통 상황</a></li>
		      </c:if>
		      <c:if test="${empty user }">
	              <li class="m-li m-link"><a href="login">HH 상권</a></li>
	              <li class="m-li m-link"><a href="login">교통 상황</a></li>
		      </c:if>
              <li class="m-li m-link"><a href="faq">FAQ</a></li>
              <li class="m-li m-link"><a href="noticelist">공지사항</a></li>
              <li class="m-li m-link"><a href="contactus">Contact us</a></li>
            </ul>
            <ul class="menu-snsul">
            <c:if test="${not empty user }">
               <c:if test="${user == 'admin'}">
               	<li><a href="userlist">회원 목록</a></li>
               </c:if>
               <c:if test="${user != 'admin' }">
               	<li><a href="userinfo?userid=${user}">${user }님</a></li>
               </c:if>
              <li><a>/</a></li>
              <li><a href="logout">로그아웃</a></li>
            </c:if>
            <c:if test="${empty user }">
              <li><a href="login">로그인</a></li>
              <li><a>/</a></li>
              <li><a href="signup">회원가입</a></li>
            </c:if>
            </ul>
          </div>
          <div class="menu-cr">
            <div class="text-ul text-center">
              <div class="text-ulwr">
                <p class="gnb-stit en-txt03 active">
                  <span class="txt-ani">Our mission is<br /></span>
                  <span class="color-cc txt-ani">introduce new values.</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">Our mission is<br /></span>
                  <span class="color-cc txt-ani">introduce new values.</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">This is real<br /></span>
                  <span class="color-cc txt-ani">Happy House List</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">If you feel good,<br /></span>
                  <span class="color-cc txt-ani">That's Perfect Day</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">Let's look traffic,<br /></span>
                  <span class="color-cc txt-ani">at Rush hour</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">If you are curious</span>
                  <span class="color-cc txt-ani">View a question</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">Something import</span>
                  <span class="color-cc txt-ani">Come to this page</span>
                </p>
                <p class="gnb-stit en-txt03">
                  <span class="txt-ani">Let's meet</span>
                  <span class="color-cc txt-ani">Dev team 94 G&J</span>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>