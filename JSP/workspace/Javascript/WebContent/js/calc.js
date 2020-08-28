function test(a,b){
		
		var sum = 0;
		for(var i = 0; i<=20; i++){
			if(i%a!=0 && i%b!=0){
				sum+=i;
			}			
		}
		return sum;
	}

	var a = parseInt(prompt("숫자를 입력하시오."));
	var b =parseInt(prompt("숫자를 입력하시오."))
	
	
	console.log("총합 : " + test(a, b));