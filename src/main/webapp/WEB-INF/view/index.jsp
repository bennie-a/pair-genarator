<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Pair-Generator</title>
<link
	href="//netdna.bootstrapcdn.com/bootswatch/3.0.1/amelia/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1 id="type">Pair-Generator</h1>
		</div>
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<s:form method="POST" styleClass="bs-example form-horizontal">
					<fieldset>
						<h3>名前を入力してください</h3>
						<div class="form-group">
							<div class="col-lg-5 input-group">
								<html:text property="name" styleClass="form-control" />
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">Button</button>
								</span>
							</div>
						</div>
						<div class="form-group" style="margin-top: 50px">
							<div class="col-lg-10 col-lg-offset-2">
								<s:submit styleClass="btn btn-primary" property="generate"
									value="ペアを作成する" />
							</div>
						</div>
					</fieldset>
				</s:form>
			</div>
		</div>
		<div class="row">
			hello! ${message}
			<c:forEach items="${hogeList}" var="hoge">
				${hoge.aaa}<br />
			</c:forEach>
		</div>
	</div>
</body>
</html>
