var userNamePasswordMandate= document.getElementById("userNamePassword")
    var userName= document.getElementById("user_Name")
    var password= document.getElementById("pass_word")

    function check(){
        if(userName.length == 0 && password.length == 0){
         userNamePasswordMandate.innerHTML = "<font color=red>Username and Password are mandatory</font>" 
         return false
        }
    else if(userName.length==0){
        userName.innerHTML="<font color=red>Username is mandatory</font>"
        
        return false
    }
    else{
        password.innerHTML="<font color=red>Password are mandatory</font>"
        return false
    }
    
    if(password.length<6 && password.length>12 && password.charAt(0)!="A"){
        password.innerHTML="<font color=red>Password Specification should be maintained</font>"
        return false
    }
    }