<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/all.css"/>
<style type="text/css">
</style>
<script type="text/javascript">


function postnumercheck(){

	var flag = 0;


	// 設定開始（チェックする項目を設定してください）

	if(document.form2.post1.value.match(/[^0-9]+/)){

		flag = 1;

	}
	else if(document.form2.post2.value.match(/[^0-9]+/)){

		flag = 1;

	}

	// 設定終了


	if(flag){

		window.alert('数字以外が入力されています'); // 数字以外が入力された場合は警告ダイアログを表示
		return false; // 送信を中止

	}
	else{

		return true; // 送信を実行

	}

}




function logincheck(){

	var flag = 0;


	// 設定開始（必須にする項目を設定してください）

	if(!document.form1.field1.value == "LIU"){ // 「お名前」の入力をチェック

		flag = 1;

	}
	else if(!document.form1.field2.value == "12345"){ // 「パスワード」の入力をチェック

		flag = 1;

	}
	else if(!document.form1.field3.value == "AI"){ // 「コメント」の入力をチェック

		flag = 1;

	}

	// 設定終了


	if(flag){

		window.alert('必須項目に未入力がありました'); // 入力漏れがあれば警告ダイアログを表示
		return false; // 送信を中止

	}
	else{

		return true; // 送信を実行

	}

}

</script>
<title>Insert title here</title>
</head>
<body>
	<center>
		<img src="./images/header.jpg" />
	</center>
	<h1 align="center">
		<a href="all" rel="external nofollow" rel="external nofollow">进入学員管理主页</a>
	</h1>
	<form method="POST" action="all" name="form1" onSubmit="return logincheck()">

		<p>
			お名前：<br>
			<input type="text" name="LIU" size="30"> （必須）
		</p>
		<p>
			パスワード：<br>
			<input type="password" name="12345" size="30"> （必須）
		</p>
		<p>
			コメント：<br>
			<textarea name="AI" rows="5" cols="30"></textarea>
			（必須）
		</p>
		<p>
			<input type="submit" value="送信">
		</p>
	</form>

	<form method="POST" action="all" name="form2"
		onSubmit="return postnumercheck()">

		<p>
			〒：<input type="text" name="post1" size="3"> - <input
				type="text" name="post2" size="4"> （半角数字で）
		</p>
		<p>
			<input type="submit" value="送信">
		</p>

	</form>



	<form action="">
		<p>
			<span>Smile!</span>
		</p>
		<p>
			いつも.Smile!<br> 重要です.
		</p>
		<h2>Smile!</h2>
		<h3>Smile!</h3>
		<h4>Smile!</h4>
		<h5>Smile!</h5>
		<h6>Smile!</h6>

		<a href="http://www.apple.com/">apple</a> <img src="./images/bing.png" />


		<a href="http://yahoo.co.jp/">yahoo</a> <img
			src="./images/u=594620135,2215850631&fm=58.jpg" />


		<table border="1px" cellpadding="10px"
			style="border-collapse: collapse;">
			<tr>
			<tr bgcolor="#0099cc">
				<th>ID</th>
				<th>名前</th>
				<th>生年月日</th>
				<th>年齢</th>
				<th>成績</th>
				<th>クラス</th>
				<th>マイナンバー</th>
				<th>住所</th>
			</tr>
			<tr bgcolor="#ffc7af">
				<td>1</td>
				<td>LIU</td>
				<td>1990-09-21</td>
				<td>28</td>
				<td>80</td>
				<td>3</td>
				<td>56245</td>
				<td>東京都</td>
			</tr>
			<tr>
				<td>2</td>
				<td bgcolor="#0099cc">LIN</td>
				<td>1993-11-2</td>
				<td>25</td>
				<td>76</td>
				<td>4</td>
				<td>45697</td>
				<td>千葉県</td>
			</tr>
			<tr>
				<td>3</td>
				<td>ZHANG</td>
				<td>1999-09-29</td>
				<td>18</td>
				<td>85</td>
				<td>2</td>
				<td>45678</td>
				<td>埼玉県</td>
			</tr>

		</table>

		<form>
			<input type="text"><br> <input type="text"> <br>
			<input type="checkbox">住所 <br> <input type="radio"
				name="address" value="0">東京都 <input type="radio"
				name="address" value="1">埼玉県 <br> <select>
				<option value="0">東京都</option>
				<option value="2">埼玉県</option>
				<option value="3">千葉県</option>
			</select> <br>
			<textarea placeholder="住所を入力してください"></textarea>
			<br> <label> <input type="checkbox">このサイトは役に立った
			</label> <br> <input type="submit"> <br>
			<p>順番なし
			<ul>
				<li>アメリカ</li>
				<li>イギリス</li>
				<li>フランス</li>
				<li>ロシア</li>
				<li>中国</li>
				<li>韓国</li>
				<li>ベトナム</li>
			</ul>
			順番あり
			<ol>
				<li>アメリカ</li>
				<li>イギリス</li>
				<li>フランス</li>
				<li>ロシア</li>
				<li>中国</li>
				<li>韓国</li>
				<li>ベトナム</li>
			</ol>
			引用したい
			<blockquote>ほら、足元を見てごらん、これがあなたの歩む道</blockquote>
			引用しました
			</P>
			<code>
				<pre>
			ほら
			足元を見てごらん
			これが
			あなたの歩む道

			</pre>


			</code>

			<ruby> 一番 <rt>イチバン</rt> </ruby>
			<br> <br> <br>
			 勉強は<strong>一番</strong>大事です。
			 <br> <br> <br>
			 勉強は<i>とても</i>大事です。<br>
			 勉強はとても大事です。



		</form>


	</form>







</body>

</html>