# IBookLeague_Booklist

Spring Project

# Description
사용자가 독서를 하기 전에 참고 하면 좋을 한국문학, 외국문학 순수 평점리스트를 확인할 수 있는 웹
사용자는 회원가입 시 평점 및 리뷰를 등록할 수 있고
마이페이지에서 관리를 할 수 있음.
비회원은 열람만 가능함.
사용자는 한 책에 대해서는 한 평점만 남길 수 있음.
리뷰는 익명처리 됨.

노벨문학상과 휴고상 목록들도 확인할 수 있음.

# How To?
1. 프로젝트를 실행하기에 앞서 반드시! testApplication의 test메서드들을 하나씩 실행해 작품 DB를 채워넣는 작업을 해야함!
2. application을 실행해 로컬서버 작동 후 웹 확인 가능

11.29 Update
- 같은 사용자가 두번 이상 평점을 입력하려고 할 때 자바스크립트로 warning 표시
- 평점 수정 range 생성
- 현재 사용자 정보 받아오는 방법 수정 -> CustomUserDetails
- 평점을 남긴 사용자가 본인의 평점에만 수정가능하도록 추가
  

11.30 Update
- 해외문학에도 적용 완료
- url 변경 list -> ranking


12.02 Update
- 외국문학 테이블 수정
  - 노벨문학상 수상여부, 휴고상 수상여부 추가
  - 외국문학 Repository, Service, Controller이 노벨상, 휴고상, 나머지 작품을 구분하도록 변경
  - 외국랭킹에 보여지는 리스트 수정 : 추가한 노벨문학상 작품 + 기존 문학상 작품

- 외국문학 책 내용 추가

- 수정사항에 따른 html 수정


12.15 Update
- 휴고 문학상 추가
  - testApplication에 데이터 추가

- Awards 수상연도보이게 html 수정


