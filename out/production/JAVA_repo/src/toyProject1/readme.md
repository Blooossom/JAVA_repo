<h1>Index</h1>
<p>
<div>
<h1>1. 연결구조 생각하기</h1>
<ul>
<h3>역순으로 올라가서 생각해보면, 먼저 처음 콘솔을 실행했을 때 나타나는 메뉴창의 설계가 필요함
</h3>
<h3>이 메뉴창은 사용자로부터 입력을 받아 CustomerMenu(이하 Cmenu),ParameterMenu(이하 Pmenu), SummaryMenu(이하 Smenu)로 연결됨
</h3>
<h3>즉 Menu Package에는 Cmenu, Pmenu, Smenu가 필요
</h3>
<h3>각각 Cmenu에서는 고객의 정보를 추가하거나, 업데이트하거나, 삭제하거나 보는 기능이 추가됨
</h3>
<h3>이 부분은 Cmenu내에 메서드/함수 등으로 구현하면 될 듯, Pmenu, Smenu 내부 기능도 동일하게
</h3>
</ul>
</div>

<p>
<div>
<h1>2. Customer Package 설계</h1>
<h2>Cmenu의 기능을 위한 준비 (연계되는 클래스)</h2>
<ol>
<h3><li>고객의 정보(이름, ID, 이용시간, 소비금액, 그룹, ++시리얼넘버도 필요할듯, 왜? 고객 구분해야 하니까)</li></h3>
<h3><li>고객 객체 배열 다룰 Customers도 하나 만들어야 함</li></h3>
<h3><li>고객 일련번호 > 자동생성이라고 함</li></h3>
</ol>
</div>

<p>
<div>
<h1>3. Group Package 설계</h1>
<h2>Pmenu의 기능을 위한 준비(연계되는 클래스)</h2>
<ol>
<h3><li>Parameter메뉴는 뭘 하는가? > 고객의 분류 기준과 관련</li></h3>
<h3><li>Pmenu에서는 각 그룹을 기준으로 파라미터를 설정함</li></h3>
<h3><li>Parameter에 영향가는 것은 최소시간, 최소금액 > parameter클래스에 설정하기</li></h3>
<h3><li>그룹 설정도 필요 > enum 사용해서 general, vip, vvip 설정</li></h3>
<h3><li>group,groups클래스 말고도 enum형의 groupType클래스, Parameter클래스 까지가 groupPackage들어갈듯</li></h3>
<h3><li>Group클래스</li></h3>
<ul>
<h4><li>group클래스는 parameter와 groupType을 통해 구분되어야함</li></h4>
<h4><li>즉 parameter에 따라 그룹의 타입이 정해지는?</li></h4>
<h4><li>따라서 group클래스 변수는 그룹타입, 파라미터</li></h4>
</ul>
</ol> 
</div>

<p>
<div>
<h1>4. Menu Package 설계</h1>
<ul>
<h4><li>아래 메뉴들 >> Menu파일 상속받기>>입력 때문에</li></h4>
<h4><li>각 메뉴의 실행은 만약 예외가 발생했을 때 종료되면 안됨</li></h4>
<h4><li>올바른 값을 입력받을 때까지 반복 > while문 사용하기</li></h4>
<h4><li>while문 내부에 try/catch 사용하고,</li></h4>
<h4><li>try블럭에 메뉴 입력>입력값 비교>올바를 경우 그 값 리턴하기</li></h4>
<h4><li>view Parameter 시 그룹 찾아다가 그거 출력해줘야함</li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>

<h4><li></li></h4>
</ul>
<ol>
<h3><li>Pmenu 내부 기능</li></h3>
<ul>
<h4><li>입력받고 > 입력 받은 번호를 통한 메서드 실행하기</li></h4>
<h4><li>모든 메뉴 실행하면 처음 뜨는 것이 그룹선택하는 창임</li></h4>
<h4><li>따라서 그룹 선택하는 것도 만들어야함</li></h4>
<h4><li>123번 메뉴 모두 위에서 선택한 것을 받아서 진행</li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>

</ul>
<h3><li>Cmenu 내부 기능</li></h3>
<ul>
<h4><li>입력받고 > 입력 받은 번호를 통한 메서드 실행하기</li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>

</ul>
<h3><li>Smenu 내부 기능</li></h3>
<ul>
<h4><li>기본 디스플레이 > 그냥 작성하면 될 것 같음</li></h4>
<h4><li>입력받고 > 입력 받은 번호를 통한 메서드 실행하기</li></h4>
<h4><li>이름/소비금액/소비시간 각각 구현 필요함</li></h4>
<h4><li>단 하나의 메뉴당 메서드/함수 하나씩 필요</li></h4>
<h4><li>이거 근데 정렬하는 거 따로 넣어야 할 것 같음</li></h4>
<h4><li>이름으로 하는 건 Arrays.sort쓴다고 치고</li></h4>
<h4><li>소비시간, 이용금액은? >> comparator쓰면 될듯? 이름도 마찬가지겠고</li></h4>
<h4><li>이거 보니까 고객 분류하고(그룹별로) > 분류한 고객을 그룹마다 출력하는 것</li></h4>
<h4><li>그룹이랑도 관련있고, customer랑도 관련있음.</li></h4>
<h4><li>others있는 것 보니까 그룹아닌것도 있는 듯 > 그룹타입 추가하기</li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>
<h4><li></li></h4>



</ul>
<h3><li>sortType구현</li></h3>
<ul>
<h4><li>Sort방식 정해야함>오름차순, 내림차순</li></h4>
<h4><li>sort방식 > enum형으로 정의하기</li></h4>
<h4><li>이거 나중에 호출해다가 equals써서 비교하고 정렬하면 될듯</li></h4>
</ul>
<h3><li>기본 Menu 구현</li></h3>
<h3><li>연계</li></h3>
</ol>
</div>
<p>
<div>
<h1>5. 발생할 수 있는 예외</h1>
<ol>
<h3><li>입력창에 맞지 않는 타입(정수요구에 문자 등)</li></h3>
<h3><li>정수 범위 벗어나는 것(인덱스 초과)</li></h3>
<h3><li>빈 입력 받았을 때</li></h3>
<h3><li></li></h3>

</ol>
</div>
<p>
<div>
<h1>6. 실행 후 오류 점검</h1>
</div>
