/**
 * 
 */
$(function(){
				//아이디 필드에 포커스가 빠져나갈때 실행되는 이벤트 함수
				$('input[name=id]').focusout(function() {
					var tag = $(this);
					//this는 바로위 input[name=id]를 말한다
					var uid = tag.val();
					
					//AJAX통신(부분통신) 시작
					$.ajax({
						url: './proc/checkUid.jsp?uid='+uid,
						type: 'get',
						dataType: 'json',
						success: function(data){
							if(data.result == 1){
								$('.resultId').css('color','red').text('이미 사용 중인 아이디입니다.');
								tag.focus();
							}else{
								$('.resultId').css('color','green').text('사용 가능한 아이디입니다.');
							}
						}
					});
				});
				
				//닉네임 중복체크
				$('input[name=nick]').focusout(function() {
					var tag = $(this);
					//this는 바로위 input[name=nick]를 말한다
					var nick = tag.val();
					
					//AJAX통신(부분통신) 시작
					$.ajax({
						url: './proc/checkNick.jsp?nick='+nick,
						type: 'get',
						dataType: 'json',
						success: function(data){
							if(data.result == 1){
								$('.resultNick').css('color','red').text('이미 사용 중인 별명입니다.');
								tag.focus();
							}else{
								$('.resultNick').css('color','green').text('사용 가능한 별명입니다.');
							}
						}
					});
				});
				
				//이메일 중복체크
				
				$('input[name=email]').focusout(function() {
					var tag = $(this);
					//this는 바로위 input[name=nick]를 말한다
					var email = tag.val();
					
					//AJAX통신(부분통신) 시작
					$.ajax({
						url: './proc/checkEmail.jsp?email='+email,
						type: 'get',
						dataType: 'json',
						success: function(data){
							if(data.result == 1){
								$('.resultEmail').css('color','red').text('이미 사용 중인 이메일입니다.');
								tag.focus();
							}else{
								$('.resultEmail').css('color','green').text('사용 가능한 이메일입니다.');
							}
						}
					});
				});
				//휴대폰 중복체크
				$('input[name=hp]').focusout(function() {
					var tag = $(this);
					//this는 바로위 input[name=nick]를 말한다
					var hp = tag.val();
					
					//AJAX통신(부분통신) 시작
					$.ajax({
						url: './proc/checkHp.jsp?hp='+hp,
						type: 'get',
						dataType: 'json',
						success: function(data){
							if(data.result == 1){
								$('.resultHp').css('color','red').text('이미 사용 중인 전화번호입니다.');
								tag.focus();
							}else{
								$('.resultHp').css('color','green').text('사용 가능한 전화번호입니다.');
							}
						}
					});
				});
			});