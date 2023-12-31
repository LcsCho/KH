# EL / JSTL

스프링에서 JSP를 이용해서 화면을 보여줄 때
필요한 처리를 담당하는 도구 또는 언어를 말함

# EL

컨트롤러에서 처리한 뒤 모델에 담겨 오는 데이터를 JSP에 원하는 위치에 출력하려고 할 때 사용하는 언어


```jsp
${이름}
```

# JSTL

JSP 표준 태그 라이브러리(Jsp Standard Tag Library).
Jsp 페이지에서 필요한 프로그래밍 처리를 수행하는 태그.

- 변수 생성 - `<c:set>`
- 조건 - `<c:if>`, `<c:choose>`
- 반복 - `<c:forEach>`

사용하려면 JSP 페이지에 다음과 같은 설정을 해야 한다

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```

## 조건

조건이 한 개일 때는 `<c:if>`를 사용한다

```xml
<c:if test="조건식">

</c:if>
```

조건이 여러 개 일 때는 `<c:choose>`를 사용한다

```xml
<c:choose>
	<c:when test="${a == 10}">
	
	</c:when>
	<c:when test="조건식2">
	
	</c:when>
	<c:when test="조건식1=3">
	
	</c:when>
	...
	<c:otherwise>
	
	</c:otherwise>
</c:choose>
```

## 주의사항
조건식은 `EL`로 작성한다.